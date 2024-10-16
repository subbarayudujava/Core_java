package com.nt;

import java.util.Scanner;

public class DemoString {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String ");
		String sc = s.nextLine();
		int len = sc.length();
		int count = 0;
		for (int i = 0; i < len; i++) {
			char ch = sc.charAt(i);
			switch (ch) {
			case 'a':
				count++;
				break;
			case 'e':
				count++;
				break;
			case 'i':
				count++;
				break;
			case 'o':
				count++;
				break;
			case 'u':
				count++;
				break;
			}
		}
		System.out.println("count vowels:" + count);
	}

}
