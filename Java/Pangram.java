package com.app.cloudVandana;

import java.util.Arrays;
import java.util.Scanner;

public class Pangram {

	public static void main(String[] args) {

		System.out.println("Enter the sentence");
		Scanner sc = new Scanner(System.in);
		
		String sentence = sc.nextLine();
		
		boolean isPanagram = checkPanagram(sentence);
		if(isPanagram) {
			System.out.println("Sentence was a Panagram");
		}
		else {
			System.out.println("Sentence was not a Panagram");
		}
	}
	
	public static boolean checkPanagram(String sentence) {
		
		// create a boolean array
		Boolean[] boolArr = new Boolean[26];
		Arrays.fill(boolArr, false);
		
		// iterate through the sentence and mark true in boolArr for the character
		for(int i=0; i<sentence.length(); i++) {
			char ch = sentence.charAt(i);
			if('a' <= ch && ch <= 'z') {
				boolArr[ch - 'a'] = true;
			}
		}
		
		// if we find any false value in boolArr -> sentence was not Panagram
		for(Boolean b : boolArr) {
			if(!b) {
				return false;
			}
		}
		return true;
	}

}
