package com.exercise;

import java.util.*;

public class Program33c {
	int tot;

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		Program33a obj = new Program33a();
		System.out.println("Enter basicpay");
		obj.basic=sc.nextInt();
		System.out.println("Enter deduction");
		obj.deduction=sc.nextInt();
		System.out.println("Enter bonus");
		obj.bonus=sc.nextInt();
		
		Program33b obj1 = new Program33b();
		obj1.calcHra(obj.basic);
		obj1.calcPf(obj.basic);
		
		Program33c obj2 = new Program33c();
		obj2.tot = obj.basic + obj1.hra - obj1.pf - obj.deduction + obj.bonus;
		System.out.println(".............Salaryslip............");
		System.out.println("Basicpay of an employee : " + obj.basic);
		System.out.println("Deduction from salary : " + obj.deduction);
		System.out.println("Bonus provided : " + obj.bonus);
		System.out.println("hra : " + obj1.hra);
		System.out.println("pf : " + obj1.pf);
		System.out.println("Total salary by hand : " + obj2.tot);
	}
}
