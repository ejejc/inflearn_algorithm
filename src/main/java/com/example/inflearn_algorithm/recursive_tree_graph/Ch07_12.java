package com.example.inflearn_algorithm.recursive_tree_graph;

import java.util.ArrayList;
import java.util.Scanner;

public class Ch07_12 {
    /**
     * 경로 탐색 - 인접 리스트 알고리즘 풀이
     * 1번 정점에서부터 N번 정점까지 가는 모든 경로의 가지 수 출력하는 알고리즘 구하기
     */

    static int n,m,answer = 0;
    static ArrayList<ArrayList<Integer>> graph;
    static int[] ch;
    public void DFS(int v) {
        if (v == n) answer++;
        else {
            ArrayList<Integer> list = graph.get(v);
            for (int x : list) {
                if (ch[x] == 0) {
                    ch[x] = 1;
                    DFS(x);
                    ch[x] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Ch07_12 ch07_12 = new Ch07_12();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        graph = new ArrayList<ArrayList<Integer>>();
        for (int i=0; i<=n; i++) {
            graph.add(new ArrayList<Integer>());
        }
        ch = new int[n+1];
        for (int i=0; i< m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph.get(a).add(b);
        }
        ch[1] = 1;
        ch07_12.DFS(1);
        System.out.println(answer);
    }
}
