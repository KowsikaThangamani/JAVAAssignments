package com.string.manipulation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercise04 {

	public static void main(String[] args) {
		String s = "your transaction id is: 12345 and reference id is 34567";

		Pattern pattern = Pattern.compile("\\d+");
		Matcher matcher = pattern.matcher(s);

//		while (matcher.find()) {
//			System.out.println(matcher.group());
//		}

		String transId = null;
		String refId = null;

		if (matcher.find()) {
			transId = matcher.group();
		}

		if (matcher.find()) {
			refId = matcher.group();
		}

		System.out.println("Transaction id is : " + transId);
		System.out.println("Reference Id is : " + refId);

	}

}
