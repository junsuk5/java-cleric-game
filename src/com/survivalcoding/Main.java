package com.survivalcoding;

public class Main {

    public static void main(String[] args) {
        System.out.println("Java".matches("J.va"));
        System.out.println("Jaaaaaaava".matches("Ja*va"));

        String strs = "a,b:c";

        String[] array = strs.split("[,:]");
        for (String s : array) {
            System.out.println(s);
        }

        System.out.println("Java".replaceAll("a", "b"));

        System.out.println(isValidEmail("aaabbb.com"));


    }

    public static boolean isValidEmail(String email) {
        String pattern = "[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?";
        return email.matches(pattern);
    }
}
