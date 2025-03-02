package com.example.bookapp;

import com.example.bookapp.config.AppConfig;
import com.example.bookapp.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        BookService bookService = context.getBean(BookService.class);
        bookService.addBook("Spring in Action", "Craig Walls");
        bookService.addBook("Effective Java", "Joshua Bloch");

        System.out.println("Все книги: " + bookService.getBooks());
    }
}
