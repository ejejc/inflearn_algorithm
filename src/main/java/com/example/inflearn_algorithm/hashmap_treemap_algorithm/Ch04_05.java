package com.example.inflearn_algorithm.hashmap_treemap_algorithm;

import java.util.*;

/**
 * TreeSet 사용법
 * 다시 풀어 보기
 * Set<Integer> result = new TreeSet<>(Collections.reverseOrder());
 * - default는 오름차순, 위와 같이 적으면 내림차순을 한다는 의미
 *
 * [ 지원하는 메소드 ]
 * remove
 * - 특정값을 지우는 메소드, set.remove(value)
 *
 * set.first()
 * - 오름차순일 경우 최솟값 반환, 내림차순일 경우 최댓값 반환
 * set.last()
 * - 위의 적은거와는 반대
 */
public class Ch04_05 {
    public static void prints() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(solution(arr, n, k));
    }

    private static int solution(int[] arr, int n, int k) {
        Set<Integer> result = new TreeSet<>(Collections.reverseOrder());
        for (int i=0; i<arr.length; i++) {
            for (int j=i+1; j<arr.length; j++) {
                for (int z=j+1; z<arr.length; z++) {
                    result.add(arr[i] + arr[j] + arr[z]);
                }
            }
        }
        int cnt = 0;
        for (int x : result) {
            cnt++;
            if (cnt == k) return x;
        }
        return -1;
    }

}
