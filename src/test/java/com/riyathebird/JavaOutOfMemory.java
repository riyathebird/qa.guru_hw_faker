package com.riyathebird;

public class JavaOutOfMemory {
    public static void main(String[] args) {

        byte a = 127;
        short b = -32768;
        int c = 2147483647;
        long d = 5L;
        double e = 0.1d;
        float f = 11.25f;

        boolean bool = a > b;
        System.out.println(bool);

// переполнение

        System.out.println(a + 10);
        System.out.println(c);
        System.out.println(c + 2);
        System.out.println(b - 1);

    }
}
