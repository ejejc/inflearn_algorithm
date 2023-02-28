package com.example.inflearn_algorithm.two_pointers_algorithm;

import java.util.*;

public class Ch03_01 {
    /**
     * 오름차순으로 정렬이 된 두 배열이 주어지면 두 배열을 오름차순으로 합쳐 출력하는 프로그램을 작성하세요
     *
     * 3
     * 1 3 5
     * 5
     * 2 3 6 7 9
     */

    public static void prints() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int[n];
        for (int i=0;i<n; i++) {
            a[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] b = new int[m];
        for (int i=0; i<m; i++) {
            b[i] = sc.nextInt();
        }

        for (int x : solution(n,m,a,b)) System.out.print(x+ " ");
    }

    private static int[] solution(int n, int m, int[] a, int[] b) {
        List<Integer> list = new ArrayList<>();
        for (int x : a) list.add(x);
        for (int y : b) list.add(y);
        return list.stream().sorted().mapToInt(i -> i).toArray();
    }
}
