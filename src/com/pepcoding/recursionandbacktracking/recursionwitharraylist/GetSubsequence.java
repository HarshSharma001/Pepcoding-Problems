package com.pepcoding.recursionandbacktracking.recursionwitharraylist;
import java.util.*;

public class GetSubsequence {
	public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(gss(str));
    }

    public static ArrayList<String> gss(String str) {
        //Base Case
        if(str.isEmpty()){
            ArrayList<String> baseCaseList = new ArrayList<>();
            baseCaseList.add("");
            return baseCaseList;
        }
        
        //faith * expectations 1st half
        char ch = str.charAt(0);
        String remaining = str.substring(1);
        //faith
        ArrayList<String> list = gss(remaining);
        
        //faith * expectations 2nd half
        ArrayList<String> ansList = new ArrayList<>();
        for(String s: list){
            ansList.add(s);
        }
        
        for(String s: list){
            ansList.add(ch+s);
        }
        
        return ansList;
    }
}





