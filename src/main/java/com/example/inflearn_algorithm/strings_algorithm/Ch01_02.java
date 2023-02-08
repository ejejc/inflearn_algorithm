package com.example.inflearn_algorithm.strings_algorithm;

import java.util.Scanner;

public class Ch01_02 {

    /**
     *  대문자와 소문자가 같이 존재하는 문자열을 입력받아 대문자는 소문자로
     *  소문자는 대문자로 변환하여 출력하는 프로그램을 작성하세요
     *
     *  StuDY > sTUdy
     */
    public static void print() {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(CaseConversion(str));
        System.out.println(CaseCOnversionForAscii(str));
    }

    private static String CaseConversion(String str) {
        String result = "";
        char[] arr = str.toCharArray();
        for (char s : arr) {
            if (Character.isUpperCase(s)) {
                result = result + Character.toLowerCase(s);
            } else {
                result = result + Character.toUpperCase(s);
            }
        }
        return result;
    }

    // 아스키 코드를 사용하여 푸는 알고리즘
    private static String CaseCOnversionForAscii(String str) {
        // 대문자 : 65 ~ 90, 소문자 : 97 ~ 122, 소문자-32 = 대문자가 된다.
        String result = "";
        for (char x : str.toCharArray()) {
            if (x>=97 && x<=122) result += (char) (x-32);
            else result += (char) (x+32);
        }
        return result;
    }
}
