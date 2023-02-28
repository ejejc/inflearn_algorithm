package com.example.inflearn_algorithm.two_pointers_algorithm;

import java.util.Scanner;

public class Ch03_05 {
    /**
     * N 입력으로 정수 N이 입력되면 2개 이상의 연속된 자연수의 합으로 정수 N을 표현하는 방법의
     * 가짓 수를 출력하는 프로그램을 작성하세요.
     *
     * 만약 N = 15이면
     * 7+8 , 4+5+6, 1+2+3+4+5 총 3가지이다.
     */

    public static void prints() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(solution(n));
    }

    private static int solution(int n) {
        int sum = 0, k = 0, cnt=0;
        int m = n/2 + 1; // 굳이 이 뒤에 있는 값들은 확인할 필요가 없다. n보다 커지므로!!
        int[] arr = new int[m];
        for (int i=0; i<m; i++) {
            arr[i] = i+1;
        }
        for (int i=0; i<m; i++) {
            sum += arr[i];
            if (sum > n) {
                i=k; k++;
                sum = 0;
            }
            if (sum == n) {
                cnt = cnt+1;
                i=k;
                k++;
                sum = 0;
            }
        }
        return cnt;
    }
}
