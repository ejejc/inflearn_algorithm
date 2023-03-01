package com.example.inflearn_algorithm.hashmap_treemap_algorithm;

import java.util.*;

public class Ch04_03 {
    /**
     * N일 동안의 매출 기록을 주고 연속된 K일 동안의 매출액의 종류를 각 구간별로 구해라
     * 20 12 20 10 23 17 10 > 4, 4, 3
     */
    public static void prints() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int x : solution(n, k, arr)) {
            System.out.print(x + " ");
        }
    }

    private static List<Integer> solution(int n, int k, int[] arr) {
        int lt = 0, rt = 0, cnt = 0;
        int[] temp = new int[k];
        List<Integer> list = new ArrayList<>();
        HashSet<Integer> hashSet = new HashSet<>();
        while(rt < n) {
            if (cnt == k) {
                list.add(hashSet.size());
                lt++;
                rt = lt;
                cnt = 0;
                hashSet = new HashSet<>();
            } else {
                hashSet.add(arr[rt]);
                cnt++;
                rt++;

            }
        }
        return list;
    }
}
