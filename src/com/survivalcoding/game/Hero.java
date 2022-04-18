package com.survivalcoding.game;

public class Hero {
    String name;
    int hp = 100;

    void attack() {

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
