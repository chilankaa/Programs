package com.training;

import java.util.*;

public class Voting_boolean {
	static int age;
	static boolean eligibility(int a) {
		if(age>=18) {
			return true;	
		}
		return false;
		
	}
	public static void main(String[] args) {
		System.out.println("Enter age");
		Scanner sc=new Scanner(System.in);
		age=sc.nextInt();
		
		boolean result = eligibility(age);
		

		if(result==true) {
			System.out.println("Eligible for voting");
		}
		else {
			System.out.println("not eligible for voting");
		}
		
	}
	
}