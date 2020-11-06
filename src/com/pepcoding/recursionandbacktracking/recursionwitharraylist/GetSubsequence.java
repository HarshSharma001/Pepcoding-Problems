package com.pepcoding.recursionandbacktracking.recursionwitharraylist;
import java.util.*;

public class GetSubsequence {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(gss(s));
    }

    public static ArrayList<String> gss(String str) {
        if(str.length()==0)
        {
            ArrayList<String> list = new ArrayList<>();
            list.add("");
            return list;
        }
        char initialChar = str.charAt(0);
        String remaining = str.substring(1, str.length());
        ArrayList<String> oldResult = gss(remaining);
        ArrayList<String> newResult = new ArrayList<>();
        for(String s: oldResult)
        {
            newResult.add("" + s);
        }

        for(String s: oldResult)
        {
            newResult.add(initialChar + s);
        }

        return newResult;
    }
}





