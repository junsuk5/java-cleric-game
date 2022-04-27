package com.survivalcoding.library;

import java.util.Date;

public class Book {
    private String title;
    private int price;
    private String author;
    private int page;
    private String date;

    public Book(String title, int price, String author, int page, String date) {
        this.title = title;
        this.price = price;
        this.author = author;
        this.page = page;
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }


}
