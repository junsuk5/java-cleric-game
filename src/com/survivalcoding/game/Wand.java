package com.survivalcoding.game;

public class Wand {
    private String name;
    private double power;

    public Wand(String name, double power) {
        this.name = name;
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        // 0.5 <= power <= 100.0
        if (0.5 <= power && power <= 100.0) {
            throw new IllegalArgumentException("마력은 0.5 <= power <= 100.0 여야 한다");
        }
        this.power = power;
    }
}
