package com.example.inflearn_algorithm.tow_pointers_algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Ch03_02 {
    /**
     *  A, B 두 개의 집합이 주어지면 두 집합의 공통 원소를 추출하여 오름차순으로 출력하세요.
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

        for (int x : solution(n,a,m,b)) System.out.print(x+ " ");
    }

    private static List<Integer> solution(int n, int[] a, int m, int[] b) {
        List<Integer> answer = new ArrayList<>();
        Arrays.sort(a);
        Arrays.sort(b);

        int p1=0 , p2=0;
        while (p1 < n && p2 <m) {
            if (a[p1] == b[p2]) {
                answer.add(a[p1]);
                p1++;
                p2++;
            }
            else if(a[p1] < b[p2]) p1++;
            else p2++;
        }
        return answer;
    }
}
