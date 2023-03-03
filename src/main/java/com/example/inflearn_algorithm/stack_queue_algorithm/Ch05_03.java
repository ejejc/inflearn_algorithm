package com.example.inflearn_algorithm.stack_queue_algorithm;

import java.util.Scanner;
import java.util.Stack;

public class Ch05_03 {
    public static void prints() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] board = new int[n][n];
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                board[i][j] = sc.nextInt();
            }
        }
        int m = sc.nextInt();
        int[] moves = new int[m];
        for (int i=0; i<m; i++) moves[i] = sc.nextInt();
        System.out.println(solution(n,board, m, moves));
    }

    private static int solution(int n, int[][] board, int m, int[] moves) {
        Stack<Integer> stack = new Stack<>();
        int result = 0, cnt = 0;
        for (int i=0; i<m; i++) {
            for (int j=0; j<n; j++) {
                if (board[j][moves[i]-1] != 0) {
                    result = board[j][moves[i]-1];
                    board[j][moves[i]-1] = 0;
                    break;
                }
            }
            if (result == 0) continue;
            if (!stack.isEmpty() && stack.peek() == result) { // peek() : 꺼내지 않고 그냥 가져오는 함수
                stack.pop();
                cnt++;
            } else {
                stack.push(result);
            }
            result = 0;
        }
        return cnt * 2;
    }
}
