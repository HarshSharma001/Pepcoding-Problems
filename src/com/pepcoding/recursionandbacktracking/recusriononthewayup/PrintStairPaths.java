package com.pepcoding.recursionandbacktracking.recusriononthewayup;
import java.util.*;
public class PrintStairPaths {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printStairPaths(n, "");
    }

    public static void printStairPaths(int n, String answer) {
        if(n == 0){
            System.out.println(answer);
        }
        else if(n > 0){
            printStairPaths(n-1, answer+"1");
            printStairPaths(n-2, answer+"2");
            printStairPaths(n-3, answer+"3");
        }
    }
}
