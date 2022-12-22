package com.exercise;

import java.util.*;

public class Program27 {
	
	int tot=0;
	Scanner sc = new Scanner(System.in);

	public int price(String item) {
		if(item.equalsIgnoreCase("Speaker")) {
			return 1000;
		}
		else if(item.equalsIgnoreCase("Earphone")) {
			return 500;
		}
		else if(item.equalsIgnoreCase("Samsung")) {
			return 10000;
		}
		else if(item.equalsIgnoreCase("Redmi")) {
			return 5000;
		}
		else {
			return 0;
		}
	}

	void total(String item) {
			tot = tot + price(item);
		
	}

	void discount() {
		if (tot > 5000) {
			System.out.println("You are eligible for discount");
			int dis = tot * 20 / 100;
			tot -= dis;
			System.out.println("Amont to be paid " + tot);
		} else {
			System.out.println("You are not eligible for discount");
			System.out.println("Amount to be paid "+tot);
		}
	}

	public static void main(String[] args) {
		Program27 obj = new Program27();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter count of items");
		int count=sc.nextInt();
		for(int i=0;i<count;i++) {
			System.out.println("Enter item");
			obj.total(sc.next());
			
		}
		obj.discount();
	}
}
