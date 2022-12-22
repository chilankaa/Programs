package com.training;
import java.util.*;
import java.lang.Math;

public class Armstrong {
	public static void main(String[] args) {
		System.out.println("Enter number");
		Scanner sc=new Scanner(System.in);
		
		int num=sc.nextInt();
		int temp=num;
		int n1=num;
		int r=0,count=0,sum=0;
		while(num>0) {
			num=num/10;
			count++;	
		}
		while(temp>0) {
			r=temp%10;
			sum+= Math.pow(r, count);
			temp=temp/10;
			 
		}
		if(sum==n1) {
			System.out.println("Armstrong number");
		
		}
		else {
			System.out.println("not a Armstrong number");
		}
	
	}

}
