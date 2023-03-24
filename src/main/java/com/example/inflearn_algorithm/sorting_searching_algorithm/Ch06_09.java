package com.example.inflearn_algorithm.sorting_searching_algorithm;


import java.util.*;

public class Ch06_09 {

    /**
     * 결정 알고리즘 - 이분 탐색 이용
     *
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

    private static int solution(int n, int m, int[] arr) {
        int lt = Arrays.stream(arr).max().getAsInt();
        int rt = Arrays.stream(arr).sum();
        int mid = 0;
        int result = 0;
        while (lt <= rt) {
            mid = (lt + rt) / 2;
            int checkCnt = check(mid, arr);

            if (checkCnt <= m) { // checkcnt가 3개가 나왔다 근데 m개가 용량이다. 꽉꽉 채워서 3개가 들어가는거니까 답에 들어갈 수 있다.
                rt = mid - 1;
                result = mid;
            } else {
                lt = mid + 1;
            }
        }
        return result;
    }

    private static int check(int mid, int[] arr) {
        int sum = 0;
        int cnt = 0;
        for (int x : arr) {
            if (sum + x > mid) {
                sum = 0;
                cnt++;
            }
            sum += x;
        }
        return cnt+1;
    }
}
