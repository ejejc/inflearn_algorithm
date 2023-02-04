package com.example.inflearn_algorithm.chapter1;

import java.util.Scanner;

public class Ch01_05 { // 못 풀었음 ..
    /**
     * 영어 알파벳과 특수문자로 구성된 문자열이 주어지면 영어 알파벳만 뒤집고,
     * 특수문자는 자기 자리에 그대로 있는 문자열을 만들어 출력하는 프로그램을 작성하세요.
     *
     * a#b!GE*T@S > S#T!EG*b@a
     */

    private static String flipSepcificCharacter(String str) {
        // 대문자 : 65 ~ 90, 소문자 : 97 ~ 122, 소문자-32 = 대문자가 된다.
        char[] arr = str.toCharArray();
        int lt = 0;
        int rt = arr.length-1;
        while (lt < rt) {
            // 해당 문자가 알파벳인지 여부 Character 클래스에서 제공해주는 메소드 사용
            if (!Character.isAlphabetic(arr[lt])) {
                lt++;
            } else if (!Character.isAlphabetic(arr[rt])) {
                rt--;
            } else {
                char tmp = arr[lt];
                arr[lt] = arr[rt];
                arr[rt] = tmp;
                lt++;
                rt--;
            }
        }
        return String.valueOf(arr);
    }

    private static boolean isalphabet(char c) {
        return (c>=65 && c <=90) || (c >= 97 && c<=122);
    }

    public static void print() {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(flipSepcificCharacter(str));
    }


}
