package com.example.inflearn_algorithm.strings_algorithm;

import java.util.Scanner;

public class Ch01_12 {
    /**
     * 현수는 영희에게 알파벳 대문자로 구성된 비밀편지를 매일 컴퓨터를 이용하여 보낸다.
     * 알파벳 한 문자마다 #, *이 7개로 구성되어 있다.
     * #*****# > 7자리 2진수로 변경한다. > 1000001 > 10진수화 > 65 > 'A'
     */
    public static void print() {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        String str = sc.next();
        System.out.println(solution(cnt, str));
    }

    private static String solution(int cnt, String str) {
        str = str.replaceAll("#","1");
        str = str.replaceAll("[*]", "0");
        char[] arr = new char[cnt];
        int j = 0;
        for (int i=0; i<str.length(); i=i+7) {
            arr[j] =(char)Integer.parseInt(str.substring(i, i+7), 2);
            j++;
        }
        return new String(arr);
    }
}
