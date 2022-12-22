package com.training;

import java.util.*;

public class Palindrome_by_Static {
	static int num,n,value=0;
	static void reverse() {
		int r,rev=0;
		while(num>0) {
			r=num%10;
			rev=rev*10+r;
			num=num/10;
			value=rev;
		}
		System.out.println(value);
	}
	
	static void check(int a,int b) {
		if (n==value) {
			System.out.println("Number is palindrome");
		}
		else {
			System.out.println("Number is not palindrome");
		}
	}
	public static void main(String[] args) {
		System.out.println("Enter number");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		n=num;
		reverse();
		check(value,n);
	}
}