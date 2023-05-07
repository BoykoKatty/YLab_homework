package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        System.out.printf("%s rubles are %s euros.\n", value, rsl);
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        System.out.printf("%s rubles are %s dollars.\n", value, rsl);
        return rsl;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        float dollar = Converter.rubleToDollar(140);
    }
}
