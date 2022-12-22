package com.exercise;

import java.util.Scanner;

public class Program38 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter price of item");
		int p=sc.nextInt();
		System.out.println("Choose season");
		String choice = sc.next();
		switch (choice) {
		case "on":
			Program38_On on = new Program38_On();
			on.discount(p);
			break;
		case "off":
			Program38_Off Off = new Program38_Off();
			Off.discount(p);
			break;
		}
	}
}
