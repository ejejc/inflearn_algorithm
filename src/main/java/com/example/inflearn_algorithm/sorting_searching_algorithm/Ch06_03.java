package com.example.inflearn_algorithm.sorting_searching_algorithm;

import java.util.Scanner;

public class Ch06_03 {
    /**
     * 삽입 정렬 알고리즘 풀이
     */
    public static void prints() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int x : solution(n, arr)) {
            System.out.print(x + " ");
        }
    }

    private static int[] solution(int n, int[] arr) {
        for (int i=0; i<n-1; i++) {
            for (int j=i+1; j>0; j--) {
                if (arr[j] < arr[j-1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = tmp;
                }
            }
        }
        return arr;
    }
}
