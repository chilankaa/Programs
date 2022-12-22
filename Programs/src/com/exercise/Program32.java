package com.exercise;

import java.util.Scanner;

public class Program32 {
	static String word;

	public static void main(String[] args) {
		Program32 obj = new Program32();
		System.out.println("Enter word");
		Scanner sc = new Scanner(System.in);
		obj.word = sc.nextLine();
		String temp = "";
		for (int i = word.length() - 1; i >= 0; i--) {
			temp = temp + word.charAt(i);
		}
		if(word.equals(temp)) {
			System.out.println("It is a palindrome word");
		}
		else {
			System.out.println("not a palindrome");
		}
	}

}
