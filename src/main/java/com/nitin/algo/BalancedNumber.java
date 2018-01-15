/*
 * Given an odd-digit-number N, you need to find whether the given number is a balanced-number or not. 
 * An odd digit number is called a balanced number if the sum of all digits to the left of the middle digit 
 * and the sum of all digits to the right of the middle digit is equal.
 * 
 * Explanation:
 * 121.
 * The number of digits of 121 is 3, i.e. odd digits. The middle digit is 2. LHS sum is 1, and RHS sum is 1. Since the sums are equal, we output 1.
 * 
 * 1234006.
 * The number of digits of 1234006. is 7, i.e. odd digits. The middle digit is 4. LHS sum is 1+2+3=6, and RHS sum is 0+0+6=6. Since the sums are equal, we output 1.
 */

package com.nitin.algo;

public class BalancedNumber {
	
	public static void main(String[] args) {
		System.out.println("121 is balanced: " + isBalanced("121"));
		System.out.println("1234006 is balanced: " + isBalanced("1234006"));
		System.out.println("1234007 is balanced: " + isBalanced("1234007"));
	}

	private static boolean isBalanced(String input) {
		if(input.length() % 2 == 0)
			return false;
		
		int mid = input.length() / 2;
		int leftSum = 0, rightSum = 0;
		for (int i = 0; i < mid; i++)
			leftSum += input.charAt(i) - '0';
		for (int i = mid + 1; i < input.length(); i++)
			rightSum += input.charAt(i) - '0';
		return (leftSum == rightSum) ? true : false;
	}

}
