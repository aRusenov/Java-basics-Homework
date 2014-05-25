//At the first line at the console you are given a piece of 
//text. Extract all words from it and print them in alphabetical 
//order. Consider each non-letter character as word separator.
//Take the repeating words only once. Ignore the character casing.
//Print the result words in a single line, separated by spaces.

import java.util.Comparator;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;


public class P10_ExtractAllUniqueWords {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String text = input.nextLine().toLowerCase();
		String[] words = text.split("\\W++");
		
		SortedSet<String> uniqueWords = new TreeSet<String>();
		for (String word : words) {
			uniqueWords.add(word);
		}
		for (String uniqueWord : uniqueWords) {
			System.out.print(uniqueWord + " ");
		}
	}

}
