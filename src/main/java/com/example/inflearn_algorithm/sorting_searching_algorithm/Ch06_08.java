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

    // 이분검색 알고리즘
    private static int solution2(int n, int m, int[] arr) {
        int answer = 0;
        Arrays.sort(arr);
        int lt = 0, rt = n-1;
        while (lt <= rt) {
            int mid = (lt+rt)/2;
            if (arr[mid]==m) {
                answer = mid +1;
                break;
            }
            if (arr[mid] > m) rt  = mid -1;
            else lt = mid+1;
        }
        return answer;
    }
}
