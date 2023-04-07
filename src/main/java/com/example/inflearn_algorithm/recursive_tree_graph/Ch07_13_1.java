package com.example.inflearn_algorithm.recursive_tree_graph;

import java.util.*;

public class Ch07_13_1 {

    public static class Node {
        public int data;
        public Node lt, rt;

        public Node(int data) {
            this.data = data;
            this.lt = null;
            this.rt = null;
        }

        public Map<Integer,Integer> BFS(Node node) {
            Queue<Node> queue = new LinkedList<>();
            queue.offer(node);
            Map<Integer,Integer> map = new HashMap<>();
            int level = 0;
            while (queue.size() > 0) {
                int size = queue.size();
                for (int i = 0; i < size; i++) {
                    Node pollNode = queue.poll();
                    int value = map.getOrDefault(pollNode.data, level);
                    int min = Math.min(level, value);
                    map.put(pollNode.data, min);

                    if (pollNode.lt != null) {
                        queue.offer(pollNode.lt);
                    }
                    if (pollNode.rt != null) {
                        queue.offer(pollNode.rt);
                    }
                }
                level++;
            }
            return map;
        }
    }

    public static void main(String[] args) {
        Node node = new Node(1);
        node.lt = new Node(3);
        node.rt = new Node(4);
        node.lt.lt = new Node(4);
        node.rt.lt = new Node(5);
        node.rt.rt = new Node(6);
        node.rt.rt.lt = new Node(2);
        node.rt.rt.rt = new Node(5);
        Map<Integer, Integer> map = node.BFS(node);
        Set<Integer> integers = map.keySet();
        for (Integer key : map.keySet()) {
            if (key != 1) {
                System.out.println(key + ":" + map.get(key));
            }
        }
    }

}
