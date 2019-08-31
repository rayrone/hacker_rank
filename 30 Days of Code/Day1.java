/*
    Day 1: Data Types
    URL: https://www.hackerrank.com/challenges/30-data-types/problem
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day1 {
    
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
        
        Scanner scan = new Scanner(System.in);

        int myInt = scan.nextInt();
        double myDouble = scan.nextDouble();
        scan.nextLine();
        String myString = scan.nextLine();

        System.out.println(i + myInt);
        System.out.println(d + myDouble);
        System.out.print(s + myString);

        scan.close();
    }
}