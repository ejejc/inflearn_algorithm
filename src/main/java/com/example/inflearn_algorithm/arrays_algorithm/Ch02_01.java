package com.example.inflearn_algorithm.arrays_algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ch02_01 {

    /**
     * N개의 정수를 입력받아,
     * 자신의 바로 앞 수보다 큰 수만 출력하는 프로그램을 작성하세요.
     * 첫번째 수는 무조건 출력
     * 6
     * 7 3 9 5 6 12
     * 출력 : 7 9 6 12
     */
    public static void prints() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int x : solution(n, arr)) {
            System.out.print(x+" ");
        }
    }

    private static List<Integer> solution(int n, int[] arr) {
        List<Integer> results = new ArrayList<>();
        results.add(arr[0]);
        for (int i=1; i<arr.length; i++) {
            if (arr[i] > arr[i-1]) results.add(arr[i]);
        }
        return results;
    }
}
