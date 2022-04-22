package com.survivalcoding.game;


import java.util.ArrayList;

// 게임 시스템 객체
public class GameMain {

    public static void main(String[] args) {
        Dancer dancer = new Dancer();
        Character character = new Dancer();

        if (character instanceof Hero) {
            Hero hero10 = (Hero) character;
        }

        Hero hero = new Hero("");
        SuperHero superHero = new SuperHero("");

        Hero hero1 = new SuperHero("");

        Character character1 = new SuperHero("");
        Character character2 = new Hero("");

        Character character3 = new Wizard("", 10, 10, null);

        Life life = new Wizard("", 10, 10, null);
        Life life1 = new Cleric("");

        Character wizard = new Wizard("", 10, 10, null);
        Kinoko kinoko = new Kinoko('A');

        wizard.attack(kinoko);
        ((Wizard) wizard).fireball(kinoko);
    }
}
