package com.exercise;

import java.util.*;

public class Program28 {
	void average(int a, int b, int c) {
		int sum = a + b + c;
		float avg = sum / 3;
		System.out.println(avg);
	}

	void average(float a, float b, float c) {
		float sum = a + b + c;
		float avg = sum / 3;
		System.out.println(avg);
	}

	void area(int a,int b) {
		int area_rect=a*b;
		System.out.println(area_rect);
	}
	
	void area(int a) {
		int area_square=a*a;
		System.out.println(area_square);
	}
	
	void area(float a) {
		double area_circle=3.14*a*a;
		System.out.println(area_circle);
	}
	public static void main(String[] args) {
		Program28 obj = new Program28();
		obj.average(5, 4, 3);
		obj.average(5.2f, 3.4f, 7.5f);
		obj.area(5, 4);
		obj.area(5);
		obj.area(9.2f);
	}
}
