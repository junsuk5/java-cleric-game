package com.survivalcoding.quiz;

public class Quiz_2_1_2 {
    public static void main(String[] args) {

    }

    public static String getPath(final String path, final String fileName) {
        String result = path;
        if (!path.endsWith("\\")) {
            result = path + "\\";
        }
        return result + fileName;
    }
}
