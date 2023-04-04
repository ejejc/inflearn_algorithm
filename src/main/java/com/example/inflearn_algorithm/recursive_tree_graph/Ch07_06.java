package com.example.inflearn_algorithm.recursive_tree_graph;

public class Ch07_06 {
    /**
     * 부분집합 구하기 - DFS
     * - 자연수 N이 주어지면 1 ~ N 까지의 원소를 갖는 집합의 부분집합을 모두 출력하는 프로그램을 작성하세요.
     * - 공집합 제외
     *
     * 입력 : 3
     * 출력 : 1 2 3 / 1 2 / 1 3 / 1 / 2 3 / 2 / 3
     */

        static int n;
        static int[] ch;

        public void DFS(int L) {
            if (L == n + 1) {
                String tmp = "";
                for (int i = 1; i <= n; i++) {
                    if (ch[i] == 1) tmp += (i + " ");
                }
                if (tmp.length() > 0) System.out.println(tmp);
            } else {
                ch[L] = 1;
                DFS(L + 1); // 사용한다 라고 뻗는 함수
                ch[L] = 0;
                DFS(L + 1);
            }
        }

        public static void main(String[] args) {
            Ch07_06 T  = new Ch07_06();
            n = 3;
            ch = new int[n+1];
            T.DFS(1);
        }


}
