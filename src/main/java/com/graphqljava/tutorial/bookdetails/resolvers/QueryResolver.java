package com.graphqljava.tutorial.bookdetails.resolvers;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.graphqljava.tutorial.bookdetails.dto.BookDTO;
import com.graphqljava.tutorial.bookdetails.model.Author;
import com.graphqljava.tutorial.bookdetails.model.Book;
import com.graphqljava.tutorial.bookdetails.service.BookService;
import com.graphqljava.tutorial.bookdetails.types.BookInput;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

@Component
@AllArgsConstructor
public class QueryResolver implements GraphQLQueryResolver {

    @Autowired
    private BookService bookService;

    public Book getBookById(String bookId) {
        return bookService.findBookByBookId(UUID.fromString(bookId));
    }
}
