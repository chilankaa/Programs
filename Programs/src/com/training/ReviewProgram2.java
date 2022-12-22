package com.training;

import java.util.*;

public class ReviewProgram2 {

	int sum;

	void add(int a, int b) {
		sum = a + b;
	}

	void display() {
		System.out.println("Result is :" + sum);
	}

	public static void main(String[] args) {
		ReviewProgram2 obj = new ReviewProgram2();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter numbers");
		obj.add(sc.nextInt(), sc.nextInt());
		obj.display();

	}
}