package com.nt.subbu;

public class DisplayCustomerDetails {
	void display(Customer c) {
		System.out.println("=======Customer Details=======");
		System.out.println("cust id:" + c.cid);
		System.out.println("cust name:" + c.cname);
		System.out.println("cust city:" + c.city);
		System.out.println("cust mailid:" + c.EmailId);
		System.out.println("cust phonenumber:" + c.phno);
	}
}
