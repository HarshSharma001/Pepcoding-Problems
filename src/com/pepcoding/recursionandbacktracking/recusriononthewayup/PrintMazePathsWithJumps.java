package com.pepcoding.recursionandbacktracking.recusriononthewayup;

import java.io.*;
import java.util.*;

public class PrintMazePathsWithJumps {

	public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   //no' of rows
        int m = sc.nextInt();   //no' of columns
        printMazePathsWithJumps(0, 0, n-1, m-1, "");
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static void printMazePathsWithJumps(int sr, int sc, int dr, int dc, String psf) {
        //Base Case
        if(sr == dr && sc == dc){
            System.out.println(psf);
            return;
        }
        
        if(sr > dr || sc > dc){
            return;
        }
        
        //faith * expectation
        //horizontal paths with jumps
        for(int i = 1; i <= dc -sc; i++){
            printMazePathsWithJumps(sr, sc + i, dr, dc, psf + "h" + i);    
        }
        
        //vertical paths with jumps
        for(int i = 1; i <= dr - sr; i++){
            printMazePathsWithJumps(sr + i, sc, dr, dc, psf + "v" + i);    
        }
        
        //diagonal paths with jumps
        for(int i = 1; i <= dc - sc && i <= dr - sr; i++){
            printMazePathsWithJumps(sr + i, sc + i, dr, dc, psf + "d" + i);    
        }
    }

}
