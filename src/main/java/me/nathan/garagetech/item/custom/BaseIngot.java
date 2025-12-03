// src/main/java/me/nathan/garagetech/item/tool/MultiLayerToolItem.java
package me.nathan.garagetech.item.custom;

import me.nathan.garagetech.Main;
import me.nathan.garagetech.item.Element;
import me.nathan.garagetech.item.NTItems;
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

@EventBusSubscriber(modid = Main.MODID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class BaseIngot extends Item {

    private final Element material;
    private final String itemType; // "wire_cutter" or "screwdriver"

    public BaseIngot(Element material, String itemType) {
        super(new Properties().stacksTo(1).durability(250));
        this.material = material;
        this.itemType = itemType;
    }

    @Override
    public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltip, TooltipFlag tooltipFlag) {
        super.appendHoverText(stack, context, tooltip, tooltipFlag);
    }

    // Add this method to BaseToolItem.java
    @Override
    public Component getName(ItemStack stack) {
        // "Wire Cutter", "Screwdriver", "Wrench", etc. — one key per tool type
        String toolKey = "item." + Main.MODID + "." + getItemType();

        // "%s Wire Cutter" where %s = material name
        return Component.translatable("item." + Main.MODID + ".ingot_format",
                getMaterial().getName(),
                Component.translatable(toolKey)
        );
    }

    public Element getMaterial() { return material; }
    public String getItemType() { return itemType; }

    @SubscribeEvent
    public static void registerItemColors(RegisterColorHandlersEvent.Item event) {
        event.register(
                (stack, tintIndex) -> tintIndex == 0 && stack.getItem() instanceof BaseIngot tool
                        ? tool.getMaterial().getTintColor() : 0xFFFFFFFF,
                // Only ingots
                NTItems.INGOTS.values().stream()
                        .toArray(DeferredItem[]::new)
        );
    }


    /*public static void registerItemColors(RegisterColorHandlersEvent.Item event) {
        event.register(
                (stack, tintIndex) -> tintIndex == 1 && stack.getItem() instanceof BaseIngot tool
                        ? tool.getMaterial().getTintColor() : 0xFFFFFFFF,

                // One line – all tools from both maps
                Stream.concat(
                        NTItems.INGOTS.values().stream(),
                        NTItems.SCREWDRIVERS.values().stream()
                ).toArray(DeferredItem[]::new)
        );
    }*/
}