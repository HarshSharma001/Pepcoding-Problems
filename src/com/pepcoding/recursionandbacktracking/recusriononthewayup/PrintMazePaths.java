package com.pepcoding.recursionandbacktracking.recusriononthewayup;

import java.io.*;
import java.util.*;

public class PrintMazePaths {

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
        } else if (sr <= dr && sc <= dc) {
            printMazePaths(sr, sc + 1, dr, dc, answer + "h");
            printMazePaths(sr + 1, sc, dr, dc, answer + "v");
        }
    }

}
