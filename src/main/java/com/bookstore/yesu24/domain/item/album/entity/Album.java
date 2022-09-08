package com.bookstore.yesu24.domain.item.album.entity;

import com.bookstore.yesu24.domain.item.common.Item;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Table(name = "album")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Album extends Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String subtitle;

    @Column(nullable = false)
    private String artist;

    @Builder
    public Album(String title, String itemDetail, int price, long stock, LocalDateTime releaseDate,
                 String subtitle, String artist) {
        this.title = title;
        this.itemDetail = itemDetail;
        this.price = price;
        this.stock = stock;
        this.releaseDate = releaseDate;
        this.subtitle = subtitle;
        this.artist = artist;
    }
}




















