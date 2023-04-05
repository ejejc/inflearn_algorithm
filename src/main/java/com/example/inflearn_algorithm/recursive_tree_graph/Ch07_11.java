package com.example.inflearn_algorithm.recursive_tree_graph;

import java.util.Scanner;

public class Ch07_11 {

    static int n,m,answer = 0;
    static int[][] graph;
    static int[] ch;
    public void DFS(int v) {
        if (v == n) {
            answer++;
        } else {
            for (int i=0; i<n; i++) {
                if (graph[v][i+1] == 1 && ch[i+1] == 0) {
                    ch[i+1] = 1;
                    DFS(i+1);
                    ch[i+1] = 0;
                }
            }
        }
    }
    /**
     * 경로 탐색 - DFS 알고리즘
     * 1번 정점에서부터 N번 정점으로 가는 모든 경로의 가지 수를 출력하는 알고리즘 작성
     */

    public static void main(String[] args) {
        Ch07_11 s = new Ch07_11();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        graph = new int[n+1][n+1];
        ch = new int[n+1];
        for (int i=0; i<m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph[a][b] = 1;
        }
        ch[1] = 1;
        s.DFS(1);
        System.out.println("solution = " + answer);
    }

}
