package com.bridgelabz.regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserResistrationSystem {

	public static void main(String[] args) {
		System.out.println("Welcome to User Registration system using Regex");
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your First Name : ");
		String firstName = sc.nextLine();
		System.out.println(Pattern.matches("[A-Z][a-z]{2,}", firstName));

	}

}
