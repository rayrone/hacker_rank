/*
	Java End-of-file
	URL: https://www.hackerrank.com/challenges/java-end-of-file/problem
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfLine = 0;
        
        while(scanner.hasNextLine()) {
            numOfLine++;
            System.out.println(numOfLine + " " + scanner.nextLine());   
        }
    }
}
