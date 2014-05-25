//Write a program to find how many times given string
//appears in given text as substring. The text is given
//at the first input line. The search string is given at
//the second input line. The output is an integer number. 
//Please ignore the character casing. 

import java.util.Scanner;

public class P07_CountSubstringOccurences {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String text = input.nextLine().toLowerCase();
		String word = input.nextLine().toLowerCase();
		
		int count = 0;
		for (int i = 0; i <= text.length() - word.length(); i++) {
			String currentWord = text.substring(i, i + word.length());
			if (currentWord.equals(word)) {
				count++;
			}
		}
		System.out.println(count);

	}

}
