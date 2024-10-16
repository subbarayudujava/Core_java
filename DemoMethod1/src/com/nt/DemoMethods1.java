package com.nt;

public class DemoMethods1 {
	int a = 10;
	static int b = 20;

	void m1() {
		System.out.println("=======Instance methods======");
		System.out.println("The value A:" + a);
		System.out.println("The value B:" + b);
	}

	static void m2() {
		System.out.println("=====static methods======");
		System.out.println("The value B:" + b);
	}

	public static void main(String[] args) {
      DemoMethods1 demo=new DemoMethods1();
      demo.m1();
       DemoMethods1.m2();
      }

}
