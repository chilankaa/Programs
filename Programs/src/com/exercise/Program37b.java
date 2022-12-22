package com.exercise;

public class Program37b {
	String name;
	int roll_no;
	Program37a a;

	void print(String name,int roll_no,Program37a a) {
		System.out.println("Name of student " + name);
		System.out.println("Roll number : " + roll_no);
		System.out.println("City : " + a.city);
		System.out.println("District : " + a.District);
		System.out.println("State : " + a.State);
		System.out.println("Country : " + a.Country);
	}

	public static void main(String[] args) {
		Program37a a = new Program37a("Kayamkulam","Alappuzha","Kerala","India");
		Program37b b = new Program37b();
		b.print("Chilanka",54,a);
		
		
	}
}
