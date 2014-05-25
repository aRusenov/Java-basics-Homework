//Write a program to find all increasing sequences inside
//an array of integers. The integers are given in a single
//line, separated by a space. Print the sequences in the 
//order of their appearance in the input array, each at a 
//single line. Separate the sequence elements by a space.
//Find also the longest increasing sequence and print it
//at the last line. If several sequences have the same longest 
//length, print the leftmost of them. 

import java.util.Scanner;


public class P04_LongestIncreasingSequence {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String sequence  = input.nextLine();
		
		String[] numbersAsStrings = sequence.split(" ");
		Integer[] numbers = new Integer[numbersAsStrings.length];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = Integer.parseInt(numbersAsStrings[i]); 
		}
		
		int longestStart = 0;
		int longestEnd = 0;
		int count;
		int currentNumber = 0;
		for (int i = 0; i < numbers.length; i++) {
			count = 0;
			for (int j = i + 1; j < numbers.length; j++) {
				if (numbers[j - 1] < numbers[j]) {
					count++;
				}
				else break;
			}
			if (count > longestEnd - longestStart) {
				longestStart = i;
				longestEnd = i + count;
			}
			printSequence(i, i + count, numbers);
			i += count;
		}
		System.out.print("Longest: ");
		printSequence(longestStart, longestEnd, numbers);
	}

	private static void printSequence(int start, int end, Integer[] numbers) {
		for (int k = start; k <= end; k++) {
			System.out.print(numbers[k] + " ");
		}
		System.out.println();
	}

}
