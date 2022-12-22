package com.training;

import java.util.*;
import java.math.*;

public class Practice {
	int a=7;		//instance variable
	static int l=10;		//static variable
	public void add() {
		int a=5;		//local variable of add method
		int b=6;
	}

	public static void main(String[] args) {

		// primitive datatypes
		int a = 1; // -2^31 to 2^31-1		//local variable of main method
		char b = 'K';
		boolean c = true;
		byte d = 127;
		float e = 1.5f; // 7 decimal points
		long f = 56523566; // -2^63 to 2^63-1
		short g = 32767;
		double h = 1.25; // 15 to 16 decimal points

		// non primitive datatypes
			// class
		Scanner sc = new Scanner(System.in); // object
		String s = "Chilanka";				//String
			// Interface
		int[] ar = new int[2];				//array
		ar[0] = 1;
		ar[1] = 2;
		String[] str= {"Chilanka","Nath"};
		
		//Commandlinearguments
			//int i=Integer.parseInt(args[0]);
			//int j=Integer.parseInt(args[1]);
		
		Practice pr=new Practice();
		pr.add();
		pr.a=5;			//calling instance using object1
		Practice pr1=new Practice();
		pr1.a=9;		//calling instance using object2
		l=12;			//calling static variable
		
		//switch
		char h1=sc.next().charAt(0);
		String alpha=null;
		switch(h1) {
		case 'a':
			alpha="first letter in alphabet";
			break;
		case 'b':
			alpha="second letter";
			break;
		default: System.out.println("no ltter");
		}
		
		//for each
		for(String str1:str) {
			System.out.println(str1);
		}
		
		//
	}
}
