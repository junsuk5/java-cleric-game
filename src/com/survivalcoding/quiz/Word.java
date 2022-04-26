package com.survivalcoding.quiz;

public class Word {
    public static void main(String[] args) {
        Word word = new Word("apple");
        System.out.println(word.isVowel(0));    // true
        System.out.println(word.isVowel(1));    // false
        System.out.println(word.isVowel(4));    // true
    }

    private String letters;

    public Word(String letters) {
        this.letters = letters;
    }

    /**
     * i번째 글자가 모음인지?
     * a, i, u, e, o, A, I, U, E, O
     */
    public boolean isVowel(int i) {
        return "aiueoAIUEO".contains(letters.substring(i, i + 1));
    }

    /**
     * i번째 글자가 자음인지?
     */
    public boolean isConsonant(int i) {
        return !isVowel(i);
    }
}
