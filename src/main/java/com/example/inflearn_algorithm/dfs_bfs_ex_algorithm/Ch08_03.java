package com.example.inflearn_algorithm.dfs_bfs_ex_algorithm;

import java.util.Scanner;

public class Ch08_03 {
    static int n;
    static int m;
    static int[] score;
    static int[] time;
    static int max = 0;

    public static void DFS(int idx, int sum, int scoreSum) {
        if (sum > m) return;
        if (idx == n) {
            max = Math.max(scoreSum, max);
        } else {
            DFS(idx+1, sum + time[idx], scoreSum+score[idx]);
            DFS(idx+1, sum, scoreSum);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        score = new int[n];
        time = new int[n];
        for (int i=0; i<n; i++) {
            score[i] = sc.nextInt();
            time[i] = sc.nextInt();
        }
        DFS(0,0,0);
        System.out.println(max);
    }
}
