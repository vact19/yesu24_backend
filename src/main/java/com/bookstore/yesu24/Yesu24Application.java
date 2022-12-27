package com.bookstore.yesu24;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Yesu24Application {

	public static void main(String[] args) {
		SpringApplication.run(Yesu24Application.class, args);
		System.out.println("====시스템 속성====");
		System.getProperties().list(System.out);
		System.out.println("====환경 변수====");
		System.out.println(System.getenv());
		System.out.println("====프로그램 인자====");
		for (String arg : args) {
			System.out.print(arg + " | ");
		}
	}

}
