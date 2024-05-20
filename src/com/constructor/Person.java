package com.constructor;

public class Person {

	String name;
	int age;
	char gender;
	double height;

	public Person (String name, int age, char gender, double height) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.height = height;
	}

	public static void main(String[] args) {

		Person obj = new Person("Vicky", 35, 'M', 158.11);
		System.out.println(obj.name + " , " + obj.age + " , " + obj.gender + " , " + obj.height);

		Person obj2 = new Person("kowsi", 32, 'F', 152.11);
		System.out.println(obj2.name + " , " + obj2.age + " , " + obj2.gender + " , " + obj2.height);

	}

}
