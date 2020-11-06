package com.pepcoding.recursionandbacktracking.recursioninarrays;

import java.io.*;
import java.util.*;

public class MaxOfAnArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int array[] = new int[n];
        for(int i=0; i<n; i++)
        {
            array[i] = sc.nextInt();
        }
        System.out.println(maxOfArray(array, n-1));
    }

    private static int maxOfArray(int[] array, int n) {
        if(n == -1)
        {
            return 0;
        }
        int max = maxOfArray(array, n-1);
        if(array[n] > max)
        {
            max = array[n];
        }
        return max;
    }

}
