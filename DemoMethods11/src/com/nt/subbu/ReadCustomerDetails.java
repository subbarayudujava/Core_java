package com.nt.subbu;

import java.util.Scanner;

public class ReadCustomerDetails {
     Customer read(Scanner s) {
    	 Customer c=new Customer();
    	 System.out.println("Enter the Customer id");
    	 c.cid=s.nextInt();
    	 System.out.println("Enter the customer name");
    	 c.cname=s.nextLine();
    	 System.out.println("Enter the customer city");
    	 c.city=s.nextLine();
    	 System.out.println("Enter the customer emailId");
    	 c.EmailId=s.nextLine();
    	System.out.println("Enter the  customer phone Number");
    	 c.phno=s.nextLong();
    	 return  c;
     }
}
