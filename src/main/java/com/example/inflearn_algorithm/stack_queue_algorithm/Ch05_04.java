package com.example.inflearn_algorithm.stack_queue_algorithm;

import java.util.Scanner;
import java.util.Stack;

public class Ch05_04 {
    /**
     * 후위연산식 > 중위연산식으로 변환
     */

    public static void prints() {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(solution(str));
    }

    private static int solution(String str) {
        char[] arr= str.toCharArray();
        Stack<Integer> stack = new Stack<>();
        for (char c : arr) {
            if (Character.isDigit(c)) { // 연산자인지 아닌지 확인하는 메소드
                int a = stack.pop();
                int b = stack.pop();
                stack.push(calculate(c, a, b));
            } else {
                stack.push(Character.getNumericValue(c));
            }
        }
        return stack.pop();
    }

    private static int calculate(char c, int a, int b) {
        switch (c) {
            case '*':
                return b*a;
            case '+':
                return b+a;
            case '-':
                return b-a;
            case '/':
                return b/a;
        }
        return 0;
    }



}
