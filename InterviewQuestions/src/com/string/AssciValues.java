package com.string;

import java.util.Scanner;

public class AssciValues {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = scanner.nextLine().toLowerCase();
		int len = str.length();
		for (int i = 0; i < len; i++) {
			char ch = str.charAt(i);
			int p = (int) ch;
           System.out.print(p+" ");
		}
	}

}
