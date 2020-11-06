package com.pepcoding.recursionandbacktracking.recursionwitharraylist;

import java.util.*;

public class GetStairPaths {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        globalNVal = n;
        System.out.println(getStairPaths(n));
    }

    private static int globalNVal = 0;
    static int array[] = {1,2,3};
    public static ArrayList<String> getStairPaths(int n) {
        if(n==0)
        {
            ArrayList<String> list = new ArrayList<>();
            list.add("");
            return list;
        }
        else if(n < 0)
        {
            ArrayList<String> list = new ArrayList<>();
            return list;
        }

        ArrayList<String> onePaths = getStairPaths(n-1);
        ArrayList<String> twoPaths = getStairPaths(n-2);
        ArrayList<String> threePaths = getStairPaths(n-3);

        ArrayList<String> finalPaths = new ArrayList<>();

        for(String s: onePaths)
        {
            finalPaths.add(1+s);
        }

        for(String s: twoPaths)
        {
            finalPaths.add(2+s);
        }

        for(String s: threePaths)
        {
            finalPaths.add(3+s);
        }

        return finalPaths;
    }

}
