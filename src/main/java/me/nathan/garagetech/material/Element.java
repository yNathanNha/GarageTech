package me.nathan.garagetech.material;

import java.util.Map;

public enum Element implements IMaterial {
    HYDROGEN(0xFFE0FFFF, "Hydrogen", "H", 1, true, false, false, false),
    HELIUM(0xFFFFD0D0, "Helium", "He", 2, true, false, false, false),
    LITHIUM(0xFFCC80FF, "Lithium", "Li", 3, false, true, true, false),
    BERYLLIUM(0xFFB0FFB0, "Beryllium", "Be", 4, false, true, true, false),
    BORON(0xFFFFB0B0, "Boron", "B", 5, false, true, true, false),
    CARBON(0xFF404040, "Carbon", "C", 6, false, true, true, false),
    NITROGEN(0xFF8080FF, "Nitrogen", "N", 7, true, false, false, false),
    OXYGEN(0xFF80C0FF, "Oxygen", "O", 8, true, false, false, false),
    FLUORINE(0xFFFFFF80, "Fluorine", "F", 9, true, false, false, false),
    NEON(0xFFFF4080, "Neon", "Ne", 10, true, false, false, false),
    SODIUM(0xFFAB82FF, "Sodium", "Na", 11, false, true, true, false),
    MAGNESIUM(0xFFFFB0FF, "Magnesium", "Mg", 12, false, true, true, false),
    ALUMINUM(0xFFBFBFBF, "Aluminum", "Al", 13, false, true, true, false),
    SILICON(0xFFD0D0D0, "Silicon", "Si", 14, false, true, true, false),
    PHOSPHORUS(0xFFFFA040, "Phosphorus", "P", 15, false, true, true, false),
    SULFUR(0xFFFFFF80, "Sulfur", "S", 16, false, true, true, false),
    CHLORINE(0xFF80FF80, "Chlorine", "Cl", 17, true, false, false, false),
    ARGON(0xFF80FFFF, "Argon", "Ar", 18, true, false, false, false),
    POTASSIUM(0xFF9B79FF, "Potassium", "K", 19, false, true, true, false),
    CALCIUM(0xFFFFFFFF, "Calcium", "Ca", 20, false, true, true, false),
    SCANDIUM(0xFFE6E6B0, "Scandium", "Sc", 21, false, true, true, false),
    TITANIUM(0xFFBCC4C4, "Titanium", "Ti", 22, false, true, true, false),
    VANADIUM(0xFFA0A0A0, "Vanadium", "V", 23, false, true, true, false),
    CHROMIUM(0xFFE6E6FA, "Chromium", "Cr", 24, false, true, true, false),
    MANGANESE(0xFFCC99CC, "Manganese", "Mn", 25, false, true, true, false),
    IRON(0xFFAA8888, "Iron", "Fe", 26, false, true, true, false),
    COBALT(0xFF6666AA, "Cobalt", "Co", 27, false, true, true, false),
    NICKEL(0xFF8888AA, "Nickel", "Ni", 28, false, true, true, false),
    COPPER(0xFFFF8C42, "Copper", "Cu", 29, false, true, true, false),
    ZINC(0xFF9C9CFF, "Zinc", "Zn", 30, false, true, true, false),
    GALLIUM(0xFFCCCCFF, "Gallium", "Ga", 31, false, true, true, false), // melts at 29.8°C → still solid in most rooms
    GERMANIUM(0xFF808080, "Germanium", "Ge", 32, false, true, true, false),
    ARSENIC(0xFFBDA493, "Arsenic", "As", 33, false, true, true, false),
    SELENIUM(0xFFFFA0A0, "Selenium", "Se", 34, false, true, true, false),
    BROMINE(0xFF8B0000, "Bromine", "Br", 35, false, false, false, false), // liquid
    KRYPTON(0xFF00FF99, "Krypton", "Kr", 36, true, false, false, false),
    RUBIDIUM(0xFFCC3399, "Rubidium", "Rb", 37, false, true, true, false),
    STRONTIUM(0xFFFFFF99, "Strontium", "Sr", 38, false, true, true, false),
    YTTRIUM(0xFFCCFFCC, "Yttrium", "Y", 39, false, true, true, false),
    ZIRCONIUM(0xFFFFD700, "Zirconium", "Zr", 40, false, true, true, false),
    NIOBIUM(0xFF6666FF, "Niobium", "Nb", 41, false, true, true, false),
    MOLYBDENUM(0xFF666699, "Molybdenum", "Mo", 42, false, true, true, false),
    TECHNETIUM(0xFF4444AA, "Technetium", "Tc", 43, false, true, true, false),
    RUTHENIUM(0xFF336699, "Ruthenium", "Ru", 44, false, true, true, false),
    RHODIUM(0xFF9999CC, "Rhodium", "Rh", 45, false, true, true, false),
    PALLADIUM(0xFFAAAAFF, "Palladium", "Pd", 46, false, true, true, false),
    SILVER(0xFFE0E0E0, "Silver", "Ag", 47, false, true, true, false),
    CADMIUM(0xFFFF69B4, "Cadmium", "Cd", 48, false, true, true, false),
    INDIUM(0xFF9966FF, "Indium", "In", 49, false, true, true, false),
    TIN(0xFFAAAAAA, "Tin", "Sn", 50, false, true, true, false),
    ANTIMONY(0xFFD3D3FF, "Antimony", "Sb", 51, false, true, true, false),
    TELLURIUM(0xFFD3B36A, "Tellurium", "Te", 52, false, true, true, false),
    IODINE(0xFF9400D3, "Iodine", "I", 53, false, true, true, false),
    XENON(0xFF4285F4, "Xenon", "Xe", 54, true, false, false, false),
    CESIUM(0xFFFF4500, "Cesium", "Cs", 55, false, true, true, false),
    BARIUM(0xFFFFFF33, "Barium", "Ba", 56, false, true, true, false),
    LANTHANUM(0xFF66CCFF, "Lanthanum", "La", 57, false, true, true, false),
    CERIUM(0xFFFFFF99, "Cerium", "Ce", 58, false, true, true, false),
    PRASEODYMIUM(0xFFD3FFCC, "Praseodymium", "Pr", 59, false, true, true, false),
    NEODYMIUM(0xFFCCFF99, "Neodymium", "Nd", 60, false, true, true, false),
    PROMETHIUM(0xFFA0FFA0, "Promethium", "Pm", 61, false, true, true, false),
    SAMARIUM(0xFF99FF99, "Samarium", "Sm", 62, false, true, true, false),
    EUROPIUM(0xFF66FF66, "Europium", "Eu", 63, false, true, true, false),
    GADOLINIUM(0xFF33FF99, "Gadolinium", "Gd", 64, false, true, true, false),
    TERBIUM(0xFF33FFCC, "Terbium", "Tb", 65, false, true, true, false),
    DYSPROSIUM(0xFF00FF99, "Dysprosium", "Dy", 66, false, true, true, false),
    HOLMIUM(0xFF00FFCC, "Holmium", "Ho", 67, false, true, true, false),
    ERBIUM(0xFF00FFAA, "Erbium", "Er", 68, false, true, true, false),
    THULIUM(0xFF00FF80, "Thulium", "Tm", 69, false, true, true, false),
    YTTERBIUM(0xFF00FF60, "Ytterbium", "Yb", 70, false, true, true, false),
    LUTETIUM(0xFF00FF40, "Lutetium", "Lu", 71, false, true, true, false),
    HAFNIUM(0xFF8888FF, "Hafnium", "Hf", 72, false, true, true, false),
    TANTALUM(0xFF6666CC, "Tantalum", "Ta", 73, false, true, true, false),
    TUNGSTEN(0xFF444466, "Tungsten", "W", 74, false, true, true, false),
    RHENIUM(0xFF7777AA, "Rhenium", "Re", 75, false, true, true, false),
    OSMIUM(0xFF336699, "Osmium", "Os", 76, false, true, true, false),
    IRIDIUM(0xFF224466, "Iridium", "Ir", 77, false, true, true, false),
    PLATINUM(0xFFE0E0FF, "Platinum", "Pt", 78, false, true, true, false),
    GOLD(0xFFFFD700, "Gold", "Au", 79, false, true, true, false),
    MERCURY(0xFFB3B3B3, "Mercury", "Hg", 80, false, false, false, false), // liquid
    THALLIUM(0xFF9966CC, "Thallium", "Tl", 81, false, true, true, false),
    LEAD(0xFF666699, "Lead", "Pb", 82, false, true, true, false),
    BISMUTH(0xFFFF6B8E, "Bismuth", "Bi", 83, false, true, true, false),
    POLONIUM(0xFFAB6800, "Polonium", "Po", 84, false, true, true, false),
    ASTATINE(0xFF754F45, "Astatine", "At", 85, false, true, true, false), // technically solid, extremely rare
    RADON(0xFFFF1493, "Radon", "Rn", 86, true, false, false, false),
    FRANCIUM(0xFFFF00FF, "Francium", "Fr", 87, false, true, true, false),
    RADIUM(0xFFFFFF66, "Radium", "Ra", 88, false, true, true, false),
    ACTINIUM(0xFF70D0FF, "Actinium", "Ac", 89, false, true, true, false),
    THORIUM(0xFF00B8FF, "Thorium", "Th", 90, false, true, true, false),
    PROTACTINIUM(0xFF00A0FF, "Protactinium", "Pa", 91, false, true, true, false),
    URANIUM(0xFF0088FF, "Uranium", "U", 92, false, true, true, false),
    NEPTUNIUM(0xFF0066FF, "Neptunium", "Np", 93, false, true, true, false),
    PLUTONIUM(0xFF0044FF, "Plutonium", "Pu", 94, false, true, true, false),
    AMERICIUM(0xFF702A8B, "Americium", "Am", 95, false, true, true, false),
    CURIUM(0xFF702663, "Curium", "Cm", 96, false, true, true, false),
    BERKELIUM(0xFF882255, "Berkelium", "Bk", 97, false, true, true, false),
    CALIFORNIUM(0xFFA32D53, "Californium", "Cf", 98, false, true, true, false),
    EINSTEINIUM(0xFFB31D42, "Einsteinium", "Es", 99, false, true, true, false),
    FERMIUM(0xFFB31D2F, "Fermium", "Fm", 100, false, true, true, false),
    MENDELEVIUM(0xFFB31D1D, "Mendelevium", "Md", 101, false, true, true, false),
    NOBELIUM(0xFFBD1D1D, "Nobelium", "No", 102, false, true, true, false),
    LAWRENCIUM(0xFFC91F1F, "Lawrencium", "Lr", 103, false, true, true, false),
    RUTHERFORDIUM(0xFFCC0066, "Rutherfordium", "Rf", 104, false, true, true, false),
    DUBNIUM(0xFFD1006B, "Dubnium", "Db", 105, false, true, true, false),
    SEABORGIUM(0xFFD90070, "Seaborgium", "Sg", 106, false, true, true, false),
    BOHRIUM(0xFFE00075, "Bohrium", "Bh", 107, false, true, true, false),
    HASSIUM(0xFFE6007A, "Hassium", "Hs", 108, false, true, true, false),
    MEITNERIUM(0xFFEB007F, "Meitnerium", "Mt", 109, false, true, true, false),
    DARMSTADTIUM(0xFFEB0085, "Darmstadtium", "Ds", 110, false, true, true, false),
    ROENTGENIUM(0xFFEB008B, "Roentgenium", "Rg", 111, false, true, true, false),
    COPERNICIUM(0xFFEB0090, "Copernicium", "Cn", 112, false, true, true, false),
    NIHONIUM(0xFFEB0096, "Nihonium", "Nh", 113, false, true, true, false),
    FLEROVIUM(0xFFEB009C, "Flerovium", "Fl", 114, false, true, true, false),
    MOSCOVIUM(0xFFEB00A2, "Moscovium", "Mc", 115, false, true, true, false),
    LIVERMORIUM(0xFFEB00A8, "Livermorium", "Lv", 116, false, true, true, false),
    TENNESSINE(0xFFEB00AE, "Tennessine", "Ts", 117, false, true, true, false),
    OGANESSON(0xFFEB00B4, "Oganesson", "Og", 118, false, true, true, false); // predicted solid

    private final int tintColor;
    private final String textureName;
    private final String symbol;
    private final int atomicNumber;
    private final boolean isGas;
    private final boolean registerIngot;
    private final boolean registerDust;
    private final boolean registerLiquid;

    Element(int tintColor, String textureName, String symbol, int atomicNumber,
            boolean isGas, boolean registerIngot, boolean registerDust, boolean registerLiquid) {
        this.tintColor = tintColor;
        this.textureName = textureName;
        this.symbol = symbol;
        this.atomicNumber = atomicNumber;
        this.isGas = isGas;
        this.registerIngot = registerIngot;
        this.registerDust = registerDust;
        this.registerLiquid = registerLiquid;
    }

    public String getName() { return textureName; }
    public String getSymbol() { return symbol; }
    public int getAtomicNumber() { return atomicNumber; }
    public boolean isGas() { return isGas; }
    public boolean isRegisterIngot() { return registerIngot; }
    public boolean isRegisterDust() { return registerDust; }
    public boolean isLiquid() { return registerLiquid; }

    @Override
    public int getTintColor() {
        return tintColor;
    }

    @Override
    public String getTextureName() {
        return textureName.toLowerCase();
    }

    @Override
    public int getDurability() {
        return 100; // default for elements
    }

    @Override
    public Map<Element, Integer> getComposition() {
        return Map.of(this, 1);
    }

    @Override
    public String getChemicalFormula() {
        return getSymbol();
    }


}