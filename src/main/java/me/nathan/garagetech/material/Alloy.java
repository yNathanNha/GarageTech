package me.nathan.garagetech.material;

import me.nathan.garagetech.helper.StringHelper;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.network.chat.TextColor;
import net.minecraft.util.FastColor;

import java.util.Comparator;
import java.util.Map;
import java.util.stream.Collectors;

public enum Alloy implements IMaterial{

    BRONZE("bronze", 0xFFB86B1E, 400, 6.5f, 2.5f, 12,
            Map.of(Element.COPPER, 3, Element.TIN, 1)),

    STEEL("steel", 0xFF8C8C8C, 600, 7.0f, 3.0f, 10,
            Map.of(Element.IRON, 98, Element.CARBON, 2)),

    ELECTRUM("electrum", 0xFFFFD700, 100, 12.0f, 1.5f, 30,
            Map.of(Element.GOLD, 1, Element.SILVER, 1)),

    INVAR("invar", 0xFF9C8A8A, 700, 6.0f, 3.0f, 8,
            Map.of(Element.IRON, 64, Element.NICKEL, 36)),

    STAINLESS_STEEL("stainless_steel", 0xFFC0C0D0, 1200, 7.5f, 3.5f, 14,
            Map.of(Element.IRON, 70, Element.CHROMIUM, 18, Element.NICKEL, 10, Element.MANGANESE, 2));

    // === Fields ===
    public final String textureName;
    public final int tintColor;           // Auto-calculated from components
    public final int durability;
    public final float speed;
    public final float damage;
    public final int enchantability;
    public final Map<Element, Integer> composition; // Real GregTech-style recipe

    // === Constructor ===
    Alloy(String textureName, int fallbackTint, int durability, float speed, float damage, int enchantability,
          Map<Element, Integer> composition) {
        this.textureName = textureName;
        this.durability = durability;
        this.speed = speed;
        this.damage = damage;
        this.enchantability = enchantability;
        this.composition = Map.copyOf(composition); // immutable

        // AUTO-CALCULATE TINT FROM COMPONENTS (GregTech-style blending!)
        this.tintColor = calculateBlendedTint(composition, fallbackTint);
    }

    // === Magic: Blends colors by weighted average (realistic!) ===
    private static int calculateBlendedTint(Map<Element, Integer> comp, int fallback) {
        if (comp.isEmpty()) return fallback;

        long totalParts = comp.values().stream().mapToLong(i -> i).sum();
        if (totalParts == 0) return fallback;

        long r = 0, g = 0, b = 0;

        for (var entry : comp.entrySet()) {
            Element elem = entry.getKey();
            int parts = entry.getValue();
            int color = elem.getTintColor();

            r += parts * ((color >> 16) & 255);
            g += parts * ((color >> 8)  & 255);
            b += parts * ( color        & 255);
        }

        int finalR = (int) (r / totalParts);
        int finalG = (int) (g / totalParts);
        int finalB = (int) (b / totalParts);

        return FastColor.ARGB32.color(255, finalR, finalG, finalB);
    }

    // Helper: get total parts (e.g. 4 for Bronze)
    public int getTotalParts() {
        return composition.values().stream().mapToInt(Integer::intValue).sum();
    }

    // Optional: get primary element (for naming, icons, etc.)
    public Element getPrimaryElement() {
        return composition.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse(Element.IRON);
    }

    @Override
    public Map<Element, Integer> getComposition() {
        return composition;
    }

    @Override
    public int getTintColor() {
        return tintColor;
    }

    @Override
    public String getTextureName() {
        return textureName;
    }

    @Override
    public int getDurability() {
        return durability;
    }

    @Override
    public String getChemicalFormula() {
        StringBuilder sb = new StringBuilder();
        for (var entry : composition.entrySet()) {
            Element e = entry.getKey();
            int amount = entry.getValue();
            sb.append(e.getSymbol());
            if (amount > 1) sb.append(amount);
        }
        return sb.toString();
    }

    public MutableComponent getColoredChemicalFormula() {
        var sorted = composition.entrySet().stream()
                .sorted((a, b) -> b.getValue().compareTo(a.getValue()))
                .toList();

        MutableComponent formula = Component.literal(""); // start empty

        for (var entry : sorted) {
            Element e = entry.getKey();
            int amount = entry.getValue();

            MutableComponent eleComp = Component.literal(e.getSymbol())
                    .withStyle(style -> style.withColor(TextColor.fromRgb(e.getTintColor() & 0xFFFFFF)));

            if (amount > 1) {
                eleComp.append(Component.literal(StringHelper.toSubscript(amount))
                        .withStyle(style -> style.withColor(TextColor.fromRgb(e.getTintColor() & 0xFFFFFF))));
            }

            formula.append(eleComp);
        }

        return formula;
    }



}