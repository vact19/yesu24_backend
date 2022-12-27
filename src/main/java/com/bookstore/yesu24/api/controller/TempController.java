package com.bookstore.yesu24.api.controller;

import com.bookstore.yesu24.domain.item.book.entity.Book;
import com.bookstore.yesu24.domain.item.book.repository.BookRepository;
import lombok.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import java.net.URI;
import java.net.URISyntaxException;
import java.time.LocalDateTime;


@Controller
@RequiredArgsConstructor
public class TempController {

    private final BookRepository bookRepository;

    @GetMapping("/")
    public String test1(){

        return "index";
    }

    @GetMapping("/user/create")
    @ResponseBody
    public String test2(@RequestParam(required = false, defaultValue = "기본값") String title){
        Book book1 = Book.builder()
                .title(title)
                .itemDetail("detail")
                .price(100)
                .stock(100)
                .releaseDate(LocalDateTime.now())
                .author("author")
                .subtitle("subtitle")
                .build();

        Book saved = bookRepository.save(book1);
        return saved.getTitle();
    }



    @NoArgsConstructor
    @Data
    public static class Student{
        @NotBlank
        public String string;

    }

    @GetMapping("/deletee")
    @ResponseBody
    public ResponseEntity deleteTest() throws URISyntaxException {
        return ResponseEntity.status(HttpStatus.FOUND).location(new URI("http://localhost?fdsfs=42343")).build();

    }
// return ResponseEntity.status(HttpStatus.FOUND).location(new URI("http://localhost?fdsfs=42343")).build();




}
