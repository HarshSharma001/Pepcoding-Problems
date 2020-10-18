package com.pepcoding.basicsofprogramming.twodarray;

import java.io.*;
import java.util.*;

public class TwoDArrayDemo{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int array[][] = new int[r][c];

        for(int i=0; i<r; i++)
        {
            for(int j=0; j<c; j++)
            {
                array[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<r; i++)
        {
            for(int j=0; j<c; j++)
            {
                System.out.print(array[i][j]+" ");
            }
            System.out.println("");
        }
    }
}