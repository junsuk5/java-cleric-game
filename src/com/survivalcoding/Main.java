package com.survivalcoding;

import com.survivalcoding.game.Hero;
import com.survivalcoding.game.Sword;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {

    public static void main(String[] args) throws ParseException {
        String text = "Hello";

        // 시작 인덱스,
        System.out.println(text.substring(0, 2));
        System.out.println(text.substring(2, 5));
        System.out.println(text.substring(1));

        System.out.println(text.replace("ll", "XX"));

        String s1 = "1, 2, 3";
        String[] splited = s1.split(", ");
        for (String s : splited) {
            System.out.println(s);
        }

        System.out.println(text.toLowerCase());
        System.out.println(text.toUpperCase());

        System.out.println(text.indexOf("e"));  // 1
        System.out.println(text.indexOf("l"));  // 2개 있을 때는 맨 앞에 꺼

        System.out.println(text.isEmpty());     // length == 0
        System.out.println(text.isBlank());     // 공백으로만 되어있는지

        StringBuilder sb = new StringBuilder();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            sb.append("Java");
        }
        long end = System.currentTimeMillis();
        System.out.println("StringBuilder : " + (end - start) + "ms");

        String result = "";
        start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            result += "Java";
        }
        end = System.currentTimeMillis();
        System.out.println("String : " + (end - start) + "ms");
    }

    private static void 같음비교() {
        Sword sword1 = new Sword("불의 검", 100);
        Sword sword2 = new Sword("불의 검", 100);

        System.out.println(sword1);
        System.out.println(sword2);

        System.out.println(sword1.hashCode());
        System.out.println(sword2.hashCode());

        // 내용 비교
        if (sword1.equals(sword2)) {
            System.out.println("똑같이 생겼다");
        }
    }

    private static void 데이트포멧() throws ParseException {
        Date now = new Date();
        SimpleDateFormat dateFormat =
                new SimpleDateFormat("yyyy년 MM월 dd hh:mm:ss");

        String dateString = dateFormat.format(now);
        System.out.println(dateString);

        Date date = dateFormat.parse("2040년 12월 19 10:10:10");
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);

        // 요일
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        System.out.println(dayOfWeek);
    }

    private static void 달력() {
        Date now = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(now);

        int year = calendar.get(Calendar.YEAR);
        System.out.println(year);

        int month = calendar.get(Calendar.MONTH);
        calendar.set(Calendar.MONTH, month + 1);

        System.out.println(calendar.getTime());
    }

    private static void 날짜() {
        Date now = new Date();
        System.out.println(now);
        System.out.println(now.getTime());

        Date past = new Date(234234214344L);
        System.out.println(past);

        System.out.println(now.after(past));
    }

    public static void 날짜계산() {
        long time = System.currentTimeMillis();

        long sec = time / 1000;     // 초
        long min = sec / 60;        // 분
        long hour = min / 60;       // 시
        long day = hour / 24;       // 일
        long month = day / 30;      // 대략 월
        long year = month / 12;     // 대략 년

        System.out.printf("%d년 %d월 %d일 %d시 %d분 %d초",
                year, month, day, hour, min, sec);
    }

    public static void 시간재기() {
        long start = System.currentTimeMillis();

        for (int i = 0; i < 5000000; i++) {
            System.out.println(i);
        }

        long end = System.currentTimeMillis();
        System.out.println((end - start) + "ms");
    }
}
