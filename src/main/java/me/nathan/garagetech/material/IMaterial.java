package me.nathan.garagetech.material;

import me.nathan.garagetech.Main;

import java.util.Map;

public interface IMaterial {
    int getTintColor();
    String getTextureName();
    int getDurability(); // Optional, default 100 if element
    Map<Element, Integer> getComposition(); // Single element → Map of 1
    String getChemicalFormula();

    default String getTranslationKey() {
        return "material." + Main.MODID + "." + getTextureName();
        // e.g. "material.garagetech.copper" or "material.garagetech.bronze"
    }

}