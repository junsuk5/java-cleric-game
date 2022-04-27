package com.survivalcoding.library;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class BookManager {
    private List<Book> bookList = new ArrayList<>();

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }

    public void add(Book book) {
        bookList.add(book);
    }

    public void remove(Book book) {
        bookList.remove(book);
    }

    public Book search(String query) {
        Book result = null;
        for (Book book : bookList) {
            if (book.getTitle().toLowerCase().contains(query.toLowerCase())) {
                result = book;
                break;
            }
        }
        return result;
    }

    public List<Book> sortByPriceAsc() {
        return bookList
                .stream()
                .sorted(Comparator.comparingInt(Book::getPrice))
                .collect(Collectors.toList());
    }

    public List<Book> sortByPriceDesc() {
        return bookList
                .stream()
                .sorted(Comparator.comparingInt(Book::getPrice).reversed())
                .collect(Collectors.toList());
    }

    public List<Book> sortByTitleAsc() {
        return bookList
                .stream()
                .sorted(Comparator.comparing(Book::getTitle))
                .collect(Collectors.toList());
    }

    public List<Book> sortByTitleDesc() {
        return bookList
                .stream()
                .sorted(Comparator.comparing(Book::getTitle).reversed())
                .collect(Collectors.toList());
    }

    public List<Book> sortByDateAsc() {
        return bookList
                .stream()
                .sorted(Comparator.comparing(Book::getDate))
                .collect(Collectors.toList());
    }

    public List<Book> sortByDateDesc() {
        return bookList
                .stream()
                .sorted(Comparator.comparing(Book::getDate).reversed())
                .collect(Collectors.toList());
    }
}
