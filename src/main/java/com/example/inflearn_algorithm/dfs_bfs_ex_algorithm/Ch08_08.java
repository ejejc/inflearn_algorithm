package com.example.inflearn_algorithm.dfs_bfs_ex_algorithm;

import lombok.Getter;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ch08_08 {
    /**
     * 7*7 격자판 미로를 탈출하는 최단 경로의 길이를 출력하는 프로그램을 작성하세요.
     * 경로의 길이는 출발점에서 도착점까지 가는데 이동한 횟수를 의미한다.
     * 출발점 : (1,1) , 도착점 : (7,7) 이고 1은 격자의 벽이고 0은 도로이다.
     * 격자판의 움직임은 상하좌우로만 움직인다.
     *
     * BFS - 이때까지 이동한 횟수가 최소값임을 보장할 수 있습니다. 이는 BFS 알고리즘의 특성 때문입니다.
     * 즉, 이미 도착점에 도달하였을 때는 최소값임을 보장할 수 있다.
     * 최단거리가 아닐때에는 이미 해당 정점이 1로 방문이 되었기 때문에 방문할 수 없다.
     */

    static int[] arrX = {-1, 0, 1, 0};
    static int[] arrY = {0, 1, 0, -1};
    static int[][] board;
    static int[][] dis;

    @Getter
    public static class Node {
       int x;
       int y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    public static void BFS(int x, int y) {
        Queue<Node> queue = new LinkedList<>();
        queue.offer(new Node(x, y));
        board[x][y] = 1;
        while (queue.size() > 0) {
            Node node = queue.poll();
            for (int i=0; i<4; i++) {
                int xNum = node.getX() + arrX[i];
                int yNum = node.getY() + arrY[i];
                if (xNum >= 1 && xNum <=7 && yNum>=1 && yNum<=7 && board[xNum][yNum] == 0) {
                    board[xNum][yNum] = 1;
                    queue.offer(new Node(xNum, yNum));
                    dis[xNum][yNum] = dis[node.getX()][node.getY()] + 1;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        board = new int[8][8];
        dis = new int[8][8];
        for (int i=1; i<=7; i++) {
            for (int j=1; j<=7; j++) {
                board[i][j] = sc.nextInt();
            }
        }
        BFS(1,1);
        if (dis[7][7] == 0) System.out.println(-1);
        else System.out.println(dis[7][7]);
    }
}
