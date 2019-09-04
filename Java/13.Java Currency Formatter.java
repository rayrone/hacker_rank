/*
	Java Currency Formatter
	URL: https://www.hackerrank.com/challenges/java-currency-formatter/problem
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        Locale indiaLocale = new Locale("en", "IN");

        NumberFormat nfUS = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat nfIndia = NumberFormat.getCurrencyInstance(indiaLocale);
        NumberFormat nfChina = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat nfFrench = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        
        System.out.println("US: " + nfUS.format(payment));
        System.out.println("India: " + nfIndia.format(payment));
        System.out.println("China: " + nfChina.format(payment));
        System.out.println("France: " + nfFrench.format(payment));
    }
}
