package com.example.inflearn_algorithm.stack_queue_algorithm;

import java.util.Scanner;
import java.util.Stack;

public class Ch05_01 {
    /**
     * 괄호가 입력되었을 때 올바른 괄호이면 YES, 올바르지 않으면 NO를 출력
     * (())() -> YES
     * (()())) -> NO
     *
     * stack method
     * push() : 값을 넣는다.
     * pop() : 값을 꺼낸다.
     * isEmpty : 값이 비어있다.
     */


    public static void prints() {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(solution(str));
    }

    private static String solution(String str) {
        String answer = "YES";
        Stack<Character> stack = new Stack<>();
        for (char x : str.toCharArray()) {
            if (x == '(') stack.push(x);
            else {
                if (stack.isEmpty()) return "NO";
                stack.pop();
            }
        }
        if (!stack.isEmpty()) return "NO";
        return answer;
    }

}
