package com.example.inflearn_algorithm.dfs_bfs_ex_algorithm;

import java.util.Scanner;

public class Ch08_07 {
    /**
     * 7*7 격자판 미로를 탈출하는 경로의 가지수를 출력하는 알고리즘
     * 출발점은 격자의 (1,1) 좌표이며, 탈출 도착점은 (7,7) 좌표이다.
     * 격자판의 1은 벽이고 0은 통로이다.
     * 격자판의 움직임은 상,하,좌,우로만 움직인다.
     */

    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int[][] board;
    static int answer = 0;

    public static void DFS (int x, int y) {
        if (x == 7 && y == 7) answer++;
        else {
            for (int i=0; i<4; i++) {
                int xnum = x + dx[i];
                int ynum = y + dy[i];
                if (xnum >=1 && xnum <=7 && ynum >=1 && ynum <=7 && board[xnum][ynum] == 0) {
                    board[xnum][ynum] = 1;
                    DFS(xnum, ynum);
                    board[xnum][ynum] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        board = new int[8][8];
        for (int i=1; i<=7; i++) {
            for (int j=1; j<=7; j++) {
                board[i][j] = sc.nextInt();
            }
        }
        board[1][1] = 1;
        DFS(1,1);
        System.out.println(answer);
    }

}
