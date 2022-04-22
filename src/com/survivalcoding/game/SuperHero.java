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

}
