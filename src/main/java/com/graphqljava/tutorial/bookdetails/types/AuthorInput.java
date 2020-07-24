package com.graphqljava.tutorial.bookdetails.types;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AuthorInput {
    private String firstName;
    private String lastName;
    private String id;
}
