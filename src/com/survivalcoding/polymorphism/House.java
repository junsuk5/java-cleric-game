package com.survivalcoding.polymorphism;

public class House implements Drawable {
    @Override
    public void draw() {
        System.out.println("      ^       ");
        System.out.println("     ^ ^      ");
        System.out.println("    ^   ^      ");
        System.out.println("   ^     ^      ");
        System.out.println("===============");
        System.out.println("====   집   ====");
        System.out.println("===============");
    }
}
