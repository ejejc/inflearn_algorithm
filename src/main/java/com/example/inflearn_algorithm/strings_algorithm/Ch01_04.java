package com.example.inflearn_algorithm.strings_algorithm;

import java.util.ArrayList;
import java.util.Scanner;

public class Ch01_04 {
    /**
     * N개의 단어가 주어지면 각 단어를 뒤집어 출력하는 프로그램을 작성하세요.
     * <p>
     * 첫 줄에 자연수 3<= N <=20 이 주어진다.
     * 두 번째 줄부터 N개의 단어가 각 줄에 하나씩 주어지며 단어는 영어로만 구성된다.
     * <p>
     * N개의 단어를 입력된 순서대로 한 줄에 하나씩 뒤집어서 출력한다.
     */
    public static ArrayList<String> solution(int n, String[] str) {
        ArrayList<String> answer = new ArrayList<>();
        for (String s : str) {
            String temp = "";
            char[] charArr = s.toCharArray();
            for (int i=charArr.length-1; i>=0; i--) {
                temp = temp + charArr[i];
            }
            answer.add(temp);
        }
        return answer;
    }

    public static ArrayList<String> solutionResult(int n, String[] str) {
        ArrayList<String> answer = new ArrayList<>();
        for (String s : str) {
            // StringBuilder를 알아보고 reverse() 뒤집어지는 메소드
            String tmp = new StringBuilder(s).reverse().toString();
            answer.add(tmp);
        }
        return answer;
    }

    public static ArrayList<String> solutionResultLtRt(int n, String[] str) {
        ArrayList<String> answer = new ArrayList<>();
        for (String s : str) {
            char[] c = s.toCharArray();
            int lt = 0, rt = s.length()-1;
            while (lt < rt) {
                char temp = c[lt];
                c[lt] = c[rt];
                c[rt] = temp;
                lt ++;
                rt --;
            }
            String temp = String.valueOf(c); // char[] 을 string화 시켜서 넣어준다.
            answer.add(temp);
        }
        return answer;
    }


    public static void print() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] str = new String[n];
        for (int i=0; i<n; i++) {
            str[i] = sc.next();
        }
        for (String x : solutionResultLtRt(n, str)) {
            System.out.println(x);
        }
    }
}
