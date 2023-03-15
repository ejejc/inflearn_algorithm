package com.example.programmers.level2;

import java.util.*;

public class Ch01 {
    /**
     * 쵀댓값과 최솟값 구하기 알고리즘
     *
     * 문제 :
     * 문자열 s에는 공백으로 구분된 숫자들이 저장되어 있다.
     * str에 나타나는 숫자 중 최소값과 최대값을 찾아 "최소값 최대값" 형태로 반환하는 함수를 작성해라.
     */

    public static void prints() {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        solution(n);
    }
    public static String solution(String s) {
        String answer = "";
        String[] arr = s.split(" ");
        List<Integer> list = new ArrayList<>();
        for (String str : arr) {
            list.add(Integer.parseInt(str));
        }
        answer = answer + Collections.min(list) +" ";
        answer = answer + Collections.max(list);

        return answer;
    }
}
