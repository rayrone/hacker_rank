/*
	Day 26: Nested Logic
	URL: https://www.hackerrank.com/challenges/30-nested-logic/problem
*/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int da = sc.nextInt();
        int ma = sc.nextInt();
        int ya = sc.nextInt();

        int de = sc.nextInt();
        int me = sc.nextInt();
        int ye = sc.nextInt();

        if(ya > ye) {
            System.out.println(10000);
        } else if(ya < ye) {
            System.out.println(0);
        } else if(ma > me) {
            System.out.println(500 * (ma - me));
        } else if(ma < me){
            System.out.println(0);
        } else if(da > de) {
            System.out.println(15 * (da - de));
        } else {
            System.out.println(0);
        }
    }
}
