package com.example.inflearn_algorithm.sorting_searching_algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class Ch06_08 {
    /**
     * N개의 숫자가 입력으로 주어질 때, N개의 수를 오름차순으로 정렬한 다음
     * N개의 수 중 한 개의 수인 M이 주어지면 이분검색으로 M이 정렬된 상태에서 몇 번째에 있는지 구하는 프로그램을 작성해라.
     */

    public static void prints() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(solution(n, m, arr));
    }

    private static int solution(int n, int m, int[] arr) {
        int result = 0;
        Arrays.sort(arr);
        for (int i=0; i<arr.length; i++) {
            if (arr[i] == m) {
                result = i+1;
                break;
            }
        }
        return result;
    }
}
