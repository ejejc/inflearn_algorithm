package com.example.inflearn_algorithm.chapter1;

import java.util.Scanner;

public class Ch01_07 {
    /**
     * 앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 회문 문자열이라고 한다.
     * 문자열이 회문 문자열이면 > YES
     * 문자열이 회문 문자열이 아니면 > NO
     * 를 출력하는 프로그램을 작성하라.
     */

    public static String validPalindrome(String str) {
        str = str.toLowerCase();
        String btwStr = new StringBuilder(str).reverse().toString();
        if (str.equals(btwStr)) return "YES";
        else return "NO";
    }

    public static String newSloution(String str) {
        String answer = "YES";
        str = str.toUpperCase();
        int len = str.length();
        for (int i=0; i<len/2; i++) {
            if (str.charAt(i) != str.charAt(len-i-1)) return "NO";
        }
        return answer;
    }
    public static void print() {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(validPalindrome(str));
    }
}
