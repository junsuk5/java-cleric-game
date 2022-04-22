package com.survivalcoding.assetmanagement;

public class Book extends TangibleAsset {
    private final String isbn;

    public Book(String name, int price, String color, String isbn) {
        super(name, price, color);
        this.isbn = isbn;
    }

    public String getIsbn() {
        return isbn;
    }
}
