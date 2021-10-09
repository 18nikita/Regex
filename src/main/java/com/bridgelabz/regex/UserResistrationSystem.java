package com.bridgelabz.regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserResistrationSystem {

	static Scanner sc = new Scanner(System.in);
																																																																																																																																																																																																																																																																																																																																	
	public static void main(String[] args) {
		System.out.println("Welcome to User Registration system using Regex");

		System.out.println("Enter your First Name : ");
		String firstName = sc.nextLine();
		System.out.println(Pattern.matches("[A-Z][a-z]{2,}", firstName));

		System.out.println("Enter your Last Name : ");
		String lastName = sc.nextLine();
		System.out.println(Pattern.matches("[A-Z][a-z]{2,}", lastName));

		System.out.println("Enter your Email : ");
		String Email = sc.nextLine();
		System.out.println(Pattern.matches("[abc][\\.][a-z]+[@][bl][\\.][co][\\.][a-z]{2,3}", Email));

		System.out.println("Enter your Mobile No. : ");
		CharSequence mobileNum = sc.next();
		System.out.println(Pattern.matches("^(0/91)?[\\s][7-9][0-9]{9}", mobileNum));

		System.out.println("Enter your Password : ");
		String Password = sc.nextLine();
		System.out.println(Pattern.matches("[a-z A-z]{8,}", Password));

	}

}
