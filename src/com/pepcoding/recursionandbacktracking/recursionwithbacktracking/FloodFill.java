package com.pepcoding.recursionandbacktracking.recursionwithbacktracking;

import java.util.Scanner;

public class FloodFill {
	public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        floodfill(arr, 0, 0, n-1, m-1, "", new boolean[n][m]);
    }
    
    // asf -> answer so far
    public static void floodfill(int[][] maze, int sr, int sc, int dr, int dc, String asf, boolean[][] visited) {
        //Base Case
        if(sr == dr && sc == dc){
            System.out.println(asf);
            return;
        }
        
        if(sr < 0 || sc < 0 || sr > dr || sc > dc || maze[sr][sc] == 1 || visited[sr][sc]){
            return;
        }
        
        //faith * expectation
        visited[sr][sc] = true;
        
        //faith
        floodfill(maze, sr - 1, sc, dr, dc, asf + "t", visited); //top call
        floodfill(maze, sr, sc -1, dr, dc, asf + "l", visited); //left call
        floodfill(maze, sr + 1, sc, dr, dc, asf + "d", visited); //bottom call
        floodfill(maze, sr, sc + 1, dr, dc, asf + "r", visited); //right call
        
        //faith * expectation
        visited[sr][sc] = false;
    }
}
