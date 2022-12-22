package com.exercise;

import java.util.*;

public class Program29 {
	static int[] items;
	int tot=0;
	Scanner sc = new Scanner(System.in);
	
	Program29(int c){
		items=new int[c];
		System.out.println("Get the prices of items");
		for (int i=0;i<c;i++) {
			items[i]=sc.nextInt();
			tot+=items[i];
		}
		System.out.println("Total amount "+tot);
	}


	void discount() {
		if (tot > 5000) {
			System.out.println("You are eligible for discount");
			int dis = tot * 20 / 100;
			tot -= dis;
			System.out.println("Amont to be paid " + tot);
		} else {
			System.out.println("You are not eligible for discount");
			System.out.println("Amont to be paid " + tot);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter no of items");
		Program29 obj = new Program29(sc.nextInt());
		
		obj.discount();
	}
}
