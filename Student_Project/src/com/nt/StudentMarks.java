package com.nt;

public class StudentMarks {

	public static void main(String[] args) {
		int s1 = 98;
		int s2 = 67;
		int s3 = 87;
		int s4 = 53;
		int s5 = 76;
		int s6 = 86;
		int totalmarks = s1 + s2 + s3 + s4 + s5 + s6;

		float parcentage = (float) totalmarks / 6;

		System.out.println("The value of s1:" + s1);
		System.out.println("The value of s2:" + s2);
		System.out.println("The value of s3:" + s3);
		System.out.println("The value of s4:" + s4);
		System.out.println("The value of s5:" + s5);
		System.out.println("The value of s6:" + s6);
		System.out.println("total:" + totalmarks);
		System.out.println("parsantage:" + parcentage);
	}
}
