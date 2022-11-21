package com.bookstore.yesu24.domain.genre.bookgenre.entity;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
@Table(name = "book_genre")
public class BookGenre {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 30, nullable = false)
    private String genreName;
}
