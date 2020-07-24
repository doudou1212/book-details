package com.graphqljava.tutorial.bookdetails.model;

import javax.persistence.*;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

@Entity
@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Book {

    @Id
    private UUID id;

    private String name;

    @Column(name = "page_count")
    private Integer pageCount;

    private String status;

    @Column(name = "published_at")
    private OffsetDateTime publishedAt;

    @CreatedDate
    @Column(name = "created_at", updatable = false)
    protected OffsetDateTime createdAt;

    @LastModifiedDate
    @Column(name = "updated_at")
    protected OffsetDateTime updatedAt;

    @OneToOne( cascade=CascadeType.ALL )
    @JoinColumn(name = "author_id")
    private Author author;
}
