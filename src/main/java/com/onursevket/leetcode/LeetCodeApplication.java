package com.onursevket.leetcode;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LeetCodeApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(LeetCodeApplication.class, args);
    }

    @Override
    public void run(String... args) {
        System.out.print("Hello World");
    }
}
