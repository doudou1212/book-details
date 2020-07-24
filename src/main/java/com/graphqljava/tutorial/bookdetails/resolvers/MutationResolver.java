package com.graphqljava.tutorial.bookdetails.resolvers;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
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
public class MutationResolver implements GraphQLMutationResolver {

    @Autowired
    private BookService bookService;

    public Book addBook(BookInput bookInput) {
        var authorInput = bookInput.getAuthor();
        var author = Author.builder()
                .firstName(authorInput.getFirstName())
                .lastName(authorInput.getLastName())
                .id(UUID.fromString(authorInput.getId()))
                .build();
        var book = Book.builder()
                .id(UUID.randomUUID())
                .publishedAt(OffsetDateTime.parse(bookInput.getPublishedAt(),  DateTimeFormatter.ISO_DATE_TIME))
                .name(bookInput.getName())
                .pageCount(bookInput.getPageCount())
                .status(bookInput.getStatus())
                .author(author)
                .build();
        return bookService.saveBook(book);
    }
}
