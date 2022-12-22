package com.exercise;

import java.util.*;

public class Program26 {
	static long current_balance=200000;
	static int with_draw=0;
	static Scanner sc=new Scanner(System.in);
	static void deposit() {
		System.out.println("Enter amount to be depsited");
		int d=sc.nextInt();
		current_balance+=d;
		System.out.println("Current balance : "+current_balance);
	}
	static void withdraw() {
		System.out.println("Enter amount to withdraw");
		with_draw=sc.nextInt();
		if(check_balance()) {
			current_balance-=with_draw;
			System.out.println("Current balance : "+current_balance);
		}
		else {
			System.out.println("Insufficient balance");
		}
		
	}
	static boolean check_balance() {
		if(with_draw>current_balance) {
			return false;
		}
		else {
			return true;
		}
		
	}
	public static void main(String[] args) {
		Program26 obj=new Program26();
		System.out.println("Current balance : "+current_balance);
		obj.deposit();
		obj.withdraw();
	}
}
