/*
 * Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.
 * For example:
 * Given num = 38, the process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.
 */

package com.nitin.algo;

public class AddDigits {
	
	public static void main(String[] args) {
		int n = 383934567;
		System.out.println("Result: " + addDigits(n));
	}

	private static int addDigits(int n) {
		if(n < 10)
			return n;
		int result = 0;
		
		while(n > 0) {
			result = result + n % 10;
			n = n / 10;
		}
		
		if(result < 10)
			return result;
		else
			return addDigits(result);
	}
}
