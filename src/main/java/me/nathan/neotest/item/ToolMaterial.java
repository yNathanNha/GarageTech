// src/main/java/me/nathan/neotest/item/tool/ToolMaterial.java
package me.nathan.neotest.item;

import me.nathan.neotest.Main;
import net.minecraft.network.chat.Component;
import net.minecraft.util.StringRepresentable;
import java.util.Locale;

public enum ToolMaterial implements StringRepresentable {
    BRONZE(0xFFCD7F32, "bronze", 100),
    STEEL(0xFF8C8C8C, "steel", 100),
    TITANIUM(0xFFD0D0E0, "titanium", 100),
    TUNGSTEN(0xFF404040, "tungsten", 100),
    DIAMOND(0xFF40E0D0, "diamond", 100),
    NETHERITE(0xFF6B4F4F, "netherite", 100);

    private final int tintColor;
    private final String textureName; // ← this will be used as layer1 texture
    private final int durability;

    ToolMaterial(int tintColor, String textureName, int durability) {
        this.tintColor = tintColor;
        this.textureName = textureName;
        this.durability = durability;
    }

    public int getTintColor() { return tintColor; }
    public String getTextureName() { return textureName; }

    @Override
    public String getSerializedName() {
        return name().toLowerCase(Locale.ROOT);
    }

    public int getDurability() {
        return durability;
    }

    public Component getDisplayName() {
        return Component.translatable("tool_material." + Main.MODID + "." + getSerializedName());
    }

}