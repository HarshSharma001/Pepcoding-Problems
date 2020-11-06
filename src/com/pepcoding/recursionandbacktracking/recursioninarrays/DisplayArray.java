package com.pepcoding.recursionandbacktracking.recursioninarrays;

import java.io.*;
import java.util.*;

public class DisplayArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int array[] = new int[n];
        for(int i=0; i<n; i++)
        {
            array[i] = sc.nextInt();
        }
        displayArray(array, n-1);
    }

    public static void displayArray(int array[], int n){
        if(n == -1)
        {
            return;
        }
        displayArray(array, n-1);
        System.out.println(array[n]);
    }

}
