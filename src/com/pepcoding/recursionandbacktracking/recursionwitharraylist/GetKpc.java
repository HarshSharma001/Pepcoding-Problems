package com.pepcoding.recursionandbacktracking.recursionwitharraylist;
import java.util.*;

public class GetKpc {
    private static String[] keypadValues = {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};
    private static String globalString;
    private static ArrayList<String> resultedList = new ArrayList<>();
    private static int index = 0;
    static char mainArray[];
    private static String[] resultArray;

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        globalString = s;
        mainArray = keypadValues[Integer.parseInt(String.valueOf(globalString.charAt(index)))].toCharArray();
        System.out.println(getKPC(s));
    }


    public static ArrayList<String> getKPC(String str) {
        index = index + 1;
        int keypadNumber = Integer.parseInt(String.valueOf(str.charAt(index)));
        char array[] = keypadValues[keypadNumber].toCharArray();

        if (index == 1) {
            //System.out.println("Inside index == 1 where index = "+index);
            for (int i = 0; i < mainArray.length; i++) {
                for (int j = 0; j < array.length; j++) {
                    String ans = String.valueOf(mainArray[i]).concat(String.valueOf(array[j]));
                    resultedList.add(ans);
                }
            }       //Two numbers are multiplied


            //Modify(Replace) resultArray content with the resultedList content and clear the list//
            resultArray = new String[resultedList.size()];
            for (int i = 0; i < resultedList.size(); i++) {
                resultArray[i] = resultedList.get(i);
            }

            if (index < str.length() - 1) {
                resultedList.clear();
            } else if (index == str.length() - 1) {
                return resultedList;
            }

        } else if (index < str.length() && index > 1) {
            //System.out.println("Inside index > 1 where index = "+index);
            for (int i = 0; i < resultArray.length; i++) {
                for (int j = 0; j < array.length; j++) {
                    String ans = resultArray[i].concat(String.valueOf(array[j]));
                    resultedList.add(ans);
                }
            }       //Two numbers are multiplied


            //Modify(Replace) resultArray content with the resultedList content and clear the list//
            resultArray = new String[resultedList.size()];
            for (int i = 0; i < resultedList.size(); i++) {
                resultArray[i] = resultedList.get(i);
            }

            if (index < str.length() - 1) {
                resultedList.clear();
            } else if (index == str.length() - 1) {
                return resultedList;
            }
        }

        if (index < str.length() - 1) {
            getKPC(str);
        }


        return resultedList;
    }
}