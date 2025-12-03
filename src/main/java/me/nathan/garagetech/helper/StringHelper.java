package me.nathan.garagetech.helper;

public class StringHelper {

    private static final char[] SUBSCRIPT_DIGITS = {
            '₀', '₁', '₂', '₃', '₄', '₅', '₆', '₇', '₈', '₉'
    };

    public static String toSubscript(int number) {
        StringBuilder sb = new StringBuilder();
        for (char c : String.valueOf(number).toCharArray()) {
            sb.append(SUBSCRIPT_DIGITS[c - '0']);
        }
        return sb.toString();
    }


}
