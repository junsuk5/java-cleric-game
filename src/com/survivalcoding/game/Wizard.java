package com.survivalcoding.game;

public class Wizard {
    private String name;
    private int hp;
    private int mp;
    private Wand wand;

    public Wizard(String name, int hp, int mp, Wand wand) {
        this.name = name;
        this.hp = hp;
        this.mp = mp;
        this.wand = wand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null) {
            throw new IllegalArgumentException("이름은 null 일 수 없다");
        }
        if (name.length() < 3) {
            throw new IllegalArgumentException("이름은 3글자 이상이어야 한다");
        }
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = Math.max(0, hp);
    }

    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        if (mp < 0) {
            throw new IllegalArgumentException("mp는 0 이상이어야 한다");
        }
        this.mp = mp;
    }

    public Wand getWand() {
        return wand;
    }

    public void setWand(Wand wand) {
        if (wand == null) {
            throw new IllegalArgumentException("지팡이는 Null일 수 없다");
        }
        this.wand = wand;
    }

    void heal(Hero hero) {
        if (wand != null) {
            int basePoint = 10;
            int recoveryPoint = (int) (basePoint * wand.getPower());
            hero.setHp(hero.getHp() + recoveryPoint);
        }
    }
}
