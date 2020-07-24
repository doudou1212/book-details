CREATE TABLE book
(
    id                   UUID                       NOT NULL,
    author_id                   UUID                       NOT NULL,
    name           VARCHAR(36)                NOT NULL,
    page_count           INTEGER                    NOT NULL,
    status               VARCHAR(10)                NOT NULL    DEFAULT 'PUBLISHED',
    published_at         TIMESTAMP WITH TIME ZONE   NOT NULL,
    updated_at           TIMESTAMP WITH TIME ZONE               DEFAULT NOW(),
    created_at           TIMESTAMP WITH TIME ZONE               DEFAULT NOW(),
    PRIMARY KEY (id),
     FOREIGN KEY (author_id) REFERENCES author(id)
);
