// src/main/java/me/nathan/garagetech/item/tool/MultiLayerToolItem.java
package me.nathan.garagetech.item.custom;

import me.nathan.garagetech.Main;
import me.nathan.garagetech.material.Alloy;
import me.nathan.garagetech.material.Element;
import me.nathan.garagetech.item.NTItems;
import me.nathan.garagetech.material.IMaterial;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.RegisterColorHandlersEvent;
import net.neoforged.neoforge.registries.DeferredItem;

import javax.annotation.Nullable;
import java.util.List;

@EventBusSubscriber(modid = Main.MODID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class BaseDust extends Item {

    private final IMaterial material;
    private final String itemType; // "wire_cutter" or "screwdriver"

    public BaseDust(IMaterial material, String itemType) {
        super(new Properties().stacksTo(1).stacksTo(64));
        this.material = material;
        this.itemType = itemType;
    }

    @Override
    public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltip, TooltipFlag tooltipFlag) {

        if (material instanceof Alloy alloy) {
            tooltip.add(alloy.getColoredChemicalFormula());
        } else {
            int color = material.getTintColor(); // e.g. 0xFFEB00AE
            int r = (color >> 16) & 0xFF;
            int g = (color >> 8)  & 0xFF;
            int b = color         & 0xFF;

            // Create colored text using the exact RGB from the element
            tooltip.add(Component.literal(material.getChemicalFormula())
                    .withColor(net.minecraft.util.FastColor.ARGB32.color(255, r, g, b)));
        }

        super.appendHoverText(stack, context, tooltip, tooltipFlag);
    }

    @Override
    public Component getName(ItemStack stack) {
        // "Wire Cutter", "Screwdriver", "Wrench", etc. — one key per tool type
        String toolKey = "item." + Main.MODID + "." + getItemType();

        // "%s Wire Cutter" where %s = material name
        return Component.translatable("item." + Main.MODID + ".dust_format",
                Component.translatable(getMaterial().getTranslationKey()),
                Component.translatable(toolKey)
        );
    }

    public IMaterial getMaterial() { return material; }
    public String getItemType() { return itemType; }

    @SubscribeEvent
    public static void registerItemColors(RegisterColorHandlersEvent.Item event) {
        event.register(
                (stack, tintIndex) -> tintIndex == 0 && stack.getItem() instanceof BaseDust tool
                        ? tool.getMaterial().getTintColor() : 0xFFFFFFFF,
                // Only ingots
                NTItems.DUSTS.values().stream()
                        .toArray(DeferredItem[]::new)
        );
    }

}