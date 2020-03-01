package com.algorithm.hackerrank.easy;

public class BirthdayCakeCandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		birthdayCakeCandles(new int[] { 3, 2, 1, 3 });
	}

	// Complete the birthdayCakeCandles function below.
	static int birthdayCakeCandles(int[] ar) {

		int maxNum = 0;
		int count = 0;

		for (int i = 0; i < ar.length; i++) {

			if (ar[i] > maxNum) {
				maxNum = ar[i];
				count = 1;
			} else if (ar[i] == maxNum) {
				count++;
			}

		}

		return count;
	}

}
