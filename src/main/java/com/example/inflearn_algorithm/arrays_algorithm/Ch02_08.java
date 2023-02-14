package com.example.inflearn_algorithm.arrays_algorithm;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Ch02_08 {
    /**
     * N명의 학생의 국어점수가 입력되면 각 학생의 등수를 입력한
     * 순서대로 출력하는 프로그램을 작성하세요.
     * 같은 점수가 입력될 경우 높은 등수로 동일 처리한다.
     * 즉 가장 높은 점수가 92점인데 92점이 3명이 존재한다면 1등이 3명이고
     * 그 다음 학생은 4등이 된다.
     */

    public static void prints() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int x  : solution2(n, arr)) {
            System.out.print(x+ " ");
        }
    }

    private static int[] solution(int n, int[] arr) {
        Integer[] tmp = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Arrays.sort(tmp, Comparator.reverseOrder());
        int score = 0;
        int[] result = new int[n];
        int[] result2 = new int[n];
        int tmpNum = 0;
        int tmpIdx = 0;
        for (int i=0; i<tmp.length; i++) {
            if (tmpNum == tmp[i]) {
                result[i] = result[tmpIdx];
                score++;
            } else {
                result[i] = score + 1;
                score++;
            }

            tmpNum = tmp[i];
            tmpIdx = i;
        }

        for (int j=0 ; j<n; j++) {
         for (int i=0; i<n; i++) {
             if (tmp[i] == arr[j]) {
                 result2[j] = result[i];
             }
         }
        }
        return result2;
    }


    /**
     * 인덱스 관점으로 이중으로 돌면서 자신보다 작은 친구가 있으면 더해주는 식으로!!
     * @param n
     * @param arr
     * @return
     */
    private static int[] solution2(int n, int[] arr) {
        int[] result = new int[n];
        for (int i=0; i<n; i++) {
            int cnt = 1;
            for (int j=0; j<n; j++) {
                if (arr[i] < arr[j]) cnt = cnt + 1;
            }
            result[i] = cnt;
        }
        return result;
    }
}
