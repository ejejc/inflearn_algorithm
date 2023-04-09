package com.example.inflearn_algorithm.dfs_bfs_ex_algorithm;

import java.util.*;

public class Ch08_01 {

    /**
     * 부분집합 DFS는 집합의 원소를 포함 한다/안한다로 상태트리를 뻗어나가면 된다.
     */
    static int[] arr;
    static int total =0;
    static String answer = "NO";
    static boolean flag = false;
    public static void DFS(int idx, int sum) {
        if (flag) return;
        if (idx == arr.length) {
            if (sum == (total - sum)) {
                answer = "YES";
                flag = true;
            }
        } else {
            DFS(idx+1, sum+arr[idx]);
            DFS(idx+1, sum);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        arr = new int[n];

        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
            total += arr[i];
        }
        DFS(0, 0);
        System.out.println(answer);
    }
}

