package com.algorithm.hackerrank.easy;

import java.util.Stack;

public class Test {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
//		System.out.println(Test.isValid("[{()}]"));
//		System.out.println(Test.isValid("(]"));
//		System.out.println(Test.isValid("([)]"));
		System.out.println(Test.isValid("()[]{"));
	}

	public static boolean isValid(String brackets) {

		if (brackets == null || brackets.isEmpty()) {
			return true;
		}

		boolean isValid = false;

		Stack<Character> stack = new Stack<>();

		for (char currentChar : brackets.toCharArray()) {

			if (currentChar == '(' || currentChar == '{' || currentChar == '[') {
				stack.add(currentChar);
			} else {

				if (stack.isEmpty()) {
					return false;
				}
				char poppedChar = stack.pop();

				if (poppedChar == '(') {
					if (currentChar != ')') {
						isValid = false;
						break;
					}
				} else if (poppedChar == '{') {
					if (currentChar != '}') {
						isValid = false;
						break;
					}
				} else if (poppedChar == '[') {
					if (currentChar != ']') {
						isValid = false;
						break;
					}
				}
			}
			isValid = true;
		}
		
		if(!stack.isEmpty()) {
			isValid = false;
		}

		return isValid;
	}

}
