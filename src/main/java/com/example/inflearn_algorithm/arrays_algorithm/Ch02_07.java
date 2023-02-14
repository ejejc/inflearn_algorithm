package com.example.inflearn_algorithm.arrays_algorithm;

import java.util.Scanner;

public class Ch02_07 {
    /**
     * OX 문제는 맞거나 틀린 두 경우의 답을 가지는 문제를 말한다.
     *
     * 여러 개의 OX 문제로 만들어진 시험에서 연속적으로 답을 맞히는 경우에는
     * 가산점을 주기 위해서 다음과 같이 점수 계산을 하기로 하였다.
     *
     * 1번 문제가 맞는 경우는 1점으로 계산
     * 앞의 문제에 대해서는 답을 틀리다가 답이 맞는 처음 문제는 1점으로 계산
     *
     * 또한, 연속으로 문제의 답이 맞는 경우에서 두 번째 문제는 2점,
     * 세 번째 문제는 3점 ... K번째 문제는 K점으로 계산한다.
     * 틀린 문제는 0점으로 계산한다.
     *
     * 1011100110 > 1012300120 -> 1+1+2+3+1+2 = 10점
     */

    public static void prints() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(solution(n, arr));
    }

    private static int solution(int n, int[] arr) {
        int result = 0;
        int cnt = 0;
        for (int x : arr) {
            if (x == 1) cnt++;
            else cnt = 0;
            result += cnt;
        }
        return result;
    }


}
