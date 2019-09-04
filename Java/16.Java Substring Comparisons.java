/*
	Java Substring Comparisons
	URL: https://www.hackerrank.com/challenges/java-string-compare/problem
*/
import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        int length = s.length();
        int numOfSubstrings = length - k + 1; 
        String[] substrings = new String[numOfSubstrings];

        substrings[0] = s.substring(0, k);
        String smallest = substrings[0];
        String largest = substrings[0];

        for(int i = 1 ; i < numOfSubstrings ; i++) {
            substrings[i] = s.substring(i, i + k);
            
            if(substrings[i].compareTo(smallest) < 0){
                smallest = substrings[i];
            }

            if(substrings[i].compareTo(largest) > 0){
                largest = substrings[i];
            }
        }

        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}