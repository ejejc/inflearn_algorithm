package com.example.inflearn_algorithm.sorting_searching_algorithm;

import java.util.*;

public class Ch06_05 {
    /**
     * N명의 학생들이 존재
     * 1 ~ 10000000 까지의 자연수 중에서 각자가 좋아하는 숫자 하나를 적어 내였다.
     * N명의 학생들이 적어낸 숫자 중 중복된 숫자가 존재하면 D를 출력하고
     * N명이 모두 각자 다른 숫자를 적어내면 U 출력
     *
     * 배열 정렬: Arrays.sort(arr) // 오름차순
     */

    public static void prints() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(solution(n, arr));
    }

    private static char solution(int n, int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int x : arr) {
            set.add(x);
        }
        if (set.size() == n) return 'U';
        else return 'D';
    }
}
