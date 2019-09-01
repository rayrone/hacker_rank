/*
	Java Loops II
	URL: https://www.hackerrank.com/challenges/java-loops
*/
import java.util.*;
import java.io.*;

class Solution {
    
    public static void main(String [] argh) {
        
        Scanner in = new Scanner(System.in);
        
        int t = in.nextInt();
        
        for(int i = 0 ; i < t ; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            int bj = 0;
            int sj = 0;
                
            for(int j = 0 ; j < n ; j++) {
                bj += (int) Math.pow(2, j) * b;
                sj = a + bj;
                System.out.print(sj + " ");
            }

            System.out.println("");
        }
        
        in.close();
    }
}
