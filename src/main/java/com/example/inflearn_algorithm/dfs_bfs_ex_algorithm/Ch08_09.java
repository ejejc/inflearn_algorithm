package com.example.inflearn_algorithm.dfs_bfs_ex_algorithm;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ch08_09 {
    /**
     * 현수는 토마토를 보관하는 큰 창고를 가지고 있다.
     * 창고에 보관되는 토마토들 중에는 잘 익은 것도 있지만 익지 않은 토마토들도 있다.
     * 보관 후 하루가 지나면 익은 토마토들의 인접한 곳에 있는 익지 않은 토마토들은 익은 토마토의 영향을 받아 익게 된다.
     *
     * 하나의 토마토에 인접한 곳은 왼쪽 오른쪽 앞 뒤 네 방향이다. 대각선 x
     * 현수는 창고에 보관된 토마토들이 몇일이 지나면 다 익게 되는지 그 최소 일수를 알고 싶어한다.
     * 1 = 익은 토마토 , 0 = 익지 않은 토마토 , -1 = 토마토가 들어있지 않은 칸
     */

    /**
     * !!!!!!!!!!!! 맞았지만 강의 보고 답과 비교해보기 !!!!!!!!!!!!!
     */
    static class Node {
        int x;
        int y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    static int[][] board;
    static int[][] dis;
    static Queue<Node> queue;
    static int m;
    static int n;

    static int cnt=0;
    static int targetCnt = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        m = sc.nextInt();
        n = sc.nextInt();


        board = new int[n][m];
        dis = new int[n][m];
        queue = new LinkedList<>();
        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                board[i][j] = sc.nextInt();
                if (board[i][j] == 1) queue.add(new Node(i,j));
                if (board[i][j]==0) cnt = cnt +1;
            }
        }
        BFS();
        System.out.println(check());


    }

    private static int check() {
        if (cnt != targetCnt) return -1;
        int max = Integer.MIN_VALUE;
        for (int i=0; i<n; i++) {
            for (int j = 0; j < m; j++) {
                if (dis[i][j] > max) max = dis[i][j];
            }
        }
        return max;
    }

    private static void BFS() {
        int[] arrx = {-1,0,1,0};
        int[] arry = {0,1,0,-1};

        while (queue.size() > 0) {
            Node node = queue.poll();
            for (int i=0; i<4; i++) {
                int xnum = node.x + arrx[i];
                int ynum = node.y + arry[i];
                if (xnum>=0 && xnum <n && ynum >=0 && ynum <m && board[xnum][ynum] == 0) {
                    targetCnt = targetCnt +1;
                    board[xnum][ynum] = 1;
                    dis[xnum][ynum] = dis[node.x][node.y] + 1;
                    queue.offer(new Node(xnum, ynum));
                }
            }
        }
    }
}
