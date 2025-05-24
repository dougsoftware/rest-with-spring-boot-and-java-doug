package com.douglasmatosdev.request.converters;

import com.douglasmatosdev.exception.UnsupportedMathOperationException;

public class NumberConverter {

    public static Double convertToDouble(String strNumber) {
        if (strNumber == null || strNumber.isEmpty())
            throw new UnsupportedMathOperationException("Please set a numeric value!");
        String number = strNumber.replace(",", "."); // R$ 5,00 USd 5.00
        return Double.parseDouble(number);
    }

    public static boolean isNumeric(String strNumber) {
        if (strNumber == null || strNumber.isEmpty()) return false;
        String number = strNumber.replace(",", "."); // R$ 5,00 USd 5.00
        return number.matches("[-+]?[0-9]*\\.?[0-9]+");
    }

    public static boolean isDivisible(Double number) {
        return !number.equals(0.0);
    }
}
