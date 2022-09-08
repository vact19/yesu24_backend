package com.bookstore.yesu24.domain.item.common;

import com.bookstore.yesu24.domain.item.book.entity.Book;
import com.fasterxml.jackson.databind.ser.Serializers;
import lombok.Getter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@EntityListeners(value = AuditingEntityListener.class)
@Getter
@MappedSuperclass
public abstract class Item extends BaseEntity {

    @Column(nullable = false)
    protected String title;

    @Column(nullable = false)
    protected String itemDetail;

    @Column(nullable = false)
    protected int price;

    @Column(nullable = false)
    protected long stock;

    @Column(nullable = false)
    protected LocalDateTime releaseDate;


}





























