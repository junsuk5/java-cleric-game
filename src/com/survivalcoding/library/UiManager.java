package com.survivalcoding.library;

import java.util.List;
import java.util.Scanner;

public class UiManager implements UserInterface {
    private final Scanner scanner = new Scanner(System.in);

    public int showMainMenuAndWaitUserInput() {
        printMainMenu();
        return waitUserInputInt();
    }

    @Override
    public void printMainMenu() {
        System.out.println("------------------------");
        System.out.println("      도서 검색 프로그램     ");
        System.out.println("========================");
        System.out.println("1. 도서 추가");
        System.out.println("2. 도서 삭제");
        System.out.println("3. 도서 정렬");
        System.out.println("4. 도서 검색");
        System.out.println("5. 도서 확인");
        System.out.println("6. 종료");
    }

    @Override
    public void printSortMenu() {
        System.out.println("정렬 기준");
        System.out.println("=============");
        System.out.println("1. 정렬");
    }

    @Override
    public void printSearchMenu() {
        System.out.println("검색어를 입력하세요");
    }

    @Override
    public void printList(List<Book> bookList) {
        System.out.println("------------------------");
        System.out.println("        도서 목록     ");
        System.out.println("========================");

        System.out.println("제목       가격  저자  페이지  발행년도");
        System.out.println("------------------------");
        for (Book book : bookList) {
            System.out.printf("%s       %d  %s  %d  %s\n",
                    book.getTitle(),
                    book.getPrice(),
                    book.getAuthor(),
                    book.getPage(),
                    book.getDate());
        }
    }

    @Override
    public String waitUserInputString() {
        return scanner.nextLine();
    }

    @Override
    public int waitUserInputInt() {
        return scanner.nextInt();
    }

    @Override
    public Book addBook() {
        System.out.print("제목 : ");
        String title = scanner.next();
        System.out.print("가격 : ");
        int price = scanner.nextInt();
        System.out.print("저자 : ");
        String author = scanner.next();
        System.out.print("페이지 : ");
        int page = scanner.nextInt();
        System.out.print("발행연도 (22.10.20) : ");
        String date = scanner.next();
        return new Book(
                title,
                price,
                author,
                page,
                date
        );
    }

}
