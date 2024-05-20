package com.ifelse.switchcase.loops;

public class Exercise06 {

	public static void main(String[] args) {
		//  QA, Stage, Dev, UAT, Prod

		String env = "stage";

		switch (env.trim().toUpperCase()) {
		case "QA" :
			System.out.println("Running in QA Environment");
			break;
		case "STAGE" :
			System.out.println("Running in STAGE Environment");
			break;
		case "DEV" :
			System.out.println("Running in DEV Environment");
			break;
		case "UAT" :
			System.out.println("Running in UAT Environment");
			break;
		case "PROD" :
			System.out.println("Running in PROD Environment");
			break;
		default :
			System.out.println("Please specify the right environment");
			break;
		}

	}

}
