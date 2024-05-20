package com.classes.object;

public class VideoAssignment {

//	THis concept is called "OBJECT REFERENCE INTERCHANGE"

	String name;
	int age;
	String city;

	public static void main(String[] args) {

		VideoAssignment c1 = new VideoAssignment();
		c1.name = "Taruna";
		c1.age = 25;
		c1.city = "Pune";

		VideoAssignment c2 = new VideoAssignment();
		c2.name = "Neha";
		c2.age = 35;
		c2.city = "Bangalore";

		VideoAssignment c3 = new VideoAssignment();
		c3.name = "Victor";
		c3.age = 30;
		c3.city = "LA";

		VideoAssignment c4 = new VideoAssignment();
		c4.name = "Kowsi";
		c4.age = 30;
		c4.city = "Sathy";

		VideoAssignment c5 = new VideoAssignment();
		c5.name = "Arunee";
		c5.age = 30;
		c5.city = "LA";

		System.out.println(c1.name + " - " + c1.age + " - " + c1.city);//T
		System.out.println(c2.name + " - " + c2.age + " - " + c2.city);//N
		System.out.println(c3.name + " - " + c3.age + " - " + c3.city);//V
		System.out.println(c4.name + " - " + c4.age + " - " + c4.city);//k
		System.out.println(c5.name + " - " + c5.age + " - " + c5.city);//A

		System.out.println("------------------------------------");

		c1 = c2;

		System.out.println(c1.name + " - " + c1.age + " - " + c1.city);//N
		System.out.println(c2.name + " - " + c2.age + " - " + c2.city);//N
		System.out.println(c3.name + " - " + c3.age + " - " + c3.city);//V
		System.out.println(c4.name + " - " + c4.age + " - " + c4.city);//k
		System.out.println(c5.name + " - " + c5.age + " - " + c5.city);//A


		System.out.println("------------------------------------");

		c2 = c3;

		System.out.println(c1.name + " - " + c1.age + " - " + c1.city);//N
		System.out.println(c2.name + " - " + c2.age + " - " + c2.city);//V
		System.out.println(c3.name + " - " + c3.age + " - " + c3.city);//V
		System.out.println(c4.name + " - " + c4.age + " - " + c4.city);//K
		System.out.println(c5.name + " - " + c5.age + " - " + c5.city);//A

		System.out.println("------------------------------------");

		c3 = c4;

		System.out.println(c1.name + " - " + c1.age + " - " + c1.city);//N
		System.out.println(c2.name + " - " + c2.age + " - " + c2.city);//V
		System.out.println(c3.name + " - " + c3.age + " - " + c3.city);//k
		System.out.println(c4.name + " - " + c4.age + " - " + c4.city);//K
		System.out.println(c5.name + " - " + c5.age + " - " + c5.city);//A

		System.out.println("------------------------------------");

		c4 = c5;

		System.out.println(c1.name + " - " + c1.age + " - " + c1.city);//N
		System.out.println(c2.name + " - " + c2.age + " - " + c2.city);//V
		System.out.println(c3.name + " - " + c3.age + " - " + c3.city);//k
		System.out.println(c4.name + " - " + c4.age + " - " + c4.city);//A
		System.out.println(c5.name + " - " + c5.age + " - " + c5.city);//A

		System.out.println("------------------------------------");

		c5 = c1;

		System.out.println(c1.name + " - " + c1.age + " - " + c1.city);//N
		System.out.println(c2.name + " - " + c2.age + " - " + c2.city);//V
		System.out.println(c3.name + " - " + c3.age + " - " + c3.city);//K
		System.out.println(c4.name + " - " + c4.age + " - " + c4.city);//A
		System.out.println(c5.name + " - " + c5.age + " - " + c5.city);//N
	}

}
