package com.survivalcoding.polymorphism;

public class Cat extends Animal implements Moveable, Drawable {
    @Override
    public void move() {
        System.out.println("사뿐사뿐");
    }

    @Override
    public void draw() {
        System.out.println(" 고양이 그림 ");
    }

    @Override
    void bark() {
        System.out.println("야옹!!");
    }
}
