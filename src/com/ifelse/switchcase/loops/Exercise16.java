package com.ifelse.switchcase.loops;

public class Exercise16 {

	public static void main(String[] args) {

		String evenNumbers = "Even Numbers : ";
		String oddNumbers = "ODD Numbers : ";
		for (int i = 1; i <= 100; i++) {
			if (i%2 == 0) {
				evenNumbers = evenNumbers +" , "+ i;
			}
			else {
				oddNumbers = oddNumbers + " , " +i;
			}
		}
		System.out.println(evenNumbers);
		System.out.println(oddNumbers);
	}

}
