package com.app.cloudVandana;

import java.util.Scanner;

public class RomanToInteger {
	// return the integer value for the roman character
	public static int getInt(char ch) {
		
		switch(ch) {
		case 'I' :
		case 'i' :
			return 1;
		case 'V' :
		case 'v' :
			return 5;
		case 'X' :
		case 'x' :
			return 10;
		case 'L' :
		case 'l' :
			return 50;
		case 'C' :
		case 'c' :
			return 100;
		case 'D' :
		case 'd' :
			return 500;
		case 'M' :
		case 'm' :
			return 1000;
		default :
			return 0;
		}
		
	}

	public static void main(String[] args) {

		System.out.println("Enter the roman number");
		Scanner sc = new Scanner(System.in);
		
		String romanNum = sc.nextLine();
		int result = 0;
		int prev = 0;
		for(int i = romanNum.length() - 1; i >=0; i--) {
			int curr = getInt(romanNum.charAt(i));
			
			// check weather the input string is a Roman number or not
			if(curr == 0) {
				System.out.println("Please Enter valid Roman number");
				break;
			}
			
			if(curr < prev) {
				result -= curr;
			}
			else {
				result += curr;
			}
			prev = curr;
		}
		// if the input string is correct then print the result
		if(result > 0)
		System.out.println("Result -> "+result);
	}

}
