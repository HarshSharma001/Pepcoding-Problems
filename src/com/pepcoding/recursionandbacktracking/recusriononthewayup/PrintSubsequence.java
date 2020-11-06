package com.pepcoding.recursionandbacktracking.recusriononthewayup;

import java.io.*;
import java.util.*;

public class PrintSubsequence {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        printSS(str, "");
    }

    private static boolean isInteracting = true;
    public static void printSS(String str, String answer) {
        if(str.length() == 0)
        {
            System.out.println(answer);
        }

        else if(str.length()>0)
        {
            char initialChar = str.charAt(0);
            String remaining = str.substring(1, str.length());
            printSS(remaining, answer+initialChar);     //For yes option
            printSS(remaining, answer+"");     //For no option

        }


    }

}
