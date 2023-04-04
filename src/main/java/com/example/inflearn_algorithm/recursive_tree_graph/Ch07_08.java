package com.example.inflearn_algorithm.recursive_tree_graph;

import java.util.*;

public class Ch07_08 {
    /**
     * BFS 알고리즘
     * 현수는 송아지를 잃어버렸지만 다행히 위치추적기가 달려있다.
     * 현수의 위치와 송아지의 위치는 수직선 상에 잡혀 있다.
     * 한번의 점프로 앞으로 1 뒤로 1 앞으로 5로 이동할 수 있다.
     * 최소 몇번의 점프로 송아지까지 갈 수 있는지 구하는 프로그램을 작성하세요.
     */

    public static class Node {
        int data;
        Node minus;
        Node plus;
        Node plusFive;

        public Node(int data) {
            this.data = data;
            this.minus = null;
            this.plus = null;
            this.plusFive = null;
        }
    }

    public static class Result {
        Node root;

        public int BFS(Node root, int max) {
            Queue<Node> queue = new LinkedList<>();
            Set<Integer> set = new HashSet<>();
            queue.offer(root);
            int L = 1;
            int result = 0;
            while (queue.size() > 0) {
                int size = queue.size();
                for (int i=0; i<size; i++) {
                    Node pollData = queue.poll();
                    if (pollData.data == max) {
                        return L;
                    }
                    else {
                        pollData.minus = new Node(pollData.data - 1);
                        pollData.plus = new Node(pollData.data + 1);
                        pollData.plusFive = new Node(pollData.data + 5);
                        if (!set.contains(pollData.minus.data)) addQueueAndSet(pollData.minus, queue, set);
                        if (!set.contains(pollData.plus.data)) addQueueAndSet(pollData.plus, queue, set);
                        if (!set.contains(pollData.plusFive.data)) addQueueAndSet(pollData.plusFive, queue, set);
                    }
                }
                L++;
            }
            return result;
        }

        private void addQueueAndSet(Node node, Queue<Node> queue, Set<Integer> set) {
            queue.offer(node);
            set.add(node.data);
        }
    }

    public static void main(String[] args) {
        Result main = new Result();
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int e = sc.nextInt();
        Node root = new Node(s);
        int bfs = main.BFS(root, e) - 1;
        System.out.println(bfs);
    }
}
