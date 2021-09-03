package com.pepcoding.recursionandbacktracking.recusriononthewayup;

import java.io.*;
import java.util.*;

public class PrintSubsequence {

	public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        printSS(str, "");
    }

    public static void printSS(String str, String ans) {
        //Base Case
        if(str.isEmpty()){
            System.out.println(ans);
            return;
        }
        
        char ch = str.charAt(0);
        String remaining = str.substring(1);
        
        //faith
        printSS(remaining, ans + ch);   //aayega
        printSS(remaining, ans);    //nhi aayega
    }

}
