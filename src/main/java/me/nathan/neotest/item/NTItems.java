package me.nathan.neotest.item;

import me.nathan.neotest.Main;
import me.nathan.neotest.block.NTBlocks;
import me.nathan.neotest.item.tool.BaseToolItem;
import me.nathan.neotest.item.tool.Screwdriver;
import me.nathan.neotest.item.tool.WireCutter;
import net.minecraft.core.Holder;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.apache.http.impl.conn.Wire;

import java.util.HashMap;
import java.util.Map;

public class NTItems {

    // === STORAGE FOR EASY LOOKUP ===
    public static final Map<ToolMaterial, DeferredItem<Item>> WIRE_CUTTERS = new HashMap<>();
    public static final Map<ToolMaterial, DeferredItem<Item>> SCREWDRIVERS = new HashMap<>();

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Main.MODID);

    public static final DeferredItem<ExampleFood> EXAMPLE_ITEM =
            ITEMS.register("example_item",
                    () -> new ExampleFood(
                            new Item.Properties().food(
                                    new FoodProperties.Builder()
                                            .alwaysEdible()
                                            .nutrition(1)
                                            .saturationModifier(2f)
                                            .build()
                            )
                    )
            );

    static {
        // === WIRE CUTTERS ===
        for (ToolMaterial mat : ToolMaterial.values()) {
            String name = mat.getSerializedName() + "_wire_cutter";
            DeferredItem<Item> holder = ITEMS.register(name, () -> new WireCutter(mat, "wire_cutter"));
            WIRE_CUTTERS.put(mat, holder);  // ← store it here!
        }

        // === SCREWDRIVERS ===
        for (ToolMaterial mat : ToolMaterial.values()) {
            String name = mat.getSerializedName() + "_screwdriver";
            DeferredItem<Item> holder = ITEMS.register(name, () -> new Screwdriver(mat, "screwdriver"));
            SCREWDRIVERS.put(mat, holder);  // ← store it here!
        }
    }

    // Helper method — now working perfectly
    public static void addAllToolsToTab(CreativeModeTab.Output output) {
        for (ToolMaterial mat : ToolMaterial.values()) {
            DeferredItem<Item> wireCutter = WIRE_CUTTERS.get(mat);
            DeferredItem<Item> screwdriver = SCREWDRIVERS.get(mat);

            // These will never be null — we put them in the map ourselves
            output.accept(wireCutter.get());
            output.accept(screwdriver.get());
        }
    }

}
