package com.example.inflearn_algorithm.chapter1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ch01_06 {

    /**
     * 소문자로 된 한개의 문자열이 입력되면 중복된 문자를 제거하고 출력하는 프로그램을 작성해라
     * 중복이 제거된 문자열의 각 문자는 원래 문자열의 순서를 유지해라
     * ksekkset > kset
     */

    private static String removeDuplicateChar(String str) {
        String result = "";
        char[] arr = str.toCharArray();
        List<String> lists = new ArrayList<>();

        for (char c : arr) {
          if (!lists.contains(Character.toString(c))) {
              lists.add(Character.toString(c));
          }
        }

        for (String s : lists) {
            result += s;
        }
        return result;
    }

    // 이게 더 올바른 방법 같다!
    private static String otherResult(String str) {
        String answer = "";
        for (int i=0; i<str.length(); i++) {
            // indexOf() 를 사용해서 해당 문자가 처음으로 발견된 index와 현재 i가 같으면
            // 문자열 중에 중복되지 않는 문자라고 볼 수 있다.
            if (str.indexOf(str.charAt(i)) == i) {
                answer += str.charAt(i);
            }
        }
        return answer;
    }
    public static void print() {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(removeDuplicateChar(str));
    }
}
