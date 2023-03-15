package com.example.programmers.kakao;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class SumQueue {
    public static void prints() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        int[] arr2 = new int[m];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }
        System.out.println(solution(arr, arr2));
    }
    public static int solution(int[] queue1, int[] queue2) {
        int answer = -2;
        int result = 0;
        int sumX=0, sumY=0;
        Queue<Integer> tmpQueue1 = new LinkedList<>();
        Queue<Integer> tmpQueue2 = new LinkedList<>();

        for (int x : queue1) {
            sumX += x;
            tmpQueue1.offer(x);
        }
        for (int y : queue2) {
            sumY += y;
            tmpQueue2.offer(y);
        }

        while (sumX != sumY) {
            if (sumX < sumY) {
                int n = tmpQueue2.poll();
                sumX += n;
                sumY -= n;
                tmpQueue1.offer(n);
            }
            else {
                int n = tmpQueue1.poll();
                sumX -= n;
                sumY += n;
                tmpQueue2.offer(n);
            }
            result++;
            if (result > 6000000) {
                return -1;
            }
        }

        return result;
    }
}
