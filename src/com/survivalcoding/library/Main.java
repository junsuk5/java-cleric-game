package com.survivalcoding.library;

public class Main {
    public static void main(String[] args) {
        UiManager uiManager = new UiManager();
        BookManager bookManager = new BookManager();

        boolean isExit = false;

        while (!isExit) {
            int selected = uiManager.showMainMenuAndWaitUserInput();

            switch (selected) {
                case 1:
                    bookManager.add(uiManager.addBook());
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    uiManager.printList(bookManager.getBookList());
                    break;
                case 6:
                    isExit = true;
                    break;
                default:
            }
        }


    }

}
