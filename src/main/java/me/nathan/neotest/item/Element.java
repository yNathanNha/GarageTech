package me.nathan.neotest.item;

public enum Element {
    HYDROGEN(0xFFB0B0B0, "Hydrogen", "H", 1, true, false),
    HELIUM(0xFFC0C0FF, "Helium", "He", 2, true, false),
    LITHIUM(0xFFCC9999, "Lithium", "Li", 3, false),
    COPPER(0xFFB87333, "Copper", "Cu", 29, false, false),
    IRON(0xFFAAAAAA, "Iron", "Fe", 26, false, false)
    // ... continue all 118 elements
    ;

    private final int tintColor;
    private final String textureName;
    private final String symbol;
    private final int atomicNumber;
    private final boolean isGas;
    private final boolean registerIngot;

    Element(int tintColor, String textureName, String symbol, int atomicNumber, boolean isGas) {
        this.tintColor = tintColor;
        this.textureName = textureName;
        this.symbol = symbol;
        this.atomicNumber = atomicNumber;
        this.isGas = isGas;
        this.registerIngot = true;
    }

    Element(int tintColor, String textureName, String symbol, int atomicNumber, boolean isGas, boolean registerIngot) {
        this.tintColor = tintColor;
        this.textureName = textureName;
        this.symbol = symbol;
        this.atomicNumber = atomicNumber;
        this.isGas = isGas;
        this.registerIngot = registerIngot;
    }

    public int getTintColor() { return tintColor; }
    public String getTextureName() { return textureName; }
    public String getSymbol() { return symbol; }
    public int getAtomicNumber() { return atomicNumber; }
    public boolean isGas() { return isGas; }
    public boolean isRegisterIngot() { return registerIngot; }
}
