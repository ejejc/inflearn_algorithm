package com.example.inflearn_algorithm.recursive_tree_graph;

import com.example.inflearn_algorithm.recursive_tree_graph.Ch08_05.Main;
import com.example.inflearn_algorithm.recursive_tree_graph.Ch08_05.Node;

public class Ch08_06 {
    /**
     * 부분집합 구하기 - DFS
     * - 자연수 N이 주어지면 1 ~ N 까지의 원소를 갖는 집합의 부분집합을 모두 출력하는 프로그램을 작성하세요.
     * - 공집합 제외
     *
     * 입력 : 3
     * 출력 : 1 2 3 / 1 2 / 1 3 / 1 / 2 3 / 2 / 3
     */

    public static class Main {
        int n;
        int[] ch;
        public void DFS(int L) {
            if (L == n+1) {

            } else {
                ch[L] = 1;
                DFS(L+1); // 사용한다 라고 뻗는 함수
                ch[L] = 0;
                DFS(L+1);
            }
        }

        public void main(String[] args) {
            Main T  = new Main();
            this.n = 3;
            ch = new int[n+1];
            T.DFS(1);
        }
    }

}
