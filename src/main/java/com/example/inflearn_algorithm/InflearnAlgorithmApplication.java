package com.example.inflearn_algorithm;

import com.example.inflearn_algorithm.chapter1.Ch01_01;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class InflearnAlgorithmApplication {

    public static void main(String[] args) {
        SpringApplication.run(InflearnAlgorithmApplication.class, args);
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char s = sc.next().charAt(0);
        System.out.println(Ch01_01.FindCharacter(str, s));
    }

}
