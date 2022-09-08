package com.bookstore.yesu24.domain.item.book.repository;

import com.bookstore.yesu24.domain.item.book.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
