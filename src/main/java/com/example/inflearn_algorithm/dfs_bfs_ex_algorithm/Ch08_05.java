package com.example.inflearn_algorithm.dfs_bfs_ex_algorithm;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Ch08_05 {

    /**
     * 풀긴했는데 강의에서는 어떻게 접근했는지 봐보기
     */
    static int n;
    static Integer[] arr;
    static int target;
    static int min = Integer.MAX_VALUE;

    public static void DFS(int level, int sum) {
        if (min < level) return;
        if (sum > target) {
            return;
        }
        if (sum == target) {
            min = Math.min(level, min);
        } else {
            for (int i=0; i<n; i++) {
                DFS(level+1, sum+arr[i]);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new Integer[n];
        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr, Comparator.reverseOrder());
        target = sc.nextInt();
        DFS(0, 0);
        System.out.println(min);
    }
}
