package com.example.inflearn_algorithm.sorting_searching_algorithm;

import java.util.Scanner;

public class Ch06_01 {
    /**
     * 선택정렬 알고리즘 풀이
     */

    public static void prints() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int x :solution(n, arr)) {
            System.out.print(x + " ");
        }
    }

    private static int[] solution(int n, int[] arr) {
        for (int i=0; i<n; i++) {
            int index = i;
            for (int j=i+1; j<n; j++) {
                if (arr[index] > arr[j]) index = j;
            }
            int tmp = arr[i];
            arr[i] = arr[index];
            arr[index] = tmp;
        }
        return arr;
    }
}
