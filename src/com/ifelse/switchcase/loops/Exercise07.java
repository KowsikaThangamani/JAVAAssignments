package com.ifelse.switchcase.loops;

public class Exercise07 {

	public static void main(String[] args) {
		// Mini, Sedan, SUV, Premium

		String carType = "Mini";
		switch (carType.trim().toUpperCase()) {
		case "MINI" :
			System.out.println("booking a MINI Car");
			break;
		case "SEDAN" :
			System.out.println("booking a SEDAN Car");
			break;
		case "SUV" :
			System.out.println("booking a SUV Car");
			break;
		case "PREMIUM" :
			System.out.println("booking a PREMIUM Car");
			break;
		default :
			System.out.println("please select the right car type");
			break;
		}

	}

}
