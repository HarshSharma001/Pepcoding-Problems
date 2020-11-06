package com.pepcoding.recursionandbacktracking.recursioninarrays;

import java.io.*;
import java.util.*;

public class LastIndex {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        globalValue = n;
        int array[] = new int[n];
        for(int i=0; i<n; i++){
            array[i] = sc.nextInt();
        }
        int element = sc.nextInt();
        System.out.println(lastIndex(array, n-1, element));
    }

    private static int globalValue=0;
    private static int lastIndex(int[] array, int index, int element) {
        int location=-1;
        if(array[index] == element)
        {
            location = index;
            return location;
        }
        else if(array[index] != element && index > 0)
        {
            location = lastIndex(array, index-1, element);
        }
        return location;
    }

}
