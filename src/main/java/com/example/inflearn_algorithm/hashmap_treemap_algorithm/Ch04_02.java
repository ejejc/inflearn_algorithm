package com.example.inflearn_algorithm.hashmap_treemap_algorithm;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ch04_02 {
    /**
     * 아나그램 해쉬
     * 두 문자열의 알파벳 순서는 다르지만 구성이 일치할 경우 Yes, 그렇지 않으면 No
     */
    public static void prints() {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        System.out.println(solution(a,b));
    }

    private static String solution(String a, String b) {
        String result = "YES";
        Map<Character, Integer> aMap = new HashMap<>();
        Map<Character, Integer> bMap = new HashMap<>();

        for (char x : a.toCharArray()) {
            // getOrDefault = 없으면 default 값으로 key를 만들어주고 있으면 해당 Key의 value값 반환
            aMap.put(x, aMap.getOrDefault(x,0)+1);
        }
        for (char x : b.toCharArray()) {
            bMap.put(x, bMap.getOrDefault(x,0)+1);
        }

        for (char x : aMap.keySet()) {
            if (!aMap.get(x).equals(bMap.get(x))) {
                result = "NO";
                break;
            }
        }
        return result;
    }

    private static String solution2(String a, String b) {
        String answer = "YES";
        HashMap<Character, Integer> map = new HashMap<>();
        for (char x : a.toCharArray()) {
            map.put(x, map.getOrDefault(x,0)+1);
        }
        for (char x : b.toCharArray()) {
            if (!map.containsKey(x) || map.get(x) == 0) return "NO";
            map.put(x,map.get(x)-1);
        }
        return answer;
    }
}
