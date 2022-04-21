package com.survivalcoding.game;

public class PoisonKinoko extends Kinoko {

    private int poisonCount;

    public PoisonKinoko(char suffix) {
        this(suffix, 5);
    }

    public PoisonKinoko(char suffix, int poisonCount) {
        super(suffix);
        this.poisonCount = poisonCount;
    }

    @Override
    public void attack(Hero hero) {
        super.attack(hero);

        if (poisonCount > 0) {
            System.out.println("추가로, 독 포자를 살포했다!");
            int damage = hero.getHp() / 5;
            hero.setHp(hero.getHp() - damage);
            System.out.println(damage + "포인트의 데미지!");
            poisonCount--;
        }
    }
}
