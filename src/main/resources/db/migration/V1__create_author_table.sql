CREATE TABLE author
(
    id                   UUID                       NOT NULL,
    first_name           VARCHAR(36)                NOT NULL,
    last_name           VARCHAR(36)                NOT NULL,
    updated_at           TIMESTAMP WITH TIME ZONE               DEFAULT NOW(),
    created_at           TIMESTAMP WITH TIME ZONE               DEFAULT NOW(),
    PRIMARY KEY (id)
);
