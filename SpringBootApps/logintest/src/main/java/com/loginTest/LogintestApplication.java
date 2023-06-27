package com.loginTest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackages = { "com.loginTest.Controller" })
public class LogintestApplication {

	public static void main(String[] args) {
		SpringApplication.run(LogintestApplication.class, args);

		System.out.println("Nitish it`s started !!!!! :-)");
	}

}
