package com.exercise;

public class Review {
	String name;

	Review() {
		System.out.println("No argument constructor");
	}

	Review(String name) {
		this();
		this.name = name;
		System.out.println("Parameterized constructor with parameter value " + this.name);
	}

	public Review rev() {
		return this;
	}

	void display() {
		System.out.println("Example to show this keyword uses");
	}

	public static void main(String[] args) {
		Review obj = new Review("Chilanka");
		obj.rev().display();
	}

}
