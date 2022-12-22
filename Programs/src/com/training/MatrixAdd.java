package com.training;

import java.util.*;

public class MatrixAdd {
	public static void main(String[] args) {
		
		System.out.println("enter length of arrays");
		Scanner sc = new Scanner(System.in);

		int[][] ar = new int[sc.nextInt()][sc.nextInt()];
		int[][] arr = new int[ar.length][ar[0].length];
		int[][] sum = new int[ar.length][ar[0].length];
//1st array
		System.out.println("Enter the elements of first array");
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[0].length; j++) {
				ar[i][j] = sc.nextInt();
				System.out.println();
			}
		}
//2nd array
		System.out.println("Enter the elements of 2nd array");
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[0].length; j++) {
				arr[i][j] = sc.nextInt();
				System.out.println();
			}
		}
//Finding sum
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[0].length; j++) {
				sum[i][j] = ar[i][j] + arr[i][j];
				System.out.println();
			}
		}
//Displaying sum
		System.out.println("Sum of arrays :");
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[0].length; j++) {
				System.out.print(sum[i][j] + " ");
			}
			System.out.println();
		}
	}
}
