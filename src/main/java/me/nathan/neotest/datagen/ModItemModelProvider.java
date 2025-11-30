package me.nathan.neotest.datagen;

import me.nathan.neotest.Main;
import me.nathan.neotest.item.NTItems;
import me.nathan.neotest.item.ToolMaterial;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {

    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Main.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(NTItems.EXAMPLE_ITEM.get());

        for (ToolMaterial mat : ToolMaterial.values()) {
            String name = mat.getSerializedName() + "_wire_cutter";
            withExistingParent(name, mcLoc("item/handheld"))
                    .texture("layer0", modLoc("item/tool/wire_cutter_base"))
                    .texture("layer1", modLoc("item/tool/wire_cutter")); // ← single grayscale head!
        }

        // Screwdriver
        for (ToolMaterial mat : ToolMaterial.values()) {
            String name = mat.getSerializedName() + "_screwdriver";
            withExistingParent(name, mcLoc("item/handheld"))
                    .texture("layer0", modLoc("item/tool/screwdriver_base"))
                    .texture("layer1", modLoc("item/tool/screwdriver"));
        }

    }
}
