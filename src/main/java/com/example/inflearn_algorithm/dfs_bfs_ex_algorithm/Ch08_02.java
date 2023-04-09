package com.example.inflearn_algorithm.dfs_bfs_ex_algorithm;

import java.util.Scanner;

public class Ch08_02 {
    static int c;
    static int n;
    static int[] arr;
    static int max = 0;


    public static void DFS(int idx, int sum) {
        if (sum > c) return;
        if (idx == n) {
            max = Math.max(max, sum);
        } else {
            DFS(idx+1, sum+arr[idx]);
            DFS(idx+1, sum);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        c = sc.nextInt();
        n = sc.nextInt();
        arr = new int[n];

        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        DFS(0, 0);
        System.out.println(max);
    }
}
