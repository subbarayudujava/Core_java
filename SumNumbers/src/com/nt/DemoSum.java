package com.nt;

import java.util.Scanner;

public class DemoSum {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = s.nextLine();
		int len = str.length();
		int sum = 0;
		for (int i = 0; i < len; i++) {
			char ch = str.charAt(i);
			int k = (int) ch;
			if (k >= 48 && k <= 57) {
				String st = String.valueOf(ch);
				int p = Integer.parseInt(st);
				System.out.println(p + " ");
				sum=sum+p;
			} // if
		} // for
		System.out.println("sum of numbers:"+sum);

	}// main

}// class

