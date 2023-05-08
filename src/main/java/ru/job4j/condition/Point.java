package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double deltaXSquare = Math.pow(x2 - x1, 2);
        double deltaYSquare = Math.pow(y2 - y1, 2);
        return Math.sqrt(deltaXSquare + deltaYSquare);
    }

    public static void main(String[] args) {
        double result = Point.distance(5, 4, -7, -1);
        System.out.printf("result (%s, %s) to (%s, %s) %s\n", 5, 4, -7, -1, result);
        result = Point.distance(11, 18, -17, -11);
        System.out.printf("result (%s, %s) to (%s, %s) %s\n", 11, 18, -17, -11, result);
    }
}