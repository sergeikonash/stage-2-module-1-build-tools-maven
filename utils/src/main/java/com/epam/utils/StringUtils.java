package com.epam.utils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        int i = 1;
        try {
            i = Integer.parseInt(str.trim());
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        return i % 2 == 0;
    }
}
