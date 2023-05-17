package ru.job4j.loop;

public class Factorial {
    public static int calc(int n) {
        int result = 1;
        if (n < 0) {
            System.out.println("Аргумет не может принимать отрицательные значения!");
            result = 0;
        }
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}