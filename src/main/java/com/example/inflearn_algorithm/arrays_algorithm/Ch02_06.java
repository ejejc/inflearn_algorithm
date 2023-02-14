package com.example.inflearn_algorithm.arrays_algorithm;

import java.util.ArrayList;
import java.util.Scanner;

public class Ch02_06 {
    /**
     * N개의 자연수가 입력되면
     * 각 자연수를 뒤집은 후 그 뒤집은수가 소수이면 그 소수를 출력하는 프로그램 작성
     */

    public static void prints() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int x  : solution(n, arr)) {
            System.out.print(x+ " ");
        }
    }

    /**
     * 소수인지 아닌지 판별하는 함수
     * @param num
     * @return
     */
    private static boolean isPrime(int num) {
        if (num == 1) return false;
        for (int i=2; i<num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
    private static ArrayList<Integer>  solution(int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i=0; i<arr.length; i++) {
            // 어떠한 숫자를 10으로 나눈 수는 어떠한 숫자의 1의 자리가 된다.
            int tmp = arr[i];
            int res = 0; // 최종적으로 뒤집어진 정수가 들어가게 된다.
            while (tmp > 0) {
                int t = tmp % 10;
                res = res*10+t;
                tmp = tmp / 10;
            }
            // 해당 정수가 소수이면 정답 리스트에 넣어준다.
            if (isPrime(res)) answer.add(res);
        }
        return answer;
    }
}
