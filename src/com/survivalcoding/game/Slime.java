package com.survivalcoding.game;

public class Slime extends Monster {
    public static void main(String[] args) {
        Slime slime = new Slime();
        Monster monster = new Slime();

        slime.run();
        monster.run();
    }

    @Override
    public void run() {
        System.out.println("슬라임은 슬금슬금 도망쳤다");
    }
}
