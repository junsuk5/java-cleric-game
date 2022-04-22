package com.survivalcoding.polymorphism;

public class Dog extends Animal implements Moveable, Drawable {
    @Override
    public void move() {
        System.out.println("댕청댕청");
    }

    @Override
    public void draw() {
        System.out.println("++ 개 그림 ++");
    }

    @Override
    void bark() {
        System.out.println("멍멍!!!");
    }
}
