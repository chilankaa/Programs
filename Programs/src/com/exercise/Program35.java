package com.exercise;

import java.util.*;

public class Program35 {
	int num;
	long fact = 1;

	long factorial(int a) {
		for (int i = 1; i <= a; i++) {
			fact = fact * i;
		}
		return fact;
	}

	void print(int a) {
		System.out.println("Factorial of " + a + " is " + factorial(a));
	}

	public static void main(String[] args) {
		Program35 obj = new Program35();
		System.out.println("Enter number");
		Scanner sc = new Scanner(System.in);
		obj.print(sc.nextInt());

	}
}
