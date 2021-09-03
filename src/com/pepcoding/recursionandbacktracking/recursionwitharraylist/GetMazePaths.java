package com.pepcoding.recursionandbacktracking.recursionwitharraylist;
import java.io.*;
import java.util.*;
public class GetMazePaths {
	public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   //number of rows
        int m = sc.nextInt();   //number of columns
        System.out.println(getMazePaths(0, 0, n-1, m-1));
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        if(sr > dr || sc > dc){
            ArrayList<String> invalidPaths = new ArrayList<>();
            return invalidPaths;
        }
        
        if(sr == dr && sc == dc){
            ArrayList<String> baseCasePaths = new ArrayList<>();
            baseCasePaths.add("");
            return baseCasePaths;
        }
        
        //faith
        ArrayList<String> hPaths = getMazePaths(sr, sc + 1, dr, dc);
        ArrayList<String> vPaths = getMazePaths(sr + 1, sc, dr, dc);
        
        //faith * expectations
        ArrayList<String> totalPaths = new ArrayList<>();
        for(String hPath: hPaths){
            totalPaths.add("h" + hPath);
        }
        
        for(String vPath: vPaths){
            totalPaths.add("v" + vPath);
        }
        
        return totalPaths;
    }
}
