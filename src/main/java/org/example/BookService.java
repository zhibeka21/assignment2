package org.example;

import com.example.bookapp.Book;

import java.util.List;

public interface BookService {
    void addBook(String title, String author);
    List<Book> getBooks();
}
