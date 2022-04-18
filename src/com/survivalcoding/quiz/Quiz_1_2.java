package com.survivalcoding.quiz;

//화면에 다음과 같은 결과를 표시하는 소스 코드를 작성 해 주세요.
//소스 코드 안에 3을 변수 a 에, 5 를 변수 b 에 대입합니다.
//그 곱셈의 결과를 변수 c 에 대입합니다.
//변수 a, b, c 를 이용하여 다음과 같이 화면에 출력합니다.
// 출력 예)
//가로 3, 세로 5의 직사각형의 면적은 15

public class Quiz_1_2 {
    // main 엔터
    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        int c = a * b;
        // sout
        System.out.println("가로 " + a + ", 세로 " + b + "의 직사각형의 면적은 " + c);
        System.out.printf("가로 %d, 세로 %d의 직사각형의 면적은 %d", a, b, c);

    }// Ctrl + Alt + L
}
