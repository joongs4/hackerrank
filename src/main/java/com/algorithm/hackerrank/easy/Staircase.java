package com.algorithm.hackerrank.easy;

public class Staircase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		staircase(4);
	}

	// Complete the staircase function below.
	static void staircase(int n) {

		for (int i = 1; i <= n; i++) {
			StringBuilder sb = new StringBuilder();
			for (int j = n; j > 0; j--) {
				if (j > i) {
					sb.append(" ");
				} else {
					sb.append("#");
				}
			}

			System.out.println(sb.toString());
		}
	}

}
