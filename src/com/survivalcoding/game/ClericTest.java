package com.survivalcoding.game;

import org.junit.Before;
import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.*;

public class ClericTest {
    Cleric cleric;
    Random random = new Random();

    @Before
    public void setUp() {
        cleric = new Cleric();
    }

    @Test
    public void selfAid() {
        for (int i = 0; i < 100; i++) {
            cleric.mp = cleric.maxMp;
            cleric.hp = random.nextInt(51);
            cleric.selfAid();
            assertEquals(cleric.maxHp, cleric.hp);
        }

        for (int i = 0; i < 100; i++) {
            cleric.mp = 4;
            int hp = random.nextInt(51);
            cleric.hp = hp;
            cleric.selfAid();
            assertEquals(hp, cleric.hp);
        }
    }

    // 이전 mp 와
    @Test
    public void pray() {
        for (int i = 0; i < 100; i++) {
            int sec = random.nextInt(10) + 1;
            int mp = random.nextInt(11);

            cleric.mp = mp;
            int recoveryMp = cleric.pray(sec);

            assertTrue(cleric.mp <= cleric.maxMp);
            assertEquals(mp + recoveryMp, cleric.mp);
        }
    }
}