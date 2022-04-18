package com.survivalcoding.game;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ClericTest {
    Cleric cleric;

    @Before
    public void setUp() throws Exception {
        cleric = new Cleric();
    }

    @Test
    public void selfAid() {
        cleric.hp = 0;
        cleric.selfAid();
        assertEquals(100, cleric.hp);
    }

    @Test
    public void pray() {
        int recoveryMp = 0;

        cleric.mp = 0;
        recoveryMp = cleric.pray(3);
        assertEquals(0, cleric.mp);
        assertEquals(0, recoveryMp);

        cleric.mp = 4;
        recoveryMp = cleric.pray(3);
        assertEquals(4, cleric.mp);
        assertEquals(0, recoveryMp);

        cleric.mp = 5;
        recoveryMp = cleric.pray(3);
        assertTrue(8 <= cleric.mp && cleric.mp <= 10);
        assertEquals(0, cleric.mp);
        assertTrue(3 <= recoveryMp && recoveryMp <= 5);

        cleric.mp = 10;
        recoveryMp = cleric.pray(3);
        assertEquals(10, cleric.mp);
        assertEquals(0, recoveryMp);
    }
}