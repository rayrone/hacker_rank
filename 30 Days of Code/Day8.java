/*
	Day 8: Dictionaries and Maps
	URL: https://www.hackerrank.com/challenges/30-dictionaries-and-maps/problem
*/
import java.util.*;
import java.io.*;

public class Solution {
    
    public static void main(String []argh) {
        
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        Map<String, Integer> phoneBook = new HashMap<>();

        for(int i = 0; i < n; i++) {
            String name = in.next();
            int phone = in.nextInt();
            phoneBook.put(name, phone);
        }

        while(in.hasNext()) {
            String name = in.next();
            Integer phone = phoneBook.get(name);

            if(phone != null) {
                System.out.println(name + "=" + phone);
            }
            else {
                System.out.println("Not found");
            }
        }
        
        in.close();
    }
}
