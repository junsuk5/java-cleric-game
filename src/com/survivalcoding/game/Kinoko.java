package com.survivalcoding.game;

public class Kinoko {
    // 멤버변수, field, 전역 변수, global variable, property
    private final int LEVEL = 10;

    private int hp;
    private char suffix;

    public Kinoko(int hp, char suffix) {
        this.hp = hp;
        this.suffix = suffix;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public char getSuffix() {
        return suffix;
    }

    public void setSuffix(char suffix) {
        this.suffix = suffix;
    }

    // method, function
    public void attack() {
        int hp;
    }

    public void run() {
        System.out.println("버섯 " + this.suffix + "는 도망갔다");
    }
}
