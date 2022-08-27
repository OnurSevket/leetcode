package com.onursevket.leetcode;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LeetcodeApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(LeetcodeApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        System.out.print("Hello World");
    }
}
