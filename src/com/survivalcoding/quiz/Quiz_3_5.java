package com.survivalcoding.quiz;

import java.util.Scanner;

public class Quiz_3_5 {
    public static void main(String[] args) {
        System.out.println("[메뉴] 1:검색 2:등록 3:삭제 4:변경 >");
        String selected = new Scanner(System.in).nextLine();
        switch (selected) {
            case "1":
                System.out.println("검색");
                break;
            case "2":
                System.out.println("2");
                break;
            case "3":
                System.out.println("3");
                break;
            case "4":
                System.out.println("4");
                break;
        }
    }
}
