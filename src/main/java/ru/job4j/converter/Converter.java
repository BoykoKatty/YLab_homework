package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static void main(String[] args) {
        float value = 140;
        float euro = Converter.rubleToEuro(value);
        System.out.printf("%s rubles are %s euros.\n", value, euro);
        float dollar = Converter.rubleToDollar(value);
        System.out.printf("%s rubles are %s dollars.\n", value, dollar);
    }
}
