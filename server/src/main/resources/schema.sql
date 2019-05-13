CREATE TABLE IF NOT EXISTS users(
    id int auto_increment primary key,
    name varchar(255) not null,
    created_at timestamp not null as current_timestamp
);