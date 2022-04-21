package com.survivalcoding.game;

public class Wand extends Weapon {
    Attribute attribute;

    public Wand(String name, Attribute attribute) {
        this.attribute = attribute;
    }

    public void setAttribute(Attribute attribute) {
        this.attribute = attribute;
    }
}
