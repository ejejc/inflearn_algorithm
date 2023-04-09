package com.example.inflearn_algorithm.dfs_bfs_ex_algorithm;

import java.util.Scanner;

public class Ch08_04 {

    static int n;
    static int m;
    static int[] arr;


    public static void DFS(int idx) {
        if (idx == m) {
            for (int x : arr) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
        else {
            for (int i=1; i<=n; i++) {
                arr[idx] = i;
                DFS(idx+1);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[m];
        DFS(0);
    }
}
