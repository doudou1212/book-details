package com.graphqljava.tutorial.bookdetails.types;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookInput {
    private String name;
    private Integer pageCount;
    private String publishedAt;
    private String status;
    private AuthorInput author;
}
