package com.example.inflearn_algorithm.stack_queue_algorithm;

import java.util.*;

public class Ch05_07 {
    /**
     * 필수과목이 주어지고 그 필수 과목 순서대로 교육과정을 계획하였으면 YES 그렇지 않으면 NO
     */

    public static void prints() {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        System.out.println(solution2(a,b));
    }

    private static String solution(String a, String b) {
        Queue<Character> queue = new LinkedList<>();
        Queue<Character> queue2 = new LinkedList<>();
        for (char x : b.toCharArray()) {
            queue.offer(x);
        }
        for (char x : a.toCharArray()) {
            queue2.offer(x);
        }

        for (char x : a.toCharArray()) {
            char c = queue2.peek();
            boolean bol = false;
            while (queue.size() > 0) {
                if(queue.poll() == c) {
                    bol = true;
                    break;
                }
            }
            if (bol) queue2.poll();
        }

        if (queue2.size() > 0) return "NO";
        return "YES";
    }

    private static String solution2(String a, String b) {
        Queue<Character> queue = new LinkedList<>();
        for (char x : a.toCharArray()) {
            queue.offer(x);
        }

        for (char c : b.toCharArray()) {
            if (queue.contains(c)) {
                if (queue.peek() != c) return "NO";
                else {
                    queue.poll();
                }
            }
        }
        if(queue.size() > 0) return "NO";
        return "YES";
    }
}
