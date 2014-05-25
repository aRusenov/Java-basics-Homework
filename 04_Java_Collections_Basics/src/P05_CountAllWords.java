//Write a program to count the number of
//words in given sentence. Use any non-letter character as word separator.

import java.util.Scanner;


public class P05_CountAllWords {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String text = input.nextLine();
		
		// we split by a regular expression, which denotes all symbols
		// that are not word characters, i.e. we split by all symbols that are not words
		String[] words = text.split("\\W+");
		System.out.println(words.length);
	}

}
