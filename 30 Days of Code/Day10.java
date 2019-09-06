/*
	Day 10: Binary Numbers
	URL: https://www.hackerrank.com/challenges/30-binary-numbers/problem
*/
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int count = 0, maxCount = 0;

        while(n >= 1) {            
            if(n % 2 == 0) {
                count = 0;
            } else {
                count++;
            }
            n /= 2;

            if(count > maxCount) {
                maxCount = count;
            }
        }

        System.out.println(maxCount);

        scanner.close();
    }
}
