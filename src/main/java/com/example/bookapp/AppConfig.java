package com.example.bookapp;

import org.example.BookService;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import java.util.List;

@Configuration
@ComponentScan("com.example.bookapp")
public class AppConfig {
    @Service
    public static class BasicBookService implements BookService {
        private final BookRepository bookRepository;

        public BasicBookService(BookRepository bookRepository) {
            this.bookRepository = bookRepository;
        }

        @Override
        public void addBook(String title, String author) {
            bookRepository.addBook(new Book(title, author));
        }

        @Override
        public List<Book> getBooks() {
            return bookRepository.getAllBooks();
        }
    }
}
