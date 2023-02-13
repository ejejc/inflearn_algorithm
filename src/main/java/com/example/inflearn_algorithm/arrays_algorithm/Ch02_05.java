package com.example.inflearn_algorithm.arrays_algorithm;

import java.util.Scanner;

public class Ch02_05 {
    /**
     * 자연수 N이 입력되면 1 ~ N까지의 소수의 개수를 출력하는 프로그램을 작성해라.
     * 만약 20이 입력
     * 2,3,5,7,11,13,17,19 로 총 8개를 출력하면 된다.
     */

    public static void prints() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(solution(n));
    }

    private static int solution(int n) {
        int answer = 0;
        int[] ch = new int[n+1];
        for (int i=2; i<=n; i++) {
            if (ch[i] == 0) {
                answer ++;
                for (int k=i; k<=n; k=k+i) ch[k] = 1;
            }
        }
        return answer;
    }
}
