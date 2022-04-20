package com.survivalcoding;

import com.survivalcoding.util.Calculator;

import java.io.IOException;

public class Main {
    int i = 10;

    public static void main(String[] args) throws IOException {
        Main main = new Main();

        System.out.println(main.i);

        Calculator calculator = new Calculator();
        System.out.println(Calculator.add(10, 10));

        // 십의 자리
        for (int j = 0; j < 6; j++) {
            // 일의 자리
            for (int i = 0; i < 10; i++) {
                // 시간
                for (int k = 0; k < 13; k++) {
                    System.out.printf(k + ":" + j + i + " ");
                }
                System.out.println();
            }
        }
//        Runtime.getRuntime().exec("clear");
        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.println("확인");

    }
}
