package com.survivalcoding.quiz;

import java.util.Random;
import java.util.Scanner;

public class Quiz_2_3 {
    public static void main(String[] args) {
//        화면에 “점을 보세요" 라고 표시합니다.
        System.out.println("점을 보세요");

//        화면에 “이름을 입력해 주세요" 라고 표시합니다.
        System.out.println("이름을 입력해 주세요");

//        키보드로부터 1행의 문자열을 입력 받아, String 형 변수 name 에 넣습니다.
        String name = new Scanner(System.in).nextLine();

//                화면에 “나이를 입력 해 주세요" 라고 표시합니다
        System.out.println("나이를 입력 해 주세요");

//        키보드로부터 1행의 문자 입력을 받아, String 형 변수 ageString 에 넣습니다
        String ageString = new Scanner(System.in).nextLine();

//        변수 ageString 의 내용을 int 형으로 변환하고, int 형 변수 age 에 대입합니다
        int age = Integer.parseInt(ageString);

//        0 부터 3 까지의 난수를 생성해, int 형 변수 fortune 에 대입합니다
        int fortune = new Random().nextInt(4);

//        fortune 의 수치를 증가연산자로 1 증가시켜, 1 부터 4 까지의 난수로 합니다.
        fortune++;

//                화면에 “점꾀가 나왔습니다!” 라고 표시합니다.
        System.out.println("점꾀가 나왔습니다!");

//        화면에 “(나이)살의 (이름)씨, 당신의 운세번호는 (난수) 입니다" 라고 표시합니다.
        System.out.printf("%d살의 %s씨, 당신의 운세번호는 %d 입니다\n", age, name, fortune);

//        (나이) 에는 변수 age를, (이름) 에는 변수 name 을, 그리고 (난수) 에는 8. 에서 만든 난수의 숫자를 표시합니다.
//        화면에 “1:대박 2:중박 3:보통 4:망" 이라고 표시합니다
//        System.out.println("1:대박 2:중박 3:보통 4:망");
        switch (fortune) {
            case 1:
                System.out.println("대박");
                break;
            case 2:
                System.out.println("중박");
                break;
            case 3:
                System.out.println("보통");
                break;
            default:
                System.out.println("망");
                break;
        }

    }
}
