package com.exercise;

import java.util.Scanner;

import sun.applet.Main;

public class Program30 {
	int mark1;
	int mark2;
	int mark3;
	int tot;
	Program30(int i, int j, int k) {
		mark1=i;
		mark2=j;
		mark3=k;
	}
	int total() {
		tot=mark1+mark2+mark3;
		return tot;
	}
	void grade() {
		if(tot>250) {
			System.out.println("Grade is A");
		}
		else if(tot<=250 && tot>200) {
			System.out.println("Grade is B");
		}
		else if(tot<=200 && tot>150) {
			System.out.println("Grade is C");
		}
		else if(tot<=150 && tot>100) {
			System.out.println("Grade is D");
		}
		else if(tot<=100 && tot>50) {
			System.out.println("Grade is E");
		}
		else {
			System.out.println("Failed");
		}
		
	}
	public static void main(String[] args) {
		Program30 obj=new Program30(50,60,40);
		Program30 obj1=new Program30(45,55, 79);
		obj.total();
		obj1.total();
		obj.grade();
		obj1.grade();
	}
}
