package com.algorithm.hackerrank.easy;

import java.util.Arrays;

public class MiniMaxSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		miniMaxSum(new int[] { 1, 3, 5, 7, 9 });
		
		miniMaxSum(new int[] { 256741038, 623958417, 467905213, 714532089, 938071625 });
		
		
	}

	// Complete the miniMaxSum function below.
	static void miniMaxSum(int[] arr) {

		Arrays.sort(arr);

		long min = 0l;
		long max = 0l;

		for (int i = 0; i < 5; i++) {

			if (i == 0) {
				min = min + arr[i];
			} else if (i == 4) {
				max = max + arr[i];
			} else {
				min = min + arr[i];
				max = max + arr[i];
			}
		}

		System.out.println(min + " " + max);

	}

}
