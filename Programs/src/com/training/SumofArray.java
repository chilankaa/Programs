package com.training;

import java.util.*;

public class SumofArray {
	public static void main(String[] args) {
		
		System.out.println("enter length of an array");
		Scanner sc = new Scanner(System.in);
		int[] ar=new int[sc.nextInt()];
		int sum=0;
		
		System.out.println("enter elements");
		for(int i=0;i<ar.length;i++) {
			ar[i]=sc.nextInt();
			sum=sum+ar[i];
			
		}
		System.out.println("Sum of elements is :"+sum);
	}
}
