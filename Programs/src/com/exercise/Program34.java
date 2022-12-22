package com.exercise;

import java.util.*;

public class Program34 {
	int num;
	int temp;
	int rev = 0;

	Program34() {
		System.out.println("Finding reverse...");
	}

	Program34(int num) {
		this();
		while (num > 0) {
			temp = num % 10;
			rev = rev * 10 + temp;
			num = num / 10;
		}
		System.out.println("Reverse of number : " + rev);
	}

	public static void main(String[] args) {
		System.out.println("Enter number");
		Scanner sc = new Scanner(System.in);
		Program34 obj = new Program34(sc.nextInt());
	}
}
