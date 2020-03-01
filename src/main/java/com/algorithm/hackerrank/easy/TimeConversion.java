package com.algorithm.hackerrank.easy;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class TimeConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String retVal = timeConversion("07:05:45PM");
		System.out.println(retVal);
	}

	/*
	 * Complete the timeConversion function below.
	 */
	static String timeConversion(String s) {
		/*
		 * Write your code here.
		 */

		DateFormat df = new SimpleDateFormat("hh:mm:ssa", Locale.US);
		DateFormat outputformat = new SimpleDateFormat("HH:mm:ss");
		Date date = null;
		String output = null;
		try {
			date = df.parse(s);
			output = outputformat.format(date);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return output;
	}

}
