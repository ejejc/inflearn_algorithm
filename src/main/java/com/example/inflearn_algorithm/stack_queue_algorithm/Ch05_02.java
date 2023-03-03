package com.example.inflearn_algorithm.stack_queue_algorithm;

import java.util.Scanner;
import java.util.Stack;

public class Ch05_02 {
    /**
     * 입력된 문자열에서 소괄호 사이에 존재하는 모든 문자를 제거하고 남은 문자만 출력하는 프로그램을 작성하세요.
     */

    public static void prints() {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(solution(str));
    }

    private static String solution(String str) {
        Stack<Character> stack = new Stack<>();
        for (char x : str.toCharArray()) {
            if (x == ')') {
                /*char temp = ' ';
                while (!stack.isEmpty()) {
                    temp = stack.pop();
                    if (temp == '(') break;
                } 아래 처럼 한줄로 줄일 수 있다.*/
                while (stack.pop() != '(');
            } else stack.push(x);
        }
        String result = "";
        for (int i=0;i<stack.size(); i++) {
            result += stack.get(i);
        }
        return result;
    }
}
