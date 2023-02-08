package com.example.inflearn_algorithm.strings_algorithm;

import java.util.Scanner;

public class Ch01_01 {
    /**
     * 한개의 문자열을 입력받고, 특정 문자를 입력받아 해당 특정문자가 입력받은 문자열에 몇 개 존재하는지 알아내는 프로그램
     *
     * 대소문자를 구분하지 않으며 문자열의 길이는 100을 넘지 않는다.
     *
     * 입력
     * - 첫 줄에 문자열이 주어지고, 두 번째 줄에 문자가 주어진다. (ex, Computercooler)
     * - 두 번째 줄에 문자가 주어진다. (ex. c)
     *
     * 출력
     * 2
     */
    public static int FindCharacter(String str, char c) {
        int answer = 0;
        // 대소문자 구별 안함
        str = str.toUpperCase();
        c = Character.toUpperCase(c);

        for (char x : str.toCharArray()) {
            if (x == c) answer++;
        }
        return answer;
    }

    public static void prints() {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char s = sc.next().charAt(0);
        System.out.println(FindCharacter(str, s));
    }
}
