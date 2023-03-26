package com.example.inflearn_algorithm.recursive_tree_graph;

public class Ch08_01 {
    /**
     * 재귀함수 알고리즘 풀이 - 스택프레임 작동 방식
     */

    public static void main(String[] args) {
        DFS(3);
    }

    private static void DFS(int n) {
        if (n == 0) return;
        else {
            // System.out.println("n = " + n); - 3,2,1 출력
            DFS(n-1);
            System.out.println("n = " + n); // - 1,2,3 출력
        }
    }
}
