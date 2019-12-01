package pl.itacademy.lesson15;

import java.util.ArrayList;
import java.util.List;

public class BooksShelf {
    List<? super Box> bookList = new ArrayList<>();

    public void addBook(Box<Book> bookBox) {
        bookList.add(bookBox);
    }

    public void printBookShelf() {
        System.out.println(bookList);
    }
}
