package com.example.inflearn_algorithm;

import com.example.inflearn_algorithm.chapter1.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class InflearnAlgorithmApplication {

    public static void main(String[] args) {
        SpringApplication.run(InflearnAlgorithmApplication.class, args);
        Ch01_11.print();
    }

}
