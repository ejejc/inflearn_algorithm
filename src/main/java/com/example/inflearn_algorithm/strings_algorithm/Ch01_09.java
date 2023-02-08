package com.example.inflearn_algorithm.strings_algorithm;

import java.util.Scanner;

public class Ch01_09 {
    /**
     * 문자와 숫자가 섞여있는 문자열이 주어지면 그 중, 숫자만 추출하여 그 순서대로 자연수를 만든다.
     * tge0a1h205er > 01205이고, 이를 자연수를 만들면 1205가 된다.
     */
    private static String extractOnlyNumbers(String str) {
        String tmp = "";
        for (int i=0; i<str.length(); i++) {
            if(Character.isDigit(str.charAt(i))) tmp += str.charAt(i);
        }
        int i = 0;
        while (tmp.charAt(i) == '0') i++;
        return tmp.substring(i, tmp.length());
    }

    private static int solution(String str) {
        String tmp = "";
        for (int i=0; i<str.length(); i++) {
            if(Character.isDigit(str.charAt(i))) tmp += str.charAt(i);
        }
        // String을 parseInt를 사용하면 앞에 0이 사라지게 된다.
        return Integer.parseInt(tmp);
    }
    public static void print() {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(solution(str));
    }
}
