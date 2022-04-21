package com.survivalcoding.game;

import java.util.Random;

public class Cleric {

    public static final int maxHp = 50;
    public static final int maxMp = 10;

    private String name;
    private int hp;
    private int mp;



    Cleric(String name, int hp, int mp) {
        this.name = name;
        this.hp = hp;
        this.mp = mp;
    }

    Cleric(String name, int hp) {
        this(name, hp, maxMp);
    }

    Cleric(String name) {
        this(name, maxHp, maxMp);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }

    private void die() {
        System.out.println("꽥!!");
    }

    public void selfAid() {
        if (mp >= 5) {
            mp -= 5;
            hp = maxHp;
        }
    }

    public int pray(int sec) {
        int addMp = sec + new Random().nextInt(3);

        int beforeMp = mp;
        mp = Math.min(mp + addMp, maxMp);

        return mp - beforeMp;
    }
}
