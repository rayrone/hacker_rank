/*
	Day 25: Running Time and Complexity
	URL: https://www.hackerrank.com/challenges/30-running-time-and-complexity/problem
*/
import java.io.*;
import java.util.*;

public class Solution {

    private static boolean isPrime(int n) {
  
        if(n == 1)
            return false;
    
        if(n == 2)
            return true;
    
        if(n % 2 == 0)
            return false;
  
        for(int i = 3 ; i * i <= n ; i += 2)
            if(n % i == 0)
                return false;
  
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int i = 1 ; i <= T ; i++) {
            int n = sc.nextInt();
            System.out.println(isPrime(n) ? "Prime" : "Not prime");
        }
    }
}
