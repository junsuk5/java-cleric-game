package com.survivalcoding.game;


import com.survivalcoding.util.Calculator;

// 게임 시스템 객체
public class GameMain {

    public static void main(String[] args) {
        Hero.setRandomMoney();

        Calculator.

        Cleric cleric1 = new Cleric("우서", 100, 50);
        Cleric cleric2 = new Cleric("우서", 100);
        Cleric cleric3 = new Cleric("우서");


        Sword fireSword = new Sword();
        fireSword.name = "불의 검";
        fireSword.damage = 10;

        Hero hero1 = new Hero();
        hero1.sword = fireSword;

        Hero.money = 100;

        System.out.println(Hero.money);    // 100

        Hero hero2 = new Hero();
        System.out.println(Hero.money);    // 100

        Wizard wizard = new Wizard();
        wizard.name = "닥터 스트레인지";
        wizard.hp = 100;

        wizard.heal(hero1);

        System.out.println(hero1.hp);       // 110
    }
}
