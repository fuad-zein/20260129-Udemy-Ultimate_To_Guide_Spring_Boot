package com.udemy.myapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// @SpringBootApplication(
// 		scanBasePackages = {
// 		"com.udemy.myapp",
// 		"com.udemy.edu",
// 	}
// )
// public class MyappApplication {

// 	public static void main(String[] args) {
// 		SpringApplication.run(MyappApplication.class, args);
// 		System.out.println("\nApp is running...\n");
// 	}
// }

@SpringBootApplication
public class MyappApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyappApplication.class, args);
		System.out.println("\nApp is running...\n");
	}
}