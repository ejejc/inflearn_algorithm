package com.example.inflearn_algorithm.stack_queue_algorithm;

import java.util.*;

public class Ch05_08 {
    public static void prints() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print(solution(n, k, arr));
    }

    private static int solution(int n, int k, int[] arr) {
        List<Integer> list = new ArrayList<>();
        Queue<Map<Integer, Integer>> queue = new LinkedList<>();
        int result = 0, cnt = 1;

        for (int i=0; i<arr.length; i++) {
            list.add(arr[i]);
            Map<Integer, Integer> map = new HashMap<>();
            map.put(arr[i], i);
            queue.offer(map);
        }
        Collections.sort(list, Collections.reverseOrder());

        for (int x : list) {
            while (queue.peek().get(x) == null) {
                queue.offer(queue.poll());
            }
            Map<Integer, Integer> temp = queue.poll();
            if (temp.get(x) == k) {
                result = cnt;
                break;
            }
            cnt++;
        }

        return result;
    }
}
