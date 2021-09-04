package com.pepcoding.recursionandbacktracking.recusriononthewayup;

import java.io.*;
import java.util.*;

public class PrintMazePaths {

	public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   //no' of rows
        int m = sc.nextInt();   //no' of columns
        printMazePaths(0, 0, n-1, m-1, "");
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static void printMazePaths(int sr, int sc, int dr, int dc, String psf) {
        //Base Case
        if(sr == dr && sc == dc){
            System.out.println(psf);
            return;
        }
        
        if(sc > dc || sr > dr){
            return;
        }
        
        //faith * expectation
        printMazePaths(sr, sc + 1, dr, dc, psf + "h");  //horizontal
        printMazePaths(sr + 1, sc, dr, dc, psf + "v");  //vertical
    }

}
