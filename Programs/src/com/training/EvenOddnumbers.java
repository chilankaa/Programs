package com.training;

import java.util.*;

public class EvenOddnumbers {
	public static void main(String[] args) {
		int count = 0;
		int count1 = 0;
		for (int i = 10; i <= 20; i++) {
			if (i % 2 == 0) {
				count++;
			} 
			else {
				count1++;
			}
		}
		System.out.println(count);
		System.out.println(count1);
	}

}
