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
        Map<Integer, Integer> map = new HashMap<>();
        int lt = 0;
        List<Integer> list = new ArrayList<>();
        for (int i=0; i<k-1; i++) {
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
        }
        for (int i=k-1; i<n; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
            list.add(map.size());
            map.put(arr[lt],map.get(arr[lt]) -1);
            if (map.get(arr[lt]) == 0) {
                map.remove(arr[lt]);
            }
            lt++;
        }
        return list;
    }
}
