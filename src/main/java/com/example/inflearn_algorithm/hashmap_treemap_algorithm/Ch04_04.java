package com.example.inflearn_algorithm.hashmap_treemap_algorithm;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ch04_04 {
    /**
     * 모든 아나그램 찾기
     * S 문자열에서 T 문자열과 아나그램이 되는 S의 부분 문자열의 개수를 구하는 알고리즘 작성
     * bacaAacba
     * abc
     * 출력 : 3
     *
     * 한번 더 풀기 - map과 map이 같은지 비교 equals()
     */

    public static void prints() {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        System.out.println(solution(a,b));
    }

    private static int solution(String str1, String str2) {
        Map<Character,Integer> map = new HashMap<>();
        Map<Character,Integer> map2 = new HashMap<>();
        int cnt = 0, lt = 0;
        char[] arr = new char[str1.length()];
        char[] arr2 = new char[str2.length()];
        arr = str1.toCharArray();
        arr2 = str2.toCharArray();
        for (int i=0; i<str2.length()-1;i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }
        for (int i=0; i<str2.length(); i++) {
            map2.put(arr2[i], map2.getOrDefault(arr2[i], 0)+1);
        }
        for (int i=str2.length()-1; i<arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
            if (map.equals(map2)) cnt++;
            map.put(arr[lt], map.get(arr[lt])-1);
            if (map.get(arr[lt]) == 0) map.remove(arr[lt]);
            lt++;
        }
        return cnt;
    }
}
