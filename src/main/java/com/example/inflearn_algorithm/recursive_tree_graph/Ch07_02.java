package com.example.inflearn_algorithm.recursive_tree_graph;

public class Ch07_02 {
    /**
     * 재귀함수를 이용한 이진수 출력
     * - 10진수 N이 입력되면 2진수로 반환하여 출력한느 프로그램을 작성하시오.
     *   단 재귀함수를 이용해서 출력해야 합니다.
     * - 입력 : 11
     * - 출력 : 1011
     */

    public static void main(String[] args) {
        DfsBinary(13);
    }

    private static void DfsBinary(int n) {
        if (n == 0) return;
        else {
            int num = n / 2;
            DfsBinary(num);
            System.out.print(n%2);
        }

    }

}
