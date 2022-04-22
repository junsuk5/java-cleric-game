package com.survivalcoding.game;

public class Wizard extends Character implements Life {
    private int mp;
    private Wand wand;

    public Wizard(String name, int hp, int mp, Wand wand) {
        this.mp = mp;
        this.wand = wand;
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


    public void fireball(Kinoko kinoko) {

    }

    @Override
    public void attack(Monster monster) {

    }
}
