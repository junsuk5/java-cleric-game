package com.survivalcoding.polymorphism;

import com.survivalcoding.game.Monster;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        House house = new House();

//        Animal[] animals = { cat, dog };
//        Moveable[] moveables = { cat, dog };
        Drawable[] drawables = { cat, dog, house };

//        for (Animal animal : animals) {
//            animal.bark();
//        }
//
//        for (Moveable moveable : moveables) {
//            moveable.move();
//        }

        for (Drawable drawable : drawables) {
            drawable.draw();
            if (drawable instanceof Moveable) {
                ((Moveable) drawable).move();
            }
            if (drawable instanceof Animal) {
                ((Animal) drawable).bark();
            }
        }
    }
}
