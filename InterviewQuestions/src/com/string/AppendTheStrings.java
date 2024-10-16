package com.string;

import java.util.Scanner;

public class AppendTheStrings {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = scanner.nextLine().toLowerCase();
		StringBuilder vowels = new StringBuilder();
		StringBuilder consonants = new StringBuilder();
		StringBuilder numbers = new StringBuilder();
		StringBuilder others = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			int ascii = (int) ch;
			if (ascii >= 97 && ascii <= 122) {
				switch (ch) {
				case 'a' -> vowels.append(ch);
				case 'e' -> vowels.append(ch);
				case 'i' -> vowels.append(ch);
				case 'o' -> vowels.append(ch);
				case 'u' -> vowels.append(ch);
				default -> consonants.append(ch);
				}// switch
			} // if
			else if (ascii >= 48 && ascii <= 57) {
				numbers.append(ch);
			} // else if
			else {
				others.append(ch);
			} // else

		} // for
		System.out.println("Vowels :: " + vowels);
		System.out.println("consonants:: " + consonants);
		System.out.println("numbers :: " + numbers);
		System.out.println("Others :: " + others);
		scanner.close();
	}

}
