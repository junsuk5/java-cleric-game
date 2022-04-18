package com.survivalcoding;

public class Lecture_4_13_2 {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3 };

        int[] b = { 5, 6 };

        a = null;

        a = b;

        System.out.println(b.length);
    }
}
