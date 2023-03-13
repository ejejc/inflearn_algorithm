package com.example.inflearn_algorithm.sorting_searching_algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Ch06_06 {
    public static void prints() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int x : solution(n, arr)) {
            System.out.print(x + " ");
        }
    }

    private static List<Integer> solution(int n, int[] arr) {
        List<Integer> result = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        for (int x : arr) {
            temp.add(x);
        }

        Arrays.sort(arr);
        for (int i=0; i<n; i++) {
            if (arr[i] != temp.get(i)) {
                result.add(i+1);
            }
        }
        return result;
    }
}
