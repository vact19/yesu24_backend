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

    // 1번장르 더미데이터 만들어두고, new Book(new BookGenre(1)) 이렇게 PK만으로 객체 생성하고 save(book)했을 때,
    // 알아서 book의 BookGenre에 더미데이터의 genreName값이 들어가는지 확인.
    // ID를 명시하고 save했으니까 당연히 merge가 일어나서 값이 합쳐지나?(둘째줄 주석처럼 되나?)
}
