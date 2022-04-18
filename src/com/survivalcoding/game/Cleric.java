package com.survivalcoding.game;

import java.util.Random;

public class Cleric {

    final int maxHp = 50;
    final int maxMp = 10;

    int hp = maxHp;
    int mp = maxMp;

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
