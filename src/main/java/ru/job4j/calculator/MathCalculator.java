package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static Double subtractAndDivide(double first, double second) {
        Double ratio = divide(first, second);
        if (ratio == null) {
            return null;
        } else {
            return subtract(first, second) + ratio;
        }
    }

    public static Double allOperations(double first, double second) {
        Double ratio = divide(first, second);
        if (ratio == null) {
            return null;
        } else {
            return sum(first, second)
                    + multiply(first, second)
                    + subtract(first, second)
                    + ratio;
        }
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен sumAndMultiply(10, 20): " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета равен subtractAndDivide(10, 20): " + subtractAndDivide(10, 20));
        System.out.println("Результат расчета равен subtractAndDivide(10, 0): " + subtractAndDivide(10, 0));
        System.out.println("Результат расчета равен allOperations(10, 20): " + allOperations(10, 20));
        System.out.println("Результат расчета равен allOperations(10, 0): " + allOperations(10, 0));
    }
}