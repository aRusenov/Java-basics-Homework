//Write a program that reads two lists of letters l1 and l2
//and combines them: appends all letters c from l2 to the end 
//of l1, but only when c does not appear in l1. Print the obtained
//combined list. All lists are given as sequence of letters
//separated by a single space, each at a separate line. Use
//ArrayList<Character> of chars to keep the input and output lists. 

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class P09_CombineListsOfLetters {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		List<Character> listOne = readList(input.nextLine());
		List<Character> listTwo = readList(input.nextLine());
		
		unifyLists(listOne, listTwo);
		
		printList(listOne);
	}

	private static void printList(List<Character> listOne) {
		for (int i = 0; i < listOne.size(); i++) {
			System.out.print(listOne.get(i) + " ");
		}
		
	}

	private static void unifyLists(List<Character> listOne,
			List<Character> listTwo) {
		// we check if listOne contains each element from list two.
		// If it doesn't, we add it. If it does, BUT it was added during the unify process,
		// we still add it.
		int initialSize = listOne.size();
		for (int i = 0; i < listTwo.size(); i++) {
			if (!listOne.contains(listTwo.get(i)) ||
					listOne.indexOf(listTwo.get(i)) >= initialSize) {
				listOne.add(listTwo.get(i));
			}
		}
	}

	private static List<Character> readList(String input) {
		
		String[] chars = input.split(" ");
		List<Character> charList = new ArrayList<Character>();
		for (int i = 0; i < chars.length; i++) {
			charList.add(chars[i].charAt(0));
		}
		return charList;
	}

}
