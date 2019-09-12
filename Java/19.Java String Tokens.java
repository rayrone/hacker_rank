/*
	Java String Tokens
	URL: https://www.hackerrank.com/challenges/java-string-tokens/problem
*/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine().trim();
        
        if(s.isEmpty()) {
            System.out.println('0');
        } else {
            String[] tokens = s.split("[\\p{Punct}\\p{Blank}]+");
            System.out.println(tokens.length);

            for(int i = 0 ; i < tokens.length ; i++) {
                if(i != 0) {
                    System.out.println("");
                }
                System.out.print(tokens[i]);
            }
        }
        scan.close();
    }
}
