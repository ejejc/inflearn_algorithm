package com.example.inflearn_algorithm.dfs_bfs_ex_algorithm;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ch08_10 {

    /**
     * 섬나라 아일랜드
     * - 섬나라 아일랜드의 지도가 격자판의 정보로 주어집니다.
     *   각 섬은 1로 표시되어 상하좌우와 대각선으로 연결되어 있으며, 0은 바다입니다.
     *   섬나라 아일랜드에 몇 개의 섬이 있는지 구하는 프로그램을 작성하세요.
     *   - DFS 활용
     */

    static int[] arrX = {-1, 0, 1, 0, -1, -1, 1, 1};
    static int[] arrY = {0, -1, 0, 1, -1, 1, 1, -1};
    static int[][] arr;
    static int n;
    static int result = 0;

    public static class Node {
        int x;
        int y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n][n];
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(solution(arr, n));
    }

    private static int solution(int[][] arr, int n) {
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                if (arr[i][j] == 1) {
                    BFS(i, j);
                    result = result + 1;
                }
            }
        }
        return result;
    }

    public static void BFS(int x, int y) {
        // queue를 활용한 문제
        Queue<Node> queue = new LinkedList<>();
        queue.offer(new Node(x, y));
        while (!queue.isEmpty()) {
            Node popNode = queue.poll();
            for (int i = 0; i < 8; i++) {
                int newX = popNode.x + arrX[i];
                int newY = popNode.y + arrY[i];
                if (newX >= 0 && newX < n && newY >= 0 && newY < n && arr[newX][newY] == 1) {
                    arr[newX][newY] = 0;
                    queue.offer(new Node(newX, newY));
                }
            }
        }
    }

    private static void DFS(int x, int y) {
        for (int i=0; i<8; i++) {
            int newX = x + arrX[i];
            int newY = y + arrY[i];
            if (newX >=0 && newX < n && newY >= 0 && newY < n && arr[newX][newY]==1) {
                arr[newX][newY] = 0;
                DFS(newX, newY);
            }
        }
    }
}
