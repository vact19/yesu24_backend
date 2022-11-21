package com.bookstore.yesu24.domain.item.common;

import com.bookstore.yesu24.domain.item.book.entity.Book;
import com.fasterxml.jackson.databind.ser.Serializers;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@EntityListeners(value = AuditingEntityListener.class)
@Getter
@MappedSuperclass
@AllArgsConstructor
// Entity 클래스가 아니지만, Entity 클래스에 상속해서 사용하기 때문에 NoArgs 필요 // super();
@NoArgsConstructor
public abstract class Item extends BaseEntity {

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String itemDetail;

    @Column(nullable = false)
    private int price;

    @Column(nullable = false)
    private long stock;

    @Column(nullable = false)
    private LocalDateTime releaseDate;



}





























