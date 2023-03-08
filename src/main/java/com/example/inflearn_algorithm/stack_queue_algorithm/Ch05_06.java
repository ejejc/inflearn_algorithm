package com.example.inflearn_algorithm.stack_queue_algorithm;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ch05_06 {
    /**
     * queue 자료구조 - FIFO 구조
     * - offer(x) : x의 원소를 큐에 넣는다.
     * - poll() : 제일 앞에 있는 원소를 큐에서 꺼낸다.
     * - peek() : 제일 앞에 있는 원소를 확인한다.
     * - contains(x) : x가 큐에 존재하는지 여부를 확인한다.
     */

    public static void prints() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(solution(n,k));
    }

    private static int solution(int n, int k) {
        Queue<Integer> queue = new LinkedList<>();
        for (int i=1; i<=n; i++) {
            queue.offer(i);
        }
        int cnt = 1;
        while (queue.size() > 1) {
            if (cnt == k) {
                queue.poll();
                cnt = 1;
            } else {
                int pollData = queue.poll();
                queue.offer(pollData);
                cnt++;
            }
        }
        return queue.poll();
    }
}
