package com.survivalcoding.game;

public class Hero {
    String name;        // null
    int hp;             // 0
    Sword sword;        // null

    static int money;

    static void setRandomMoney() {
        Hero.money = (int) (Math.random() * 1000);
        System.out.println(money + "의 소지금을 초기화");
    }

    Hero() {
        this("기본값");
    }

    // 생성자 (constructor)    : 인스턴스 생성 방법
    Hero(String name) {
        hp = 100;
        this.name = name;
    }

    void attack() {
        System.out.println(name + "은 공격했다");
        System.out.println("적에게 5포인트 데미지!!");
    }

    void sit(int sec) {
        this.hp += sec;
        System.out.println(this.name + "는 " + sec + "초 앉았다");
        System.out.println("HP가 " + sec + "만큼 회복되었다");
    }

    void run() {

    }

    void sleep() {
        this.hp = 100;
        System.out.println(this.name + "은 잠을 자고 회복했다");
    }
}
