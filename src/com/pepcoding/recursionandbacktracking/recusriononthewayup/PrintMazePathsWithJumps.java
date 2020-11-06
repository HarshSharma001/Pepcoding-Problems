package com.pepcoding.recursionandbacktracking.recusriononthewayup;

import java.io.*;
import java.util.*;

public class PrintMazePathsWithJumps {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        printMazePaths(1, 1, n, m, "");
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static void printMazePaths(int sr, int sc, int dr, int dc, String answer) {
        if (sr == dr && sc == dc) {
            System.out.println(answer);
        }

        for (int i = 1; i <= dc - sc; i++) {
            printMazePaths(sr, sc + i, dr, dc, answer + "h" + String.valueOf(i));
        }

        for (int i = 1; i <= dr - sr; i++) {
            printMazePaths(sr + i, sc, dr, dc, answer + "v" + String.valueOf(i));
        }

        for (int i = 1; i <= dc - sc && i <= dr - sr; i++) {
            printMazePaths(sr + i, sc + i, dr, dc, answer + "d" + String.valueOf(i));
        }
    }

}
