package com.survivalcoding.game;


// 게임 시스템 객체
public class GameMain {

    public static void main(String[] args) {
        Wizard wizard = new Wizard("홍길동", 10, 10);

        String name = "임꺽정";
        //
        // ...
        name = null;
        //

        wizard.setName(name);
    }
}
