package com.example.inflearn_algorithm.recursive_tree_graph;

public class Ch07_03 {
    /**
     * 재귀 알고리즘
     * 자연수 N이 입력되면 N!를 구하는 프로그램을 작성하세요.
     * 입력: 5
     * 출력: 5*4*3*2*1 = 120
     */

    public static void main(String[] args) {
        DfsFactorial(5);
    }

    private static int DfsFactorial(int n) {
        if (n == 1) return 1;
        else {
            return n * DfsFactorial(n-1);
        }
    }

}
