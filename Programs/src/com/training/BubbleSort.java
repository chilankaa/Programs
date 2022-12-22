package com.training;

import java.util.*;

public class BubbleSort {
	public static void main(String[] args) {
		System.out.println("Enter length of array");
		Scanner sc = new Scanner(System.in);
		int[] ar = new int[sc.nextInt()];
		
		int i = 0, j = 0;
		int temp;
		
		System.out.println("Enter elements");
		for (i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();
		}
		
		for (j = 0; j < ar.length; j++) {
			for (i = 0; i < ar.length - 1; i++) {
				if (ar[i] > ar[i + 1]) {
					temp = ar[i + 1];
					ar[i + 1] = ar[i];
					ar[i] = temp;
				}
			}
		}
		
		for (i = 0; i < ar.length; i++) {
			System.out.print( ar[i] + "  ");

		}
	}
}
