package com.example.inflearn_algorithm.hashmap_treemap_algorithm;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class Ch04_01 {
    /**
     * 첫 줄에는 반 학생수가 주어집니다.
     * 두번 째줄에는 N개의 투표 용지에 쓰여져 있던 각 후보의 기호가 선생님이 발표한 순서대로 문자열로 입력됩니다.
     * 선생님의 발표가 끝난 후,
     * 어떤 기호의 후보가 학급 회장이 되었는지 출력하는 프로그램을 작성하세요.
     *
     * 입력:
     * 15, BACBACCACCBDEDE
     * 출력:
     * C
     */
    public static void prints() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        System.out.println(solution(n, s));
    }

    private static char solution(int n, String s) {
        char[] arr = new char[n];
        HashSet<Character> hashSet = new HashSet<>();
        arr = s.toCharArray();
        int max = 0;
        char result = ' ';
        Map<Character, Integer> map = new HashMap<>();
        for (char c : arr) {
            map.put(c,0);
            hashSet.add(c);
        }
        for (char c : arr) {
            int cnt = map.get(c) + 1;
            map.put(c, cnt);
            max = Math.max(cnt, max);
        }
        for (Character c : hashSet) {
            if (map.get(c) == max) {
                result = c;
                break;
            }
        }
        return result;
    }

    private static char solution2(int n, String s) {
        char answer = ' ';
        int max = Integer.MIN_VALUE;
        HashMap<Character, Integer> map = new HashMap<>();
        for (char x : s.toCharArray()) {
            // getOrDefault = 없으면 default 값으로 key를 만들어주고 있으면 해당 Key의 value값 반환
            map.put(x, map.getOrDefault(x,0)+1);
        }
        // keySet() map의 key들을 Set<> 형태로 반환해준다.
        for (char x : map.keySet()) {
            if (map.get(x) > max) {
                max = map.get(x);
                answer = x;
            }
        }
        return answer;
    }
}
