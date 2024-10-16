package com.nt;

import java.util.Scanner;

public class DemoString {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the first String......");
		String sc = s.nextLine().trim();
		System.out.println("Enter the second String......");
		String sc1 = s.nextLine();
		boolean equalsIgnoreCase = sc.equalsIgnoreCase(sc1);
		if (equalsIgnoreCase) {
             System.out.println("String Are equal");
		}else {
			System.out.println("String are not equals");
		}
	}

}
