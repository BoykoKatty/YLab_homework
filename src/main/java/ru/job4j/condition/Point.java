package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double deltaXSquare = Math.pow(x2 - x1, 2);
        double deltaYSquare = Math.pow(y2 - y1, 2);
        double rsl = Math.sqrt(deltaXSquare + deltaYSquare);
        System.out.printf("result (%s, %s) to (%s, %s) %s\n", x1, y1, x2, y2, rsl);
        return rsl;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        result = Point.distance(5, 4, -7, -1);
        result = Point.distance(11, 18, -17, -11);
    }
}