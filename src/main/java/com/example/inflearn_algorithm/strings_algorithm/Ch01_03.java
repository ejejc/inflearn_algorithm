package com.example.inflearn_algorithm.strings_algorithm;

import java.util.Scanner;

public class Ch01_03 {

    /**
     * 한 개의 문장이 주어지면 그 문장 속에서 가장 긴 단어를 출력하는 프로그램을 작성하자.
     * 문장 속의 각 단어는 공백으로 구분된다.
     *
     * 첫줄에 가장 긴 단어를 출력한다.
     * 가장 길이가 긴 단어가 여러개일 경우 문장속에서가 가장 앞쪽에 위치한 단어를 출력한다.
     *
     * it is time to study > study
     */

    public static String wordsInSentence(String str) {
        String[] arr = str.split(" ");
        String result = "";
        int maxCnt = -1; // Integer.MIN_VALUE를 사용하여 적을 수 있다.
        for (String s : arr) {
            // >= -> > 로 바꾸면 for문 두개 필요 없이 하나로 가능
            // 길이가 같을 경우 앞쪽 단어가 유지되게 하려면 =을 제외해야 한다.
            if (s.length() >= maxCnt) {
                maxCnt = s.length();
            }
        }

        for (String s : arr) {
            if (s.length() == maxCnt) {
                result = s;
                break;
            }
        }

        return result;
    }

    public static String wordsInSentenceRepac(String str) {
        String[] arr = str.split(" ");
        String result = "";
        int cnt = Integer.MIN_VALUE;
        for (String s : arr) {
            if (s.length() > cnt) {
                cnt = s.length();
                result = s;
            }
        }
        return result;
    }
    public static void print() {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(wordsInSentence(s));
    }
}
