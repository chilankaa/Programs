package com.training;

public class ReviewProgram3 {
	static String name="Chilanka";
	char letter='J';
	String value() {
		String place="alappuzha";
		return place;
	}
public static void main(String[] args) {
	ReviewProgram3 o=new ReviewProgram3();
	System.out.println("Static variable value is :"+name);
	System.out.println("Instance variable value is :"+o.letter);
	String store=o.value();
	System.out.println("Local variable value is : "+store);
}
}
