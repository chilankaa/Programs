package com.training;

import java.util.*;

public class SearchArrayElement {
	public static void main(String[] args) {
		System.out.println("Enter length of array");
		Scanner sc = new Scanner(System.in);
		int[] ar = new int[sc.nextInt()];
		int i = 0;
		System.out.println("Enter elements");
		for (i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();
		}

		System.out.println();
		System.out.println("Enter the element to be searched");
		int search = sc.nextInt();

		for (i = 0; i < ar.length; i++) {
			if (search == ar[i]) {
				System.out.println("the element at index " + i);
			}
		}

	}
}