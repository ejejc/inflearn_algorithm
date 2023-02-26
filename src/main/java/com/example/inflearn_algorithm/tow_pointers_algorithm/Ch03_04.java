package com.example.inflearn_algorithm.tow_pointers_algorithm;

import java.util.Scanner;

public class Ch03_04 {
    /**
     * N개의 수로 이루어진 수열이 주어진다.
     * 이 수열에서 연속 부분 수열의 합이 특정 숫자 M이 되는 경우가 몇번 있는지 구하기
     * N=8 / M=6이고 / 1 2 1 3 1 1 1 2 라면
     * 합이 6이 되믄 연속 부분수열은 213 1311 3111로 총 3가지이다.
     *
     */

    public static void prints() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(solution(n, m, arr));
    }

    private static int solution(int n, int m, int[] arr) {
        int sum = 0, k = 0, cnt=0;
        for (int i=0; i<n; i++) {
            sum += arr[i];
            if (sum > m) {
                i=k; k++;
                sum = 0;
            }
            if (sum == m) {
                cnt = cnt+1;
                i=k;
                k++;
                sum = 0;
            }
        }
        return cnt;
    }
}
