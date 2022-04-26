package com.survivalcoding.quiz;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Quiz_14_1 {
    public static void main(String[] args) {
        final Date now = new Date();
        final Calendar calendar = Calendar.getInstance();
        calendar.setTime(now);

        final int day = calendar.get(Calendar.DAY_OF_MONTH);
        calendar.set(Calendar.DAY_OF_MONTH, day + 100);

        final Date after100day = calendar.getTime();

        final SimpleDateFormat dateFormat =
                new SimpleDateFormat("서기 yyyy년 MM월 dd일");

        System.out.println(dateFormat.format(after100day));
    }
}
