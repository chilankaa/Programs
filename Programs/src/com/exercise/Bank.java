package com.exercise;

public class Bank {
	private int pin;

	public void setPin(int pin) {
		this.pin = pin;
	}

	public int getPin() {
		return pin;
	}

	void validate(int pin) {
		if (pin == 1001) {
			System.out.println("Valid pin");
		} else if (pin == 1234) {
			System.out.println("Valid pin");
		} else if (pin == 1212) {
			System.out.println("Valid pin");
		} else {
			System.out.println("not a valid pin");
		}
	}
}
