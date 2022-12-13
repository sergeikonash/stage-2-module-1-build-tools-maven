package com.epam.utils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        try {
            double i = Double.parseDouble(str.trim());
            return i % 2 == 0;
        } catch (NumberFormatException | NullPointerException e) {
            e.printStackTrace();
        }
        return false;
    }
}
