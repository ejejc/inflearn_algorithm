package com.example.inflearn_algorithm.recursive_tree_graph;

public class Ch07_05 {
    /**
     *  이진트리순회 - DFS 알고리즘
     *  : 전위 순회 출력
     *      - 부모 > 왼쪽 자식 > 오른쪽 자식
     *  : 중위 순회 출력
     *      - 왼쪽 자식 > 부모 > 오른쪽 자식
     *  : 후위 순회 출력
     *      - 왼쪽 자식 > 오른쪽 자식 > 부모
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

        public void DFS(Node root) {
            if (root == null) return;
            else {
                // System.out.println("root = " + root.data); - 전위 순회
                DFS(root.lt);
                // System.out.println("root = " + root.data); - 중위 순회
                DFS(root.rt);
                // System.out.println("root = " + root.data); - 후위 순회
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
        tree.DFS(tree.root);
    }



}
