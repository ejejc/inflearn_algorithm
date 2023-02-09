package com.example.inflearn_algorithm.arrays_algorithm;

import java.util.Scanner;

public class Ch02_03 {
    /**
     * A,B 두 사람이 가위바위보 게임을 합니다.
     * 총 N번의 게임을 하여 A가 이기면 A를 출력하고, B가 이기면 B를 출력합니다.
     * 비길 경우에는 D가 출력합니다.
     * 가위, 바위, 보의 정보는 1, 2, 3으로 정하겠습니다.
     */

    public static void prints() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] arr2 = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i=0; i<n; i++) {
            arr2[i] = sc.nextInt();
        }
        for (char a : solution(n, arr, arr2)) {
            System.out.println(a);
        }
    }

    private static char[] solution(int n, int[] arr, int[] arr2) {
        char[] result = new char[n];

        for (int i=0; i<arr.length; i++) {
            if (arr[i] == arr2[i]) {
                result[i] = 'D';
            } else if (arr[i] == 1 && arr2[i] ==3) {
                result[i] = 'A';
            } else if (arr[i] == 2 && arr2[i] == 1) {
                result[i] = 'A';
            } else if (arr[i] == 3 && arr2[i] == 2) {
                result[i] = 'A';
            } else {
                result[i] ='B';
            }
        }
        return result;
    }
}
