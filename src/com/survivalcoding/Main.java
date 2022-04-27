package com.survivalcoding;

import com.survivalcoding.game.Hero;
import com.survivalcoding.quiz.A;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Set<Hero> heroSet = new HashSet<>();
        heroSet.add(new Hero("슈퍼맨"));
        heroSet.add(new Hero("슈퍼맨"));
        System.out.println(heroSet);

        List<Hero> heroes = new ArrayList<>();
        heroes.add(new Hero("슈퍼맨"));
        System.out.println(heroes.get(0).getName());


        Map<Integer, String> box = new HashMap<>();
        box.put(1, "오준석");
        box.put(2, "송주형");
        box.put(10, "최진호");
        System.out.println(box);
        box.remove(10);
        System.out.println(box);
        box.put(2, "원은정");
        System.out.println(box);

        System.out.println(box.get(10));

        Set<String> sets = new HashSet<>();
        sets.add("홍길동");
        sets.add("한석봉");
        sets.add("홍길동");
        System.out.println(sets);
        sets.remove("홍길동");
        System.out.println(sets);
        sets.remove(0);
        System.out.println(sets);

        System.out.println(sets.contains("홍길동"));

        Set<Integer> lottoNums = new HashSet<>();
        lottoNums.add(1);
        lottoNums.add(2);
        lottoNums.add(3);
        lottoNums.add(4);
        lottoNums.add(5);
        lottoNums.add(5);
        lottoNums.add(5);
        lottoNums.remove(0);
        System.out.println(lottoNums);


        // 삽입, 삭제가 빠르다
        // 검색은 느리다
        List<String> foods = new LinkedList<>();
        foods.add("피자");
        foods.add("라면");
        foods.add("떡볶이");
        System.out.println(foods);

        List<String> favoriteFoods = new ArrayList<>();
        foods.add("짜장면");
        foods.add("탕수육");
        foods.add("치킨");

//        foods.addAll(favoriteFoods);
        foods.addAll(1, favoriteFoods);
        System.out.println(foods);



        // int, long, boolean == 안 됨
        // Integer, Long, Boolean ... 으로 써야 됨
        List<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(20);
        nums.add(30);
        nums.add(40);
        System.out.println(nums);
        nums.remove(1);
        System.out.println(nums);
        nums.add(2, 35);
        System.out.println(nums);

        // Generic 제네릭
        List<String> names = new ArrayList<>();
        names.add("홍길동");
        names.add("홍길동1");
        names.add("홍길동2");
        names.add("홍길동3");
        names.add("홍길동4");
        names.add("홍길동");
        names.add("홍길동");
        System.out.println(names);

    }

}
