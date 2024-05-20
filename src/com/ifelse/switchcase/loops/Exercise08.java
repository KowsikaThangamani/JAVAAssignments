package com.ifelse.switchcase.loops;

public class Exercise08 {

	public static void main(String[] args) {

		String browserName = "chrome";

		if (browserName.equalsIgnoreCase("chrome")) {
			System.out.println("Launching CHROME browser");
		}
		else if (browserName.equalsIgnoreCase("firefox")) {
			System.out.println("Launching FIREFOX browser");
		}
		else if (browserName.equalsIgnoreCase("IE")) {
			System.out.println("Launching IE browser");
		}
		else if (browserName.equalsIgnoreCase("safari")) {
			System.out.println("Launching safari browser");
		}
		else {
			System.out.println("please pass the right browser name");
		}

		switch (browserName.trim().toLowerCase()) {
		case "chrome" :
			System.out.println("Launching CHROME browser");
			break;
		case "ie" :
			System.out.println("Launching IE browser");
			break;
		case "firefox" :
			System.out.println("Launching FIREFOX browser");
			break;
		case "safari" :
			System.out.println("Launching SAFARI browser");
			break;
		default:
			System.out.println("please pass the right browser name");
			break;
		}

	}

}
