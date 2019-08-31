/*
	Day 0: Hello World
	URL: https://www.hackerrank.com/challenges/30-hello-world/problem
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day0 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String inputString = scanner.next();
		
		System.out.println("Hello, World.");
		System.out.println(inputString);
		
		scanner.close();
	}
}
