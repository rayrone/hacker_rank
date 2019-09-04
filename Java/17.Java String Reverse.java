/*
	Java String Reverse
	URL: https://www.hackerrank.com/challenges/java-string-reverse/problem
*/
import java.io.*;
import java.util.*;

public class Solution {

    private static String reverse(String str) {
        
        int length = str.length();
        String strReverse = "";

        for(int i = length - 1 ; i >= 0 ; i--) {
            strReverse += str.charAt(i);
        }

        return strReverse;
    }

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        
        boolean isPalindrome = A.equals(reverse(A));
        System.out.println(isPalindrome ? "Yes" : "No");
    }
}
