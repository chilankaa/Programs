package com.training;
import java.util.*;
public class Reverse {
	public static void main(String[] args) {
		System.out.println("enter number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int count=0;
        
		int r=0;	
		int i=num;
		while(i>0) {
			
			r=i%10;	
			System.out.print(r);
			i=i/10;
			count++;
			
		}
		
		System.out.println();
		System.out.println(count);
		
	}

}
 