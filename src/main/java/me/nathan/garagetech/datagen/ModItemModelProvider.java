package me.nathan.garagetech.datagen;

import me.nathan.garagetech.Main;
import me.nathan.garagetech.item.Element;
import me.nathan.garagetech.item.NTItems;
import me.nathan.garagetech.item.ToolMaterial;
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

        for (Element ele : Element.values()) {
            if(ele.isRegisterIngot()) {
                String name = ele.getTextureName() + "_ingot";
                withExistingParent(name, mcLoc("item/handheld"))
                        .texture("layer0", modLoc("item/ingot-0"))
                        .texture("layer1", modLoc("item/ingot_overlay-0")); // ← single grayscale head! ingot_overlay-0
            }
            if(ele.isRegisterDust()) {
                String name = ele.getTextureName() + "_dust";
                withExistingParent(name, mcLoc("item/handheld"))
                        .texture("layer0", modLoc("item/dust"));
            }
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
