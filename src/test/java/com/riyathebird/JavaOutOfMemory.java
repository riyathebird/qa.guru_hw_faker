package com.riyathebird;

public class JavaOutOfMemory {
    public static void main(String[] args) {

        byte a = 127;
        short b = -32768;
        int c = Integer.MAX_VALUE;
        long d = 5L;
        double e = 0.1d;
        float f = 11.25f;

// переполнение

        System.out.println(a + 2);
        System.out.println(c);
        System.out.println(c + 1);
        System.out.println(b - 1);

    }
}
