package com.nt;

import java.util.Scanner;

public class DemoString {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String Objects To add arrays");
		int n = Integer.parseInt(s.nextLine());
		String a[] = new String[n];
		int len = a.length;
		System.out.println(len);
		System.out.println("Enter the :" + n + ":objects");
		for (int i = 0; i < n; i++) {
			a[i] = new String(s.nextLine());
		}
		System.out.println();
		System.out.println("====displaying data=====");
		for (String k : a) {
			System.out.println(k.toString() + " ");
		}

	}

}