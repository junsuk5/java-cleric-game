package com.survivalcoding.game;

public class SuperHero extends Hero {
    private boolean flying;

    SuperHero(String name) {
        super(name);

        // 추가로 초기화
    }

    public void fly() {
        flying = true;
    }

    public void land() {
        flying = false;
    }

    // 어노테이션 주석
    // Generate -> override
    @Override
    void run() {
        System.out.println("겁나게 빨리 달린다");
    }

    @Override
    public void attack() {
        // 때리기 전에 뭐 해야지
        System.out.println("=======================");

        super.attack();

        // 추가 기능만 작성
        System.out.println("=======================");
    }

}
