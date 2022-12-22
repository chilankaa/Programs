package com.exercise;
import java.util.*;
public class Program22 {
	static String name;
	static int age;

	static void name() {
		System.out.println("Enter name and age");
		Scanner sc=new Scanner(System.in);
		name = sc.nextLine();
		age = sc.nextInt();

	}

	static void display() {
		name();
		System.out.println("Name is :"+name);
		System.out.println("Age is :"+age);
	}
	public static void main(String[] args) {
		Program22 p=new Program22();
		display();
	}
}
