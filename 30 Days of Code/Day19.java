/*
	Day 19: Interfaces
	URL: https://www.hackerrank.com/challenges/30-interfaces/problem
*/
import java.io.*;
import java.util.*;

interface AdvancedArithmetic{
   int divisorSum(int n);
}

class Calculator implements AdvancedArithmetic {
    
    public int divisorSum(int n) {
        
        int count, sumOfDivisors = 1;

        for (int i = 2 ; i * i <= n ; i++) {
            count = 0;
            
            while (n % i == 0) {
                n /= i;
                count++;
            }
            
            if (count > 0) {
                sumOfDivisors *= ((Math.pow(i, count + 1) - 1) / (i - 1));
            }
        }
        
        if(n > 1) {
            sumOfDivisors *= ((Math.pow(n, 2) - 1) / (n - 1));
        }
        
        return sumOfDivisors;
    }
}

class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        
      	AdvancedArithmetic myCalculator = new Calculator(); 
        int sum = myCalculator.divisorSum(n);
        System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName() );
        System.out.println(sum);
    }
}
