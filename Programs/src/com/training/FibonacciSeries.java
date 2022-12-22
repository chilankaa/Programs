package com.training;
import java.util.*;
public class FibonacciSeries {
	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
		int n=0;
		int n1=1;
		System.out.println("First 10 fibonacci numbers");
		System.out.println(n);
		System.out.println(n1);
		for(int i=3;i<=10;i++) {
			int n2=n1+n;
			System.out.println(n2);
			n=n1;
			n1=n2;
			
			
		}
//		int[] fib= {0,1,1,2,3,5};
//		for(int i=0;i<fib.length;i++) {
//		System.out.println(fib[i]);
//		}
		//for(int f:fib) {
		//System.out.println(f);
		//}
	}
}