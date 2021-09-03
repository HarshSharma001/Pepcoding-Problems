package com.pepcoding.recursionandbacktracking.recursionwitharraylist;

import java.util.*;

public class GetStairPaths {

	public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   //nth stairstep
        System.out.println(getStairPaths(n));
    }

    public static ArrayList<String> getStairPaths(int n) {
        //Base Case
        //if we are on 0th stair step
        if(n == 0){
            ArrayList<String> baseCaseList = new ArrayList<>();
            baseCaseList.add("");
            return baseCaseList;
        }
        
        //if the stair step goes into negative
        if(n < 0){
            ArrayList<String> invalidCaseList = new ArrayList<>();
            return invalidCaseList;
        }
        
        //faith
        ArrayList<String> paths1 = getStairPaths(n-1);
        ArrayList<String> paths2 = getStairPaths(n-2);
        ArrayList<String> paths3 = getStairPaths(n-3);
        
        //faith * expectation
        ArrayList<String> finalPaths = new ArrayList<>();
        for(String path: paths1){
            finalPaths.add("1" + path);
        }
        
        for(String path: paths2){
            finalPaths.add("2" + path);
        }
        
        for(String path: paths3){
            finalPaths.add("3" + path);
        }
        
        return finalPaths;
    }

}
