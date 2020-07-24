package com.graphqljava.tutorial.bookdetails.dto;

import com.graphqljava.tutorial.bookdetails.model.Author;
import com.graphqljava.tutorial.bookdetails.model.Book;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;
import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BookDTO {

    private UUID id;
    private String name;
    private Integer pageCount;
    private String status;
    private OffsetDateTime publishedAt;
    private Author author;
}
