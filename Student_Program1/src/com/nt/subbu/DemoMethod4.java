package com.nt.subbu;

import java.util.Scanner;

public class DemoMethod4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the S1 marks");
		int s1 = sc.nextInt();
		System.out.println("Enter the s2 marks");
		int s2 = sc.nextInt();
		System.out.println("Enter the s3 marks");
		int s3 = sc.nextInt();
		System.out.println("Enter the s4 marks");
		int s4 = sc.nextInt();
		System.out.println("Enter the s5 marks");
		int s5 = sc.nextInt();
		System.out.println("Enter the s6 marks");
		int s6 = sc.nextInt();
		TotalMarks marks = new TotalMarks();
		int total = marks.calculate(s1, s2, s3, s4, s5, s6);
		Percentage ob = new Percentage();
		float p = ob.generate(total);
		System.out.println("Details of the student");
		System.out.println("total marks:"+total);
		System.out.println("percentage:"+p);
	}

}
