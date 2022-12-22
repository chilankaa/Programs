package com.training;
import java.util.*;

public class Palindrome {
	public static void main(String[] args) {
		System.out.println("enter number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int count=0;
        
		int r=0;
		int value=0;
		int reverse=0;
		int i=num;
		while(i>0) {
			
			r=i%10;	
			value=value*10+r;
			i=i/10;
			reverse=value;
			
			count++;
		}
		System.out.println(reverse);
		System.out.println(count);
		
		if(reverse==num) {
			System.out.println("Palindrome number");
		
		}
		else {
			System.out.println("not a Palindrome number");
		}
	}

}
