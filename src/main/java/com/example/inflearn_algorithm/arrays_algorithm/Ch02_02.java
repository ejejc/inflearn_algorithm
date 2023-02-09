package com.example.inflearn_algorithm.arrays_algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ch02_02 {
    /**
     * 선생님이 N명의 학생을 일렬로 세웠습니다.
     * 일렬로 서 있는 학생의 키가 앞에서부터 순서대로 주어질 때, 맨앞에 서 있는 선생님이
     * 볼 수 있는 학생의 수를 구하는 프로그램을 작성하세요.
     * 앞에 서 있는 사람들보다 크면 보이거 작거나 같으면 보이지 않는다.
     */
    public static void prints() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print(solution(n, arr));
    }

    private static int solution(int n, int[] arr) {
        List<Integer> lists = new ArrayList<>();
        int min = arr[0];
        lists.add(min);
        for (int x : arr) {
            if (x > min) {
                lists.add(x);
                min = x;
            }
        }
        return lists.size();
    }
}
