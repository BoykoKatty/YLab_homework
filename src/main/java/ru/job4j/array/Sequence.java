package ru.job4j.array;

import java.util.Random;

public class Sequence {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] array = new int[3][3];
        array[0][0] = random.nextInt(10);
        array[0][1] = random.nextInt(10);
        array[0][2] = random.nextInt(10);
        array[1][0] = random.nextInt(10);
        array[1][1] = random.nextInt(10);
        array[1][2] = random.nextInt(10);
        array[2][0] = random.nextInt(10);
        array[2][1] = random.nextInt(10);
        array[2][2] = random.nextInt(10);
    }
}