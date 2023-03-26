package com.example.inflearn_algorithm;

import com.example.inflearn_algorithm.sorting_searching_algorithm.Ch06_10;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InflearnAlgorithmApplication {

    public static void main(String[] args) {
        SpringApplication.run(InflearnAlgorithmApplication.class, args);
        Ch06_10.prints();
    }

}
