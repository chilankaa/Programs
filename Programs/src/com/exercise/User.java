package com.exercise;

import java.util.Scanner;

public class User {
	public static void main(String[] args) {
		System.out.println("Enter your pin");
		Scanner sc = new Scanner(System.in);
		Bank bnk = new Bank();
		bnk.setPin(sc.nextInt());
		int num=bnk.getPin();
		bnk.validate(num);
	}
}
