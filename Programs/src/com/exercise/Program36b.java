package com.exercise;

import java.util.Scanner;

public class Program36b extends Program36a {
	void add() {
		if (super.add(5,4) % 10 == 0) {
			System.out.println("addition result of can divisible by 10");
		} else {
			System.out.println("addition result can not divisible by 10");
		}
	}

	public static void main(String[] args) {
		Program36b obj = new Program36b();
		obj.add();
	}

}
