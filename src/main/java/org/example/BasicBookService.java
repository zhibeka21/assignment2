package org.example;
import org.example.BookService;

import com.example.bookapp.Book;
import com.example.bookapp.BookRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class BasicBookService implements BookService {
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
