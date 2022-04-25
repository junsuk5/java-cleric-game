package com.survivalcoding.quiz;

public class A extends Y {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();

        Y[] array = { a, b };
        for (Y y : array) {
            y.b();
        }

//        X[] array = { a, b };
//        for (X y : array) {
//            if (y instanceof A) {
//                ((A) y).b();
//            }
//
//            if (y instanceof B) {
//                ((B) y).b();
//            }
//        }
    }

    @Override
    public void a() {
        System.out.println("Aa");
    }

    @Override
    public void b() {
        System.out.println("Ab");
    }

    public void c() {
        System.out.println("Ac");
    }
}
