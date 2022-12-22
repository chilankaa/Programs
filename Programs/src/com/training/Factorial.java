package com.training;
import java.util.*;
public class Factorial {
	public static void main(String[] args) {
		System.out.println("Enter number");
		Scanner sc=new Scanner(System.in);
		long num=sc.nextInt();
		long i,temp=1;
		for(i=1;i<=num;i++) {
			temp=temp*i;
		}
		System.out.println("Factorial of "+num+" is "+temp);
	}

}
