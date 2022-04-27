package com.survivalcoding.library;

import java.util.List;

public interface UserInterface {
    void printMainMenu();
    void printSortMenu();
    void printSearchMenu();
    void printList(List<Book> bookList);
    String waitUserInputString();
    int waitUserInputInt();
    Book addBook();
}
