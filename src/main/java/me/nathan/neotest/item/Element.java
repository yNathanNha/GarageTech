package me.nathan.neotest.item;

public enum Element {
    HYDROGEN(0xFFB0B0B0, "Hydrogen", "H", 1, true, false),
    HELIUM(0xFFFFC0C0, "Helium", "He", 2, true, false),
    LITHIUM(0xFFCC9999, "Lithium", "Li", 3, false, true),
    BERYLLIUM(0xFFA0A0A0, "Beryllium", "Be", 4, false, true),
    BORON(0xFFFFB266, "Boron", "B", 5, false, true),
    CARBON(0xFF444444, "Carbon", "C", 6, false, true),
    NITROGEN(0xFF8080FF, "Nitrogen", "N", 7, true, false),
    OXYGEN(0xFF80C0FF, "Oxygen", "O", 8, true, false),
    FLUORINE(0xFFFFFF80, "Fluorine", "F", 9, true, false),
    NEON(0xFFFF8080, "Neon", "Ne", 10, true, false),
    SODIUM(0xFF6666FF, "Sodium", "Na", 11, false, true),
    MAGNESIUM(0xFFFFC0C0, "Magnesium", "Mg", 12, false, true),
    ALUMINIUM(0xFFCCCCCC, "Aluminium", "Al", 13, false, true),
    SILICON(0xFFD0D0D0, "Silicon", "Si", 14, false, true),
    PHOSPHORUS(0xFFFFFF66, "Phosphorus", "P", 15, false, true),
    SULFUR(0xFFFFFF99, "Sulfur", "S", 16, false, true),
    CHLORINE(0xFF80FF80, "Chlorine", "Cl", 17, true, false),
    ARGON(0xFF8080FF, "Argon", "Ar", 18, true, false),
    POTASSIUM(0xFFCC99FF, "Potassium", "K", 19, false, true),
    CALCIUM(0xFFFFFFFF, "Calcium", "Ca", 20, false, true),
    SCANDIUM(0xFFE0E0E0, "Scandium", "Sc", 21, false, true),
    TITANIUM(0xFFD0D0E0, "Titanium", "Ti", 22, false, true),
    VANADIUM(0xFFC0C0C0, "Vanadium", "V", 23, false, true),
    CHROMIUM(0xFFE0C0E0, "Chromium", "Cr", 24, false, true),
    MANGANESE(0xFFC0A0C0, "Manganese", "Mn", 25, false, true),
    IRON(0xFFAAAAAA, "Iron", "Fe", 26, false, true),
    COBALT(0xFF8080C0, "Cobalt", "Co", 27, false, true),
    NICKEL(0xFFA0A0A0, "Nickel", "Ni", 28, false, true),
    COPPER(0xFFB87333, "Copper", "Cu", 29, false, true),
    ZINC(0xFFFFD0B0, "Zinc", "Zn", 30, false, true),
    GALLIUM(0xFFD0D0FF, "Gallium", "Ga", 31, false, true),
    GERMANIUM(0xFFB0B0B0, "Germanium", "Ge", 32, false, true),
    ARSENIC(0xFFB0B0B0, "Arsenic", "As", 33, false, true),
    SELENIUM(0xFFFFFF80, "Selenium", "Se", 34, false, true),
    BROMINE(0xFF8B0000, "Bromine", "Br", 35, false, true, true),
    KRYPTON(0xFF80FF80, "Krypton", "Kr", 36, true, false),
    RUBIDIUM(0xFFFF8080, "Rubidium", "Rb", 37, false, true),
    STRONTIUM(0xFFFFFFFF, "Strontium", "Sr", 38, false, true),
    YTTRIUM(0xFFE0FFFF, "Yttrium", "Y", 39, false, true),
    ZIRCONIUM(0xFFD0FFD0, "Zirconium", "Zr", 40, false, true),
    NIOBIUM(0xFFC0C0FF, "Niobium", "Nb", 41, false, true),
    MOLYBDENUM(0xFFB0B0FF, "Molybdenum", "Mo", 42, false, true),
    TECHNETIUM(0xFF8080FF, "Technetium", "Tc", 43, false, true),
    RUTHENIUM(0xFFA0A0FF, "Ruthenium", "Ru", 44, false, true),
    RHODIUM(0xFFFF80FF, "Rhodium", "Rh", 45, false, true),
    PALLADIUM(0xFFFFC0C0, "Palladium", "Pd", 46, false, true),
    SILVER(0xFFC0C0FF, "Silver", "Ag", 47, false, true),
    CADMIUM(0xFFFFD0D0, "Cadmium", "Cd", 48, false, true),
    INDIUM(0xFFFFB0FF, "Indium", "In", 49, false, true),
    TIN(0xFFD0D0D0, "Tin", "Sn", 50, false, true),
    ANTIMONY(0xFFB0B0B0, "Antimony", "Sb", 51, false, true),
    TELLURIUM(0xFFD0D0A0, "Tellurium", "Te", 52, false, true),
    IODINE(0xFF800080, "Iodine", "I", 53, false, true),
    XENON(0xFF4080FF, "Xenon", "Xe", 54, true, false),
    CAESIUM(0xFFFFC040, "Caesium", "Cs", 55, false, true),
    BARIUM(0xFFFFD740, "Barium", "Ba", 56, false, true),
    LANTHANUM(0xFF80D0FF, "Lanthanum", "La", 57, false, true),
    CERIUM(0xFFFFFF80, "Cerium", "Ce", 58, false, true),
    PRASEODYMIUM(0xFFD0FFD0, "Praseodymium", "Pr", 59, false, true),
    NEODYMIUM(0xFFC0FFC0, "Neodymium", "Nd", 60, false, true),
    PROMETHIUM(0xFFA0FFA0, "Promethium", "Pm", 61, false, true),
    SAMARIUM(0xFF80FF80, "Samarium", "Sm", 62, false, true),
    EUROPIUM(0xFF60FF60, "Europium", "Eu", 63, false, true),
    GADOLINIUM(0xFF40FF40, "Gadolinium", "Gd", 64, false, true),
    TERBIUM(0xFF30FF30, "Terbium", "Tb", 65, false, true),
    DYSPROSIUM(0xFF20FF20, "Dysprosium", "Dy", 66, false, true),
    HOLMIUM(0xFF10FF10, "Holmium", "Ho", 67, false, true),
    ERBIUM(0xFF00FF10, "Erbium", "Er", 68, false, true),
    THULIUM(0xFF00FF40, "Thulium", "Tm", 69, false, true),
    YTTERBIUM(0xFF00FF80, "Ytterbium", "Yb", 70, false, true),
    LUTETIUM(0xFF00FFFF, "Lutetium", "Lu", 71, false, true),
    HAFNIUM(0xFF80D0FF, "Hafnium", "Hf", 72, false, true),
    TANTALUM(0xFFA0D0FF, "Tantalum", "Ta", 73, false, true),
    TUNGSTEN(0xFFB0B0B0, "Tungsten", "W", 74, false, true),
    RHENIUM(0xFFB0C0C0, "Rhenium", "Re", 75, false, true),
    OSMIUM(0xFF8080FF, "Osmium", "Os", 76, false, true),
    IRIDIUM(0xFF6060FF, "Iridium", "Ir", 77, false, true),
    PLATINUM(0xFFFFD700, "Platinum", "Pt", 78, false, true),
    GOLD(0xFFFFD700, "Gold", "Au", 79, false, true),
    MERCURY(0xFFB0B0B0, "Mercury", "Hg", 80, false, true, true),
    THALLIUM(0xFFA0A0A0, "Thallium", "Tl", 81, false, true),
    LEAD(0xFF808080, "Lead", "Pb", 82, false, true),
    BISMUTH(0xFFFF8080, "Bismuth", "Bi", 83, false, true),
    POLONIUM(0xFFAB8700, "Polonium", "Po", 84, false, true),
    ASTATINE(0xFF800080, "Astatine", "At", 85, false, false),
    RADON(0xFF408080, "Radon", "Rn", 86, true, false),
    FRANCIUM(0xFFFF00FF, "Francium", "Fr", 87, false, true),
    RADIUM(0xFFFF8000, "Radium", "Ra", 88, false, true),
    ACTINIUM(0xFF8080FF, "Actinium", "Ac", 89, false, true),
    THORIUM(0xFF808080, "Thorium", "Th", 90, false, true),
    PROTACTINIUM(0xFFA0A0A0, "Protactinium", "Pa", 91, false, true),
    URANIUM(0xFF408040, "Uranium", "U", 92, false, true),
    NEPTUNIUM(0xFF4080FF, "Neptunium", "Np", 93, false, true),
    PLUTONIUM(0xFFFF4080, "Plutonium", "Pu", 94, false, true),
    AMERICIUM(0xFFFF80C0, "Americium", "Am", 95, false, true),
    CURIUM(0xFFFF40FF, "Curium", "Cm", 96, false, true),
    BERKELIUM(0xFFC040FF, "Berkelium", "Bk", 97, false, true),
    CALIFORNIUM(0xFF8040FF, "Californium", "Cf", 98, false, true),
    EINSTEINIUM(0xFF6040FF, "Einsteinium", "Es", 99, false, true),
    FERMIUM(0xFF4040FF, "Fermium", "Fm", 100, false, true),
    MENDELEVIUM(0xFF2040FF, "Mendelevium", "Md", 101, false, true),
    NOBELIUM(0xFF0040FF, "Nobelium", "No", 102, false, true),
    LAWRENCIUM(0xFF0080FF, "Lawrencium", "Lr", 103, false, true),
    RUTHERFORDIUM(0xFFFF00C0, "Rutherfordium", "Rf", 104, false, true),
    DUBNIUM(0xFFFF00A0, "Dubnium", "Db", 105, false, true),
    SEABORGIUM(0xFFFF0080, "Seaborgium", "Sg", 106, false, true),
    BOHRIUM(0xFFFF0060, "Bohrium", "Bh", 107, false, true),
    HASSIUM(0xFFFF0040, "Hassium", "Hs", 108, false, true),
    MEITNERIUM(0xFFFF0020, "Meitnerium", "Mt", 109, false, true),
    DARMSTADTIUM(0xFFFF0000, "Darmstadtium", "Ds", 110, false, true),
    ROENTGENIUM(0xFFFF2000, "Roentgenium", "Rg", 111, false, true),
    COPERNICIUM(0xFFFF4000, "Copernicium", "Cn", 112, false, true),
    NIHONIUM(0xFFFF6000, "Nihonium", "Nh", 113, false, true),
    FLEROVIUM(0xFFFF8000, "Flerovium", "Fl", 114, false, true),
    MOSCOVIUM(0xFFFFA000, "Moscovium", "Mc", 115, false, true),
    LIVERMORIUM(0xFFFFC000, "Livermorium", "Lv", 116, false, true),
    TENNESSINE(0xFFFFE000, "Tennessine", "Ts", 117, false, false),
    OGANESSON(0xFFFFFF00, "Oganesson", "Og", 118, true, false);

    private final int tintColor;
    private final String textureName;
    private final String symbol;
    private final int atomicNumber;
    private final boolean isGas;
    private final boolean registerIngot;
    private final boolean isLiquid;

    Element(int tintColor, String textureName, String symbol, int atomicNumber, boolean isGas, boolean isLiquid) {
        this(tintColor, textureName, symbol, atomicNumber, isGas, true, isLiquid);
    }

    Element(int tintColor, String textureName, String symbol, int atomicNumber, boolean isGas, boolean registerIngot, boolean isLiquid) {
        this.tintColor = tintColor;
        this.textureName = textureName;
        this.symbol = symbol;
        this.atomicNumber = atomicNumber;
        this.isGas = isGas;
        this.registerIngot = registerIngot;
        this.isLiquid = isLiquid;
    }

    public int getTintColor() { return tintColor; }
    public String getTextureName() { return textureName; }
    public String getSymbol() { return symbol; }
    public int getAtomicNumber() { return atomicNumber; }
    public boolean isGas() { return isGas; }
    public boolean isRegisterIngot() { return registerIngot; }
    public boolean isLiquid() { return isLiquid; }
}