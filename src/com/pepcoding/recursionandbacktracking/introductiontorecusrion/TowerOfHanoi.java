package com.pepcoding.recursionandbacktracking.introductiontorecusrion;

import java.io.*;
import java.util.*;

public class TowerOfHanoi {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int tower1 = sc.nextInt();
        int tower2 = sc.nextInt();
        int tower3 = sc.nextInt();
        towerOfHanoi(n,tower1, tower2, tower3);
    }

    public static void towerOfHanoi(int n, int tower1, int tower2, int tower3){
        if(n==0)
        {
            return;
        }

        towerOfHanoi(n-1, tower1,tower3, tower2);
        System.out.println(n+"["+tower1+" -> "+tower2+"]");
        towerOfHanoi(n-1, tower3,tower2, tower1);
    }

}
