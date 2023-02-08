package com.example.inflearn_algorithm.strings_algorithm;

import java.util.Scanner;

public class Ch01_08 {
    /**
     * 앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 팰린드롭이라고 한다.
     * 문자열이 입력되면 해당 문자열이 팰린드롬이면 > YES
     * 팰린드롭이 아니면 > NO
     *
     * 단, 회문 검사 시, 알파벳만 가지고 회문을 검사하며 대소문자를 구분하지 않는다.
     * 즉 알파벳 이외의 문자들은 무시합니다.
     */

    public static String validPalindrome2(String str) {
        String tempStr = "";
        for (int i=0; i<str.length(); i++ ) {
            if (Character.isAlphabetic(str.charAt(i))) {
                tempStr += str.charAt(i);
            }
        }

        tempStr = tempStr.toLowerCase();
        String reverseStr = new StringBuilder(tempStr).reverse().toString();
        if (tempStr.equals(reverseStr)) return "YES";
        else return "NO";
    }

    public static String solution(String str) {
        // replaace는 정규식 사용 안되고 replaceAll만 사용 가능하다. A-Z가 ^(아니면) "" 빈문자로 바꿔라! 라는 정규식이다.
        str = str.toUpperCase().replaceAll("[^A-Z]", "");
        String tmp = new StringBuilder(str).reverse().toString();
        if (str.equals(tmp)) return "YES";
        else return "NO";
    }

    public static void print() {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(validPalindrome2(str));
    }

}
