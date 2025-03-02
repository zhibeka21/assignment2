package com.example.bookapp;

import java.util.List;

public interface BookService {
    void addBook(String title, String author);
    List<Book> getBooks();
}
