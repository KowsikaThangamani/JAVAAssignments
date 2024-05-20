package com.constructor;

public class Car {

	String make;
	String model;
	int year;

	public Car(String make, String model, int year) {
		this.make = make;
		this.model = model;
		this.year = year;
	}

	public Car() {
		make = "unknown";
		model = "unknown";
		year = 0;
	}

	public static void main(String[] args) {

		Car obj = new Car();
		System.out.println(obj.make + " , " + obj.model + " , " + obj.year);

		Car obj1 = new Car("Honda", "City", 2020);
		System.out.println(obj1.make + " , " + obj1.model + " , " + obj1.year);


	}

}
