package com.pepcoding.recursionandbacktracking.recursionwitharraylist;
import java.io.*;
import java.util.*;
public class GetMazePaths {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   //row
        int m = sc.nextInt();   //column
        System.out.println(getMazePaths(1,1,n,m));
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        if(sc==dc && sr==dr)
        {
            ArrayList<String> list = new ArrayList<>();
            list.add("");
            return list;
        }
        ArrayList<String> horizontalPaths = new ArrayList<>();
        if(sc < dc)
        {
            horizontalPaths = getMazePaths(sr,sc+1,dr,dc);
        }

        ArrayList<String> verticalPaths = new ArrayList<>();
        if(sr < dr)
        {
            verticalPaths = getMazePaths(sr+1,sc,dr,dc);
        }

        ArrayList<String> overallPaths = new ArrayList<>();

        for(String s: horizontalPaths)
        {
            overallPaths.add("h"+s);
        }

        for(String s: verticalPaths)
        {
            overallPaths.add("v"+s);
        }

        return overallPaths;
    }
}
