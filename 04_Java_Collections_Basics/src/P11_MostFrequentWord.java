//Write a program to find the most frequent word in
//a text and print it, as well as how many times it
//appears in format "word -> count". Consider any non-letter
//character as a word separator. Ignore the character casing.
//If several words have the same maximal frequency, print all
//of them in alphabetical order. 

import java.util.Map;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;


public class P11_MostFrequentWord {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String text = input.nextLine().toLowerCase();
		String[] words = text.split("\\W++");
		
		int maxCount = 0;
		TreeMap<String, Integer> wordMap = new TreeMap<>();
		for (int i = 0; i < words.length; i++) {
			String key = words[i];
			if (!wordMap.containsKey(key)) {
				wordMap.put(key, 1);
			}
			else {
				int wordCount = wordMap.get(key);
				wordMap.put(key, wordCount + 1);
				if (wordCount + 1 > maxCount) {
					maxCount = wordCount + 1;
				}
			}
		}
		
		for (Map.Entry<String, Integer> set : wordMap.entrySet()) {
			if (set.getValue() == maxCount) {
				System.out.println(set.getKey() + " -> " + set.getValue());
			}
		}
	}

}
