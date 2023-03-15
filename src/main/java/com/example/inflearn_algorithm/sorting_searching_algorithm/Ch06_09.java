package com.example.inflearn_algorithm.sorting_searching_algorithm;


import java.util.*;

public class Ch06_09 {

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
        int sum = 0;
        int result = Integer.MAX_VALUE;
        List<Integer> list = new ArrayList<>();
        while (lt <= rt) {
            int mid = (lt+rt) / 2;
            for (int i=0;i<n; i++) {
                sum += arr[i];
                if (sum > mid) {
                    list.add(sum - arr[i]);
                    sum = 0;
                    i = i-1;
                }
                if (i == n-1) {
                    list.add(sum);
                }
            }
            if (list.size() == m) {
                if (result > Collections.max(list)) {
                    result = Collections.max(list);
                }
                sum = 0;
                rt = mid-1;
                list = new ArrayList<>();
            } else if (list.size() < m) {
                sum = 0;
                rt = mid-1;
                list = new ArrayList<>();
            } else {
                sum = 0;
                lt = mid+1;
                list = new ArrayList<>();
            }
        }
        return result;
    }
}
