/*
    Java Anagrams
    URL: https://www.hackerrank.com/challenges/java-anagrams/problem
*/
import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {

        int lengthA = a.length();
        int lengthB = b.length();

        if(lengthA != lengthB) {
            return false;
        }

        char[] tempA = a.toLowerCase().toCharArray();
        char[] tempB = b.toLowerCase().toCharArray();

        int amountOfLetter = 26;
        int[] freqA = new int[amountOfLetter];
        int[] freqB = new int[amountOfLetter];

        for(int i = 0 ; i < lengthA ; i++) {
            freqA[tempA[i] - 'a']++;
        }

        for(int i = 0 ; i < lengthB ; i++) {
            freqB[tempB[i] - 'a']++;
        }

        for(int i = 0 ; i < amountOfLetter ; i++) {
            if(freqA[i] != freqB[i]) {
                return false;
            }
        }

        return true;
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
