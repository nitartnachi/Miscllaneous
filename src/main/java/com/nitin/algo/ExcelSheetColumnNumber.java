/*
 * Given a column title as appear in an Excel sheet, return its corresponding column number. For example:
 *  A -> 1
    B -> 2
    C -> 3
    ...
    Z -> 26
    AA -> 27
    AB -> 28 
    ...
    AAA -> 703 
 */

package com.nitin.algo;

public class ExcelSheetColumnNumber {
	
	public static void main(String[] args) {
		String input = "A";
		System.out.println("Column number for the given string is: " + getNumber(input));
	}

	private static int getNumber(String input) {
		if(input == null || input.isEmpty())
			return 0;
		
		int num = 0;
		
		for(int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			num = num + (int) Math.pow(26, i) + (c - 'A');
		}
		return num;
	}

}
