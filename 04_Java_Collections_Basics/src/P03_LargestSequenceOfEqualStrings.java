//Write a program that enters an array of strings and finds
//in it the largest sequence of equal elements. If several
//sequences have the same longest length, print the leftmost
//of them. The input strings are given as a single line,
//separated by a space. 

import java.util.Map;
import java.util.Scanner;


public class P03_LargestSequenceOfEqualStrings {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String text = input.nextLine();
		
		String[] words = text.split(" ");
		// we re-use the method from the previous problem to get all sequences
		Map<String, Integer> map = 
				P02_SequencesOfEqualStrings.getWordSequences(words);
		
		// search through all entries for the one that has the longest value
		Map.Entry<String, Integer> longestSequence = map.entrySet().iterator().next();
		for (Map.Entry<String, Integer> currentEntry : map.entrySet()) {
			if (currentEntry.getValue() > longestSequence.getValue()) {
				longestSequence = currentEntry;
			}
		}
		
		// print the entry key n times
		for (int i = 0; i < longestSequence.getValue(); i++) {
			System.out.print(longestSequence.getKey() + " ");
		}
		System.out.println();
	}

}
