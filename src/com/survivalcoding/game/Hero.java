package com.survivalcoding.game;

public class Hero extends Character {
    private Sword sword;        // null

    // 생성자 (constructor)    : 인스턴스 생성 방법
    public Hero(String name) {
    }

    public Sword getSword() {
        return sword;
    }

    public void setSword(Sword sword) {
        this.sword = sword;
    }

    public static int getMoney() {
        return money;
    }

    public static void setMoney(int money) {
        Hero.money = money;
    }

    static int money;

    static void setRandomMoney() {
        Hero.money = (int) (Math.random() * 1000);
        System.out.println(money + "의 소지금을 초기화");
    }



    @Override
    public void attack(Monster kinoko) {
        System.out.println("은 공격했다");
        System.out.println("적에게 5포인트 데미지!!");
    }

    @Override
    public String toString() {
        return "Hero{" +
                "sword=" + sword +
                '}';
    }


}
