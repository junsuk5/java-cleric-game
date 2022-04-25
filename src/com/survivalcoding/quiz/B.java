package com.survivalcoding.quiz;

public class B extends Y {
    public static void main(String[] args) {
        X obj = new A();
        obj.a();

        Y y1 = new A();
        Y y2 = new B();

        y1.a();     // A -> a()
        y2.a();     // B -> a()
    }

    @Override
    public void a() {
        System.out.println("Ba");
    }

    @Override
    public void b() {
        System.out.println("Bb");
    }

    public void c() {
        System.out.println("Bc");
    }
}
