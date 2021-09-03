package com.pepcoding.recursionandbacktracking.recursionwitharraylist;

import java.io.*;
import java.util.*;

public class GetMazePathsWithJumps {

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
        //Base Case
        if(sc == dc && sr == dr){
           ArrayList<String> baseCaseList = new ArrayList<>();
           baseCaseList.add("");
           return baseCaseList;
        }
        
        //Invalid Base Case
        if(sc > dc || sr > dr){
            ArrayList<String> invalidPaths = new ArrayList<>();
            return invalidPaths;
        }
        
        //faith * expectations
        ArrayList<String> list = new ArrayList<>();
        //horizontal possible paths
        for(int i=1; i<=dc; i++){
            ArrayList<String> hPaths = getMazePaths(sr, sc + i, dr, dc);
            for(String hPath: hPaths){
                list.add("h"+i+hPath);
            }
        }
        
        //vertical possible paths
        for(int i=1; i<=dr; i++){
            ArrayList<String> vPaths = getMazePaths(sr + i, sc, dr, dc);
            for(String vPath: vPaths){
                list.add("v"+i+vPath);
            }
        }
        
        //diagonal possible paths
        for(int i=1, j=1; i<=dr && j<=dc; i++, j++){
            ArrayList<String> dPaths = getMazePaths(sr + i, sc + i, dr, dc);
            for(String dPath: dPaths){
                list.add("d"+i+dPath);
            }
        }
        
        return list;
    }

}
