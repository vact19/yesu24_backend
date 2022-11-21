package com.bookstore.yesu24.domain.item.book.entity;

import com.bookstore.yesu24.domain.genre.bookgenre.entity.BookGenre;
import com.bookstore.yesu24.domain.item.common.Item;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Table(name = "Book")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Book extends Item {

    @Id // Unique 제약
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String author;

    @Column
    private String subtitle; // 부제

    @ManyToOne
    @JoinColumn(name = "genre_id")
    private BookGenre bookGenre;

    @Builder
    public Book(String title, String itemDetail, int price, long stock, LocalDateTime releaseDate, Long id, String author, String subtitle) {
        super(title, itemDetail, price, stock, releaseDate);
        this.id = id;
        this.author = author;
        this.subtitle = subtitle;
    }


}



































