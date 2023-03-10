package com.example.inflearn_algorithm.sorting_searching_algorithm;

import java.util.Scanner;

public class Ch06_02 {
    /**
     * 버블 정렬 알고리즘 풀이
     * - 한 번의 턴을 통해 맨 뒷자리에 제일 큰수가 위치하게 된다.
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
        for (int i = n-1; i>0; i--) {
            for (int j=0; j<i; j++) {
                if (arr[j] > arr[j+1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
        return arr;
    }
}
