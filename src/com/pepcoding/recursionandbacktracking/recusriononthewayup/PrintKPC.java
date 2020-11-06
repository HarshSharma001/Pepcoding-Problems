package com.pepcoding.recursionandbacktracking.recusriononthewayup;

import java.io.*;
import java.util.*;

public class PrintKPC {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        printKPC(str, "");
    }

    private static String keypadValues[] = {".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void printKPC(String str, String answer) {
        if(str.length()==0)
        {
            System.out.println(answer);
        }

        else if(str.length() > 0)
        {
            char initialChar = str.charAt(0);
            String remaining = str.substring(1, str.length());

            String keypadValue = keypadValues[Character.getNumericValue(initialChar)];
            for(int i=0; i<keypadValue.length(); i++)
            {
                printKPC(remaining, answer+keypadValue.charAt(i));
            }

        }
    }

}