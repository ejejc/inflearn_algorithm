package com.example.inflearn_algorithm.chapter1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ch01_10 {

    /**
     * 한 개의 문자열 s와 문자 t가 주어지면
     * 문자열 s의 각 문자가 문자 t와 떨어진 최소거리를 출력하는 프로그램을 작성해라.
     * teachermode e > 10121012210
     */

    public static void print() {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char c = sc.next().charAt(0);
        //System.out.println(shortestTextDistance(str, c));
        int[] arr = solution(str, c);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    private static int[] solution(String str, char target) {
        int p = 1000;
        int[] answer = new int[str.length()];
        for (int i=0; i<str.length(); i++) {
            if (str.charAt(i) == target) p = 0;
            else p++;
            answer[i] = p;
        }
        p = 1000;
        for (int i=str.length()-1; i>=0; i--) {
            if (str.charAt(i) == target) p = 0;
            else {
                p++;
                answer[i] = Math.min(answer[i], p);
            }
        }
        return answer;
    }

    private static String shortestTextDistance (String str, char target) {
        List<Integer> indexs = new ArrayList<>();
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                indexs.add(i);
            }
        }
        for (int i = 0; i < str.length(); i++) {
            int max = Integer.MAX_VALUE;
            for (int idx : indexs) {
                if (max > Math.abs(idx - i)) {
                    max = Math.abs(idx - i);
                }
            }
            result += max + " ";
        }
        return result;
    }
}
