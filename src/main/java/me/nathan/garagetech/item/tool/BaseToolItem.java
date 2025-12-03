// src/main/java/me/nathan/garagetech/item/tool/MultiLayerToolItem.java
package me.nathan.garagetech.item.tool;

import me.nathan.garagetech.Main;
import me.nathan.garagetech.item.NTItems;
import me.nathan.garagetech.material.Alloy;
import me.nathan.garagetech.material.IMaterial;
import me.nathan.garagetech.material.ToolMaterial;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.RegisterColorHandlersEvent;
import net.neoforged.neoforge.registries.DeferredItem;

import java.util.List;
import java.util.stream.Stream;

@EventBusSubscriber(modid = Main.MODID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class BaseToolItem extends Item {

    private final IMaterial material;
    private final String toolType; // "wire_cutter" or "screwdriver"

    public BaseToolItem(IMaterial material, String toolType) {
        super(new Item.Properties().stacksTo(1).durability(250));
        this.material = material;
        this.toolType = toolType;
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

    // Add this method to BaseToolItem.java
    @Override
    public Component getName(ItemStack stack) {
        // "Wire Cutter", "Screwdriver", "Wrench", etc. — one key per tool type
        String toolKey = "item." + Main.MODID + "." + getToolType();

        // "%s Wire Cutter" where %s = material name
        return Component.translatable("item." + Main.MODID + ".tool_format",
                Component.translatable(getMaterial().getTranslationKey()),
                Component.translatable(toolKey)
        );
    }

    public IMaterial getMaterial() { return material; }
    public String getToolType() { return toolType; }

    @SubscribeEvent
    public static void registerItemColors(RegisterColorHandlersEvent.Item event) {
        event.register(
                (stack, tintIndex) -> tintIndex == 1 && stack.getItem() instanceof BaseToolItem tool
                        ? tool.getMaterial().getTintColor() : 0xFFFFFFFF,

                // One line – all tools from both maps
                Stream.concat(
                        NTItems.WIRE_CUTTERS.values().stream(),
                        NTItems.SCREWDRIVERS.values().stream()
                ).toArray(DeferredItem[]::new)
        );
    }
}