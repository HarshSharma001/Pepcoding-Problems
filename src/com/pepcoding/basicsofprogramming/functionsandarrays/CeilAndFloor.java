package com.pepcoding.basicsofprogramming.functionsandarrays;

import java.io.*;
import java.util.*;

public class CeilAndFloor {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int array[] = new int[n];

        for(int i=0; i<n; i++)
        {
            array[i] = sc.nextInt();
        }

        int element = sc.nextInt();

        applyBinarySearch(array, n, element);
    }


    public static void applyBinarySearch(int array[], int n, int element){
        int beg=0, end=array.length-1, mid=(beg+end)/2;
        int location = -1;

        int ceil=-1, floor=-1;

        while(beg<=end && array[mid]!=element)
        {
            if(array[mid] < element)
            {
                beg = mid+1;
            }

            else if(array[mid] > element)
            {
                end = end-1;
            }

            mid = (beg+end)/2;
        }


        if(array[mid] == element)
        {
            location = mid;
            ceil = array[mid];
            floor = array[mid];
            System.out.println(ceil);
            System.out.println(floor);
        }

        else if(location == -1)
        {
            if(array[mid] < element)
            {
                floor = array[mid];
                ceil = array[mid+1];
            }

            if(array[mid] > element)
            {
                ceil = array[mid];
                floor = array[mid-1];
            }


            System.out.println(ceil);
            System.out.println(floor);
        }

    }

}
