package com.example.inflearn_algorithm.recursive_tree_graph;

public class Ch08_09 {
    /**
     * Tree 말단노드까지의 가장 짧은 경로 - DFS
     * 이진트리에서 루트 노드에서 말단 노드까지의 길이 중 가장 짧은 길이를 구하는 프로그램을 작성하세요.
     */

    public static class Node {
        int data;
        Node lt, rt;

        public Node(int data) {
            this.data = data;
            this.lt = null;
            this.rt = null;
        }
    }

    public static class Resolve {
        Node root;
        public int DFS(int L, Node root) {
            if (root.lt == null && root.rt == null) {
                return L;
            } else {
                return Math.min(DFS(L+1, root.lt), DFS(L+1, root.rt));
            }
        }
    }

    public static void main(String args[]) {
        Resolve tree = new Resolve();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        System.out.println( tree.DFS(0, tree.root));
    }

}
