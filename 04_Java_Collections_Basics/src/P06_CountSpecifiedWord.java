//Write a program to find how many times a word appears in
//given text. The text is given at the first input line. 
//The target word is given at the second input line. The
//output is an integer number. Please ignore the character
//casing. Consider that any non-letter character is a word separator. 

import java.util.Scanner;


public class P06_CountSpecifiedWord {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String text = input.nextLine().toLowerCase();
		String word = input.nextLine().toLowerCase();
		
		// again, we split by non-word chars and count specified word occurrences
		String[] words = text.split("\\W+");
		int count = 0;
		for (String string : words) {
			if (string.equals(word)) {
				count++;
			}
		}
		System.out.println(count);
	}

}
