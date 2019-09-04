/*
	Day 6: Let's Review
	URL: https://www.hackerrank.com/challenges/30-review-loop/problem
*/
import java.io.*;
import java.util.*;

public class Solution {

    private static void printChars(char[] charArray, boolean even) {
        for(int i = even ? 0 : 1 ; i < charArray.length ; i += 2) {
            System.out.print(charArray[i]); 
        }
    }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        String S = scanner.nextLine();
        char[] charArray = null;

        for(int i = 1 ; i <= T ; i++) {
            S = scanner.nextLine();
            charArray = S.toCharArray();
            printChars(charArray, true);
            System.out.print(" "); 
            printChars(charArray, false);
            
            if(i != T) {
                System.out.println();
            }
        }

        scanner.close();
    }
}
