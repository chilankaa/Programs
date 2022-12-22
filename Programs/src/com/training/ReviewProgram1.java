package com.training;

import java.util.*;

public class ReviewProgram1 {
	int add(int a, int b) {
		int result = a + b;
		return result;
	}

	public static void main(String[] args) {
		ReviewProgram1 obj=new ReviewProgram1();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter numbers");
		int sum=obj.add(sc.nextInt(), sc.nextInt());
		System.out.println("Sum of numbers : "+sum);

	}
}
