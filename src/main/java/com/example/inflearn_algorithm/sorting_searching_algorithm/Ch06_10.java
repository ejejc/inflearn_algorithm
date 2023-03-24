package com.example.inflearn_algorithm.sorting_searching_algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class Ch06_10 {
    /**
     * 이분 탐색 = 결정 알고리즘
     */

    public static void prints() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print(solution(n, m, arr));
    }

    // n=5, m=3
    private static int solution(int n, int m, int[] arr) {
        int lt = 1;
        int rt = Arrays.stream(arr).max().getAsInt()-1;
        int result = 0;
        while (lt <= rt) {
            int mid = (lt+rt) / 2;
            // 2 < 4
            if (check(mid, arr) >= m) {
                result = mid;
                lt = mid +1;
            } else rt = mid -1;
        }
        return result;
    }

    private static int check(int mid, int[] arr) {
        Arrays.sort(arr);
        int cnt = 1;
        int target = arr[0];
        for (int x: arr) {
            if ((x - target) < mid) continue;
            cnt++;
            target = x;
        }
        return cnt;
    }
}
