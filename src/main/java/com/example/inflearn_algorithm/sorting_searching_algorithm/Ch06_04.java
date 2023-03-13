package com.example.inflearn_algorithm.sorting_searching_algorithm;

import java.util.Scanner;

/**
 * LRU 알고리즘 풀이 - 다시 꼭 풀어보기 !!
 */
public class Ch06_04 {

    public static void prints() {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int x : solution(n, k, arr)) {
            System.out.print(x + " ");
        }
    }

    private static int[] solution(int n, int k, int[] arr) {
        int[] result = new int[k];
        for (int i=0; i<n; i++) {
            int idx = containsArr(result, arr[i]);
            if (idx != -1) {
                for (int j=idx; j>0; j--) {
                    result[j] = result[j-1];
                }
            } else {
                for (int j=k-1; j>0 ;j--) {
                    result[j] = result[j-1];
                }
            }
            result[0] = arr[i];
        }
        return result;
    }

    private static int containsArr(int[] result, int num) {
        for (int i=0; i<result.length; i++) {
            if (result[i] == num) {
                return i;
            }
        }
        return -1;
    }
}
