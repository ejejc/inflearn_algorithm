package com.example.inflearn_algorithm.arrays_algorithm;

import java.util.Scanner;

public class Ch02_10 {
    /**
     * 지도 정보가 N*N 격자판에 주어집니다.
     * 각 격자에는 그 지역의 높이가 쓰여있습니다.
     *
     * 각 격자판의 숫자 중 자신의 상하좌우 숫자보다 큰 숫자는 봉우리 지역입니다.
     * 봉우리 지역이 몇 개 있는지 알아내는 프로그램을 작성하세요.
     *
     * 격자의 가장자리는 0으로 초기화 되었다고 가정한다.
     *
     */

    public static void prints() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for(int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(solution2(n, arr));
    }

    private static int solution(int n, int[][] arr) {
        int x = 0; int y =0; int z = 0; int t = 0; int m = 0;
        int cnt = 0;
        for (int i=0;i<n; i++) {
            x=y=z=t=0;
            for (int j=0; j<n;j++) {
                int max = Integer.MIN_VALUE;

                if(i-1 < 0 || i-1 >= n) x = 0;
                else x = arr[i-1][j];
                if (x > max) max = x;

                if (j-1 < 0 || j-1 >= n) y = 0;
                else y = arr[i][j-1];
                if (y > max) max = y;

                if (i+1 <0 || i+1 >=n) z= 0;
                else z = arr[i+1][j];
                if (z > max) max = z;

                if (j+1 <0 || j+1 >=n) t=0;
                else t = arr[i][j+1];
                if (t > max) max = t;

                m = arr[i][j];

                if (max < m) cnt = cnt +1;
            }
        }
        return cnt;
    }

    private static int solution2(int n, int[][] arr) {
        int[] dx = {-1,0,1,0};
        int[] dy = {0,1,0,-1};
        int answer = 0;
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                boolean flag = true;
                for (int k=0; k<4; k++) {
                    int nx = i + dx[k];
                    int ny = j + dy[k];
                    if (nx >= 0 && nx < n && ny >= 0 && ny < n && arr[nx][ny] >= arr[i][j]) {
                        flag = false;
                        break;
                    }
                }
                if (flag) answer++;
            }
        }
        return answer;
    }
}
