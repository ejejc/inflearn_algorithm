package com.example.inflearn_algorithm.two_pointers_algorithm;

import java.util.Scanner;

public class Ch03_03 {
    /**
     * N일 동안의 매출 기록을 주고 연속된 K일 동안의 최대 매출액이 얼마인지 구하라고 했다.
     * 만약 N - 10이고, 10일 간의 매출기록이
     * 12 1511 20 2510 20 19 13 15 와 같다
     * 연속된 3일간의 최대 매출액은 11 20 25 = 56이다.
     *
     * 시간 제한1000MS
     * 메모리 제한256MB
     */
    public static void prints() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(solution(n, k, arr));
    }

    private static int solution(int n, int k, int[] arr) {
        int max = 0;
        for (int i=0; i<= (n-k); i++) {
            max = Math.max(arr[i] + arr[i+1] + arr[i+2], max);
        }
        return max;
    }
}
