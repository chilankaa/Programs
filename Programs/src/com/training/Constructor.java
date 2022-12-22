package com.training;

public class Constructor {
	Constructor(){
		System.out.println("Constructor method");
	}
	
	void add(int a, int b,int c) {
		System.out.println("Result :");
		System.out.println(a + b+c);
	}

	public static void main(String[] args) {
		Constructor obj = new Constructor();
		obj.add(5, 4,9);
	}
}
