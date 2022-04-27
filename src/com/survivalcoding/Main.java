package com.survivalcoding;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("data.txt");
            fw.write("안녕\n");
            fw.write("Hello\n");
            fw.write("안녕");
            fw.close();

            FileReader fr = new FileReader("data.txt");
            int ch;
            while ((ch = fr.read()) != -1) {
                System.out.print((char) ch);
            }

        } catch (Exception e) {
            System.out.println("에러가 발생했다 " + e.getMessage());
        } finally {
            System.out.println("항상 마지막에 실행되는 부분");

        }
    }

}
