package com.string;

import java.util.StringTokenizer;

public class FindPalindromes {

	public static void main(String[] args) {

		String str = "dad mom car brother sister mobile";
		StringTokenizer st = new StringTokenizer(str, " ");
		int count = st.countTokens();
		//System.out.println(count);
		while (st.hasMoreTokens()) {
			String token = st.nextToken(); 
			// System.out.println(token);
			String reverse = "";
			for (int i = token.length() - 1; i >= 0; i--) {
				char ch = token.charAt(i); 
//				System.out.print(ch);
				reverse = reverse + ch;
				if (token.equalsIgnoreCase(reverse)) {
					System.out.println(token);
				}
			} // for
			// System.out.println();
		}//while
		/*
		 * String str="Subbarayudu";
		 * 
		 * char ch1='.'; char ch='j';
		 * 
		 * Integer i=10; System.out.println(str+i);
		 */
	}//main
}//class
