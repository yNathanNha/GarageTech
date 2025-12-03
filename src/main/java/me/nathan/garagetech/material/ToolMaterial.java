package me.nathan.garagetech.material;

import net.minecraft.network.chat.Component;
import net.minecraft.util.StringRepresentable;
import java.util.Locale;

public enum ToolMaterial implements StringRepresentable {
    IRON(Element.IRON),
    GOLD(Element.GOLD),
    COPPER(Element.COPPER),

    BRONZE(Alloy.BRONZE),
    STEEL(Alloy.STEEL),
    ELECTRUM(Alloy.ELECTRUM),
    INVAR(Alloy.INVAR),
    STAINLESS_STEEL(Alloy.STAINLESS_STEEL);

    private final IMaterial material;

    ToolMaterial(IMaterial material) {
        this.material = material;
    }

    public IMaterial getMaterial() {
        return material;
    }

    public int getTintColor() {
        return material.getTintColor();
    }

    public int getDurability() {
        return material.getDurability();
    }

    public String getChemicalFormula() {
        return material.getChemicalFormula();
    }

    @Override
    public String getSerializedName() {
        return material.getTextureName();
    }

    public Component getDisplayName() {
        return Component.translatable("tool_material." + "garagetech" + "." + getSerializedName());
    }
}
