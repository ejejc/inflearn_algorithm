package com.example.inflearn_algorithm.arrays_algorithm;

import java.util.Scanner;

public class Ch02_04 {

    /**
     * 피보나치 수열을 출력한다.
     * 피보나치 수열이란 앞의 2개의 수를 합하여 다음 숫자가 되는 수열이다.
     * 만약 7이 입력되면
     * 1 1 2 3 5 8 13을 출력하면 된다.
     */

    public static void prints() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int x : solution(n)) {
            System.out.print(x + " ");
        }
    }

    private static int[] solution(int n) {
        int[] arr = new int[n];
        arr[0] = 1; arr[1] = 1;
        for (int i =0; i < n-2; i++) { // int i=2; i<n; i++ 이렇게 써도 된다.
            arr[i+2] = arr[i] + arr[i+1];
        }
        return arr;
    }
}
