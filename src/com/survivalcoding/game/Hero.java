package com.survivalcoding.game;

public class Hero {
    private String name;        // null
    private int hp;             // 0
    private Sword sword;        // null

    // 생성자 (constructor)    : 인스턴스 생성 방법
    Hero(String name) {
        hp = 100;
        this.name = name;
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

    public void attack() {
        System.out.println(name + "은 공격했다");
        System.out.println("적에게 5포인트 데미지!!");
    }

    void sit(int sec) {
        this.hp += sec;
        System.out.println(this.name + "는 " + sec + "초 앉았다");
        System.out.println("HP가 " + sec + "만큼 회복되었다");
    }

    void run() {
        System.out.println("달린다!!!");
    }

    void sleep() {
        this.hp = 100;
        System.out.println(this.name + "은 잠을 자고 회복했다");
    }
}
