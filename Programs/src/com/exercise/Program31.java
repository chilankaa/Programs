package com.exercise;


import java.util.Scanner;

public class Program31{
	static Scanner sc=new Scanner(System.in);
	static double area;

	static void area_circle(){
		int r=sc.nextInt();
		area=3.18*r*r;
		System.out.println("area of circle is "+area);
	}

	static void area_rectangle(){
		int l=sc.nextInt();
		int b=sc.nextInt();
		area=l*b;
		System.out.println("area of circle is "+area);
	}

	static void area_square(){
		int a=sc.nextInt();
		area=a*a;
		System.out.println("area of circle is "+area);
	}
	public static void main(String[] args) {
		char choice=args[0].charAt(0);
		
		switch(choice){
		case 'a':
			area_circle();
			break;
		case 'b':
			area_rectangle();
			break;
		case 'c':
			area_square();
			break;
		}


	}
}
