package com.graphqljava.tutorial.bookdetails.service;

import com.graphqljava.tutorial.bookdetails.dto.BookDTO;
import com.graphqljava.tutorial.bookdetails.model.Book;
import com.graphqljava.tutorial.bookdetails.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public Book findBookByBookId(UUID bookId) {
        return bookRepository.findBookById(bookId);
    }

    public Book saveBook(Book book) {
        return bookRepository.save(book);
    }
}
