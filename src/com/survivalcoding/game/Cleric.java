package com.survivalcoding.game;

import java.util.Random;

public class Cleric {

    static final int maxHp = 50;
    static final int maxMp = 10;

    String name;
    int hp;
    int mp;

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

    void selfAid() {
        if (mp >= 5) {
            mp -= 5;
            hp = maxHp;
        }
    }

    int pray(int sec) {
        int addMp = sec + new Random().nextInt(3);

        int beforeMp = mp;
        mp = Math.min(mp + addMp, maxMp);

        return mp - beforeMp;
    }
}
