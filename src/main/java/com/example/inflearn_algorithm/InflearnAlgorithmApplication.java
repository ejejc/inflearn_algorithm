package com.example.inflearn_algorithm;

import com.example.inflearn_algorithm.arrays_algorithm.Ch02_01;
import com.example.inflearn_algorithm.arrays_algorithm.Ch02_02;
import com.example.inflearn_algorithm.arrays_algorithm.Ch02_03;
import com.example.inflearn_algorithm.arrays_algorithm.Ch02_04;
import com.example.inflearn_algorithm.strings_algorithm.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InflearnAlgorithmApplication {

    public static void main(String[] args) {
        SpringApplication.run(InflearnAlgorithmApplication.class, args);
        Ch02_04.prints();
    }

}
