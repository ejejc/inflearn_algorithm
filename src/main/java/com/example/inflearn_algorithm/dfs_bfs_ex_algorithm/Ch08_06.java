package com.example.inflearn_algorithm.dfs_bfs_ex_algorithm;

import java.util.*;

public class Ch08_06 {
    /**
     * 순열 구하기
     * - 10 이하의 N개의 자연수가 주어지면 이 중, M개를 뽑아 일렬로 나열하는 방법을 모두 출력합니다.
     *
     * 입력: 3 / 2 / 3 6 9
     * 출력: 3,6,9 중에 2개씩 조합하여 중복되지 않도록 출력하기
     */
    static int[] arr;
    static int n;
    static int m;
    static int[] check;
    static int[] pm;


    public static void DFS(int idx, int level) {
        if (level > 2) return;
        if (level == m) {
            for (int x : pm) System.out.print(x + " ");
            System.out.println();
        }
        else {
            for (int i=0;i<n;i++) {
                if (check[i] == 1) continue;
                check[i] = 1;
                pm[level] = arr[i];
                DFS(i, level+1);
                check[i] = 0;
            }
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); // 3
        m = sc.nextInt(); // 2
        arr = new int[n];
        check = new int[n];
        pm = new int[m];
        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        DFS(0,0);
    }
}
