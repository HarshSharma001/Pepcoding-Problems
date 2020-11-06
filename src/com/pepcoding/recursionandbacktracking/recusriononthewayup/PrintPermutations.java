package com.pepcoding.recursionandbacktracking.recusriononthewayup;

import java.io.*;
import java.util.*;

public class PrintPermutations {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        printPermutations(str, "");
    }

    public static void printPermutations(String str, String answer) {
        if(str.length()==0)
        {
            System.out.println(answer);
        }

        else if(str.length()>0){

            for(int i=0; i<str.length(); i++)
            {
                char firstChar = str.charAt(i);
                String remaining="";
                remaining = str.substring(0, i);
                remaining = remaining+str.substring(i+1);
                printPermutations(remaining, answer+firstChar);
            }
        }
    }

}