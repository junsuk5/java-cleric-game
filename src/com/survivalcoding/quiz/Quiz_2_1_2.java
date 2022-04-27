package com.survivalcoding.quiz;

public class Quiz_2_1_2 {
    public static void main(String[] args) {

    }

    public static String getPath(String path, String fileName) {
        StringBuilder sb = new StringBuilder();
        if (path.matches(".*\\\\$")) {
            sb.append(path).append("\\").append(fileName);
        } else {
            sb.append(path).append(fileName);
        }
        return sb.toString();
    }
}
