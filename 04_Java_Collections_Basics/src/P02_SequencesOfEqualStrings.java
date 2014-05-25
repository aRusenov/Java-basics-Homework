//Write a program that enters an array of strings and finds 
//in it all sequences of equal elements.
//The input strings are given as a single 
//line, separated by a space. 


import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P02_SequencesOfEqualStrings {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String text = input.nextLine();
		
		String[] words = text.split(" ");
		Map<String, Integer> map = getWordSequences(words);
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			for (int i = 0; i < entry.getValue(); i++) {
				System.out.print(entry.getKey() + " ");
			}
			System.out.println();
		}
	}

	public static Map<String, Integer> getWordSequences(String[] words) {
		Map<String, Integer> map = new LinkedHashMap<String, Integer>(); 
		
		String currentWord;
		int count;
		for (int i = 0; i < words.length; i++) {
			currentWord = words[i];
			count = 1;
			for (int j = i + 1; j < words.length; j++) {
				if (words[j].equals(currentWord)) {
					count++;
				}
				else {
					break;
				}
			}
			i += count - 1;
			map.put(currentWord, count); 
		}
		return map;
	}

}
