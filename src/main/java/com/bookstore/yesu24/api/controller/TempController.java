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

    @Transactional
    @GetMapping("/")
    public String test1(){

        return "index";
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



    @ResponseBody
    @PostMapping("/")
    public String test2(Student student){
        if(student == null){
            System.out.println("null");
        }
        System.out.println(student.string);
        return student.getString();
    }



    @ResponseBody
    @PostMapping("/2")
    public Student2 test3(@RequestBody Student2 student2){
        if(student2 == null){
            System.out.println("null");
        }
        System.out.println("반환");
        return student2;
    }

    @AllArgsConstructor
    @NoArgsConstructor
    @Getter
    static class Student2{
        private String string;
    }
}
