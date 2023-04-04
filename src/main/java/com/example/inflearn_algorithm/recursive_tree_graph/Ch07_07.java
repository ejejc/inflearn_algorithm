package com.example.inflearn_algorithm.recursive_tree_graph;

import java.util.LinkedList;
import java.util.Queue;

public class Ch07_07 {
    /**
     * 넓이 우선 탐색 : BFS
     */

    public static class Node {
        int data;
        Node lt;
        Node rt;

        public Node(int data) {
            this.data = data;
            this.lt = null;
            this.rt = null;
        }
    }

    public static class Main {
        Node root;

        public void BFS(Node root) {
            Queue<Node> Q = new LinkedList<>();
            Q.offer(root);
            int L = 0;
            while (!Q.isEmpty()) {
                int len = Q.size();
                System.out.println("L = " + L);
                for (int i=0; i<len; i++) {
                    Node cur = Q.poll();
                    System.out.println("cur = " + cur.data);
                    if (cur.lt != null) Q.offer(cur.lt);
                    if (cur.rt != null) Q.offer(cur.rt);
                }
                L++;
                System.out.println();
            }
        }
    }


    public static void main(String[] args) {
        Main tree = new Main();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        tree.root.rt.lt = new Node(6);
        tree.root.rt.rt = new Node(7);
        tree.BFS(tree.root);
    }
}


