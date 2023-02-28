package com.example.inflearn_algorithm.two_pointers_algorithm;

import java.util.Scanner;

public class Ch03_06 {
    /**
     * 0과 1로 구성된 길이가 N인 수열이 주어집니다.
     * 이 수열에서 최대 k번을 0을 1로 변경할 수 있다.
     * 최대 k번의 변경을 통해 이 수열에서 1로만 구성된 최대 길이의 연속 부분 수열을 찾아봐라
     *
     * 길이가 14이고 k=2이고 11001101101101이라고 하면
     * 연속 부분 수열은  11111111이며 그 길이는 8이다.
     */
    public static void prints() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(solution2(n, k, arr));
    }

    private static int solution(int n, int k, int[] arr) {
        int answer = 0, cnt=0, lt=0;
        for (int rt =0; rt<n; rt++) {
            if (arr[rt] == 0) cnt++;
            while (cnt > k) {
                if (arr[lt] == 0) cnt--;
                lt++;
            }
            answer = Math.max(answer, rt-lt+1);
        }
        return answer;
    }

    private static int solution2(int n, int k, int[] arr) {
        int lt =0, rt=-1, cnt =0, max =0, answer = 0;
        for (lt = 0; lt<n; lt++) {
            if (arr[lt] == 0) cnt++;
            if (cnt > k) {
                rt++;
                lt=rt;
                cnt =0;
                max = Math.max(max,answer);
                answer = 0;
            } else {
                answer++;
            }
        }
        return max;
    }
}
