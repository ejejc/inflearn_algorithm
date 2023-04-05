package com.example.inflearn_algorithm.recursive_tree_graph;


import java.util.*;

public class Ch07_10 {

    /**
     * BFS를 활용한 루트에서 밑단 노드까지의 최단 거리를 구해라.
     */

    public static class Node {
        public int data;
        public Node lt;
        public Node rt;

        public Node(int data) {
            this.data = data;
            this.lt = null;
            this.rt = null;
        }
    }

    public static int BFS(Node node, int L) {
        Queue<Node> queue = new LinkedList<>();
        queue.offer(node);
        List<Integer> result = new ArrayList<>();
        while (queue.size() > 0) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Node pollNode = queue.poll();
                if (Objects.isNull(pollNode.lt) && Objects.isNull(pollNode.rt)) {
                    //result.add(L);
                    return L; // 어차피 가장 최소 레벨을 리턴하기 때문이다.
                } else {
                    if (Objects.nonNull(pollNode.lt)) queue.offer(pollNode.lt);
                    if (Objects.nonNull(pollNode.rt)) queue.offer(pollNode.rt);
                }
            }
            L++;
        }
        return 0;//result.stream().mapToInt( x->x).min().orElse(0);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.lt = new Node(2);
        root.rt = new Node(3);
        root.lt.lt = new Node(4);
        root.lt.rt = new Node(5);
        System.out.println(BFS(root, 0));
    }
}
