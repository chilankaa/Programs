package com.training;

import java.util.*;

public class PrimeNumber {
	public static void main(String[] args) {
		System.out.println("Enter number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int flag = 0;
		// if (n == 1) {
		// System.out.println("It is a Prime number");
		// }
		// else {

		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				flag = 1;
				break;
			}

		}
		if (flag == 1) {
			System.out.println("It is a not Prime number");
		}
		else {
		System.out.println("It is a Prime number");
		}
	}

}
