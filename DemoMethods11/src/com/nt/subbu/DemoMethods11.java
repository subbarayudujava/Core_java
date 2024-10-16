package com.nt.subbu;

import java.util.Scanner;

public class DemoMethods11 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		// TODO Auto-generated method stub
		ReadCustomerDetails customer= new ReadCustomerDetails();
		Customer ob=customer.read(s);
      DisplayCustomerDetails details=new DisplayCustomerDetails();
      details.display(ob);
	}

}
