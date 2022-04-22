package com.survivalcoding.game;

public class Kinoko extends Monster {
    // 멤버변수, field, 전역 변수, global variable, property
    private final int LEVEL = 10;

    private char suffix;

    public Kinoko(char suffix) {
        this.suffix = suffix;
    }

    public char getSuffix() {
        return suffix;
    }

    public void setSuffix(char suffix) {
        this.suffix = suffix;
    }

    // method, function
    public void attack(Hero hero) {
        System.out.println("버섯 " + suffix + "의 공격");
        System.out.println("10의 데미지");
        hero.setHp(hero.getHp() - 10);
    }

    public void run() {
        System.out.println("버섯 " + this.suffix + "는 도망갔다");
    }
}
