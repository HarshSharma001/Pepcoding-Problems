package com.pepcoding.recursionandbacktracking.recursionwitharraylist;

import java.io.*;
import java.util.*;

public class GetMazePathsWithJumps {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(getMazePaths(1, 1, n, m));
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
        ArrayList<String> finalPaths = new ArrayList<>();
        //Horizontal Paths
        for(int h=1; h<=dc-sc; h++)
        {
            ArrayList<String> hPaths = getMazePaths(sr, sc+h, dr, dc);
            for(String s: hPaths)
            {
                finalPaths.add("h"+h+s);
            }
        }


        //Vertical Paths
        for(int v=1; v<=dr-sr; v++)
        {
            ArrayList<String> vPaths = getMazePaths(sr+v, sc, dr, dc);
            for(String s: vPaths)
            {
                finalPaths.add("v"+v+s);
            }
        }


        //Diagonal Paths
        for(int d=1; d<=dc-sc && d<=dr-sr; d++)
        {
            ArrayList<String> dPaths = getMazePaths(sr+d, sc+d, dr, dc);
            for(String s: dPaths)
            {
                finalPaths.add("d"+d+s);
            }
        }
        return finalPaths;
    }

}
