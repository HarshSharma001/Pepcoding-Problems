package com.pepcoding.recursionandbacktracking.recursioninarrays;

import java.io.*;
import java.util.*;

public class AllIndicesOfArray {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int array[] = new int[n];
        for(int i=0; i<n; i++)
        {
            array[i] = sc.nextInt();
        }

        int element = sc.nextInt();
        System.out.println(lastIndex(array, array.length-1, element));
    }

    static int location=-1;
    public static int lastIndex(int[] array, int index, int element){
        if(array[index] != element && index>0)
        {
            lastIndex(array,index-1,element);
        }

        else if(array[index] == element)
        {
            location = index;
        }
        return location;
    }

}
