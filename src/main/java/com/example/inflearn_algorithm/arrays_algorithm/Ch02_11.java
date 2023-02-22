package com.example.inflearn_algorithm.arrays_algorithm;

import java.util.Scanner;

public class Ch02_11 {
    /**
     * 김갑동 선생님은 올해 6학년 1반 담임을 맡았다.
     * 선생님은 우선 임시로 반장을 정하고 학생들이 서로 친숙해진 후에 정식으로 선거하여 반장을 선출하려고 한다.
     *
     * 그는 자기 반 학생 중 1~5학년까지 지내오면서 한번이라도 같은 반이었던 사람이
     * 가장 많은 학생을 임시 반장으로 정하려고 한다.
     *
     *
     * 5
     * 9 8 7 6 5
     * 5 6 7 8 9
     * 1 2 3 7 8
     * 4 5 3 4 2
     * 6 2 8 4 2
     *
     * 정답값 : 3 / 리턴 값: 4
     */

    public static void prints() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][5];
        for(int i=0; i<n; i++) {
            for (int j=0; j<5; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(solution(n, arr));
    }

    private static int solution(int n, int[][] arr) {
        int real = 0;
        int[][] temp = new int[n][5];
        for (int x = 0; x < 5; x++) {
            for (int y = 0; y < n; y++) {
                int cnt = 0;
                int tmpn = arr[y][x];
                for (int z = 0; z < n; z++) {
                    if (z == y) continue;
                    if (tmpn == arr[z][x]) {
                        cnt++;
                    }
                }
                temp[y][x] = cnt;
            }
        }

        int[] ans = new int[n];
        for (int i=0; i<n; i++) {
            int sum = 0;
            for (int j=0; j<5; j++) {
                sum += temp[i][j];
            }
            ans[i] = sum;
        }

        int max = Integer.MIN_VALUE;
        for (int i=0; i<n; i++) {
            if (ans[i]>max) max = ans[i];
        }

        for (int i=0; i<n; i++) {
            if (ans[i]== max) {
                real = i+1;
                break;
            }
        }
        return real;
    }

}
