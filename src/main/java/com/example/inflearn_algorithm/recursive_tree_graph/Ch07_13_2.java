package com.example.inflearn_algorithm.recursive_tree_graph;

import java.util.*;

public class Ch07_13_2 {

        static List<List<Integer>> list;
        static int[] check, dis;

        public static void BFS(int n) {
            Queue<Integer> queue = new LinkedList<>();
            check[n] = 1;
            dis[n] = 0;
            queue.offer(n);
            while (queue.size() > 0) {
                Integer pollNode = queue.poll();
                List<Integer> nodeList = list.get(pollNode);
                for (Integer x : nodeList) {
                    if (check[x] == 0) {
                        check[x] = 1;
                        queue.offer(x);
                        dis[x] = dis[pollNode] + 1;
                    }
                }
            }
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt(); // 6
            int m = sc.nextInt(); // 9
            list = new ArrayList<>();

            for (int i = 0; i <=n; i++) {
                list.add(new ArrayList<>());
            }
            check = new int[n+1];
            dis = new int[n+1];
            for (int i=0; i<m; i++) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                list.get(a).add(b);
            }
            BFS(1);
            for (int i=2; i<=n; i++) {
                System.out.println(i + ":" + dis[i]);
            }
        }

}
