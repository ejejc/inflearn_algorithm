package com.example.inflearn_algorithm.sorting_searching_algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ch06_07 {
    public static class Point implements Comparable<Point> {
        public int x, y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public int compareTo(Point o) {
            // 1 2 3 오름 차순일 때 1(this)-2(o) = 음수
            // 3 2 1 오름 차순일 때 2(o)-3(this) = 음수
            if (this.x == o.x) return this.y - o.y;
            else return this.x - o.x;
        }
    }

    public static void prints() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Point> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            arr.add(new Point(x,y));
        }
        Collections.sort(arr);
        for (Point obj : arr) {
            System.out.println("obj = " + obj.x + " " + obj.y);
        }
    }
}
