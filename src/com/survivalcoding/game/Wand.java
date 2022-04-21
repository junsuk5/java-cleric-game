package com.survivalcoding.game;

import java.util.Scanner;

public class Wand {
    private String name;
    private double power;

    public static void main(String[] args) {
        Wand wand = new Wand();

        String name = wand.getName();

        if (name == null) {
            System.out.println("완드의 이름을 적어 주세요");
            name = new Scanner(System.in).nextLine();

            if (name == null) {
                throw new IllegalArgumentException("이름이 null 일 수 없습니다.");
            }
            if (name.length() <= 2) {
                throw new IllegalArgumentException("이름이 너무 짧습니다.");
            }
            wand.setName(name);
        }

        double power = wand.getPower();
        if (power == 0.0) {
            System.out.println("완드의 power 를 다시 설정해주세요");
            power = new Scanner(System.in).nextDouble();
            wand.setPower(power);
        }
    }

    public String getName() {
        return name;
    }

    //  1. 마법사나 지팡이의 이름은 null 일 수 없고, 반드시 3문자 이상이어야 한다
    public void setName(String name) {
        this.name = name;
    }

    public double getPower() {
        return power;
    }

    //  2. 지팡이의 마력은 0.5 이상 100.0 이하여야 한다.
    public void setPower(double power) {
        if (power < 0.5) {
            throw new IllegalArgumentException("파워가 너무 작습니다.");
        }
        if (power > 100.0) {
            throw new IllegalArgumentException("파워가 너무 큽니다.");
        }
        this.power = power;
    }
}