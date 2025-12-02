package me.nathan.neotest.item;

import me.nathan.neotest.Main;
import me.nathan.neotest.block.NTBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class NTCreativeTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Main.MODID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> EXAMPLE_TAB = CREATIVE_MODE_TABS.register("example_tab", () -> CreativeModeTab.builder().title(Component.translatable("itemGroup.neotest")).icon(() -> NTItems.EXAMPLE_ITEM.get().getDefaultInstance()).displayItems((parameters, output) -> {
        output.accept(NTItems.EXAMPLE_ITEM.get()); // Add the example item to the tab. For your own tabs, this method is preferred over the event
        output.accept(NTBlocks.EXAMPLE_BLOCK);
        output.accept(NTBlocks.BLUE_STONE);

        NTItems.addAllToolsToTab(output);

    }).build());

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> TOOLS_TAB = CREATIVE_MODE_TABS.register("tools_tab", () -> CreativeModeTab.builder().title(Component.translatable("itemGroup.neotest.tools")).icon(() -> NTItems.WIRE_CUTTERS.get(ToolMaterial.DIAMOND).asItem().getDefaultInstance()).displayItems((parameters, output) -> {

        NTItems.addAllToolsToTab(output);

    }).build());

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> ORES_TAB = CREATIVE_MODE_TABS.register("ores_tab", () -> CreativeModeTab.builder().title(Component.translatable("itemGroup.neotest.ores")).icon(() -> NTItems.INGOTS.get(Element.ALUMINUM).asItem().getDefaultInstance()).displayItems((parameters, output) -> {

        NTItems.addAllIngotsToTab(output);

    }).build());

}
