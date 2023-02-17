package com.example.inflearn_algorithm.arrays_algorithm;

import java.util.Scanner;

public class Ch02_09 {
    /**
     * 5*5 격자판에 아래와 같이 숫자가 적혀있습니다.
     * 각 행의 합, 각 열의 합, 두 대각선의 합 중 가장 큰 합을 출력합니다.
     */
    public static void prints() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for(int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(solution(n, arr));
    }

    private static int solution(int n, int[][] arr) {
        int maxRow = 0;
        int maxCell = 0;
        int maxCross = 0;
        int maxCross2 = 0;
        int x = 0;
        int max = Integer.MIN_VALUE;
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                maxRow += arr[i][j];
                maxCell += arr[j][i];
            }
            x = Math.max(maxRow, maxCell);
            if (max < x) max = x;
            maxRow = 0; maxCell = 0;
        }

        for (int i=0; i<n; i++) {
            maxCross += arr[i][(n-1)-i];
            maxCross2 += arr[i][i];
        }
        x = Math.max(maxCross, maxCross2);
        if (max < x) max = x;

        return max;
    }
}
