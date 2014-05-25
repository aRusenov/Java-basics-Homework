//We are given a sequence of N playing cards from a standard deck.
//The input consists of several cards (face + suit), separated by
//a space. Write a program to calculate and print at the console the
//frequency of each card face in format "card_face -> frequency".

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;


public class P12_CardsFrequencies {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String text = input.nextLine();
		String[] cards = text.split(" ");
		
		// we use LinkedHashMap to avoid internal sorting of keys by name.
		Map<String, Integer> cardMap = new LinkedHashMap<>();
		for (int i = 0; i < cards.length; i++) {
			String card = getCard(cards, i);
			if (!cardMap.containsKey(card)) {
				cardMap.put(card, 1);
			}
			else {
				int count = cardMap.get(card); 
				cardMap.put(card, count + 1);
			}
		}
		for (Map.Entry<String, Integer> set : cardMap.entrySet()) {
			double percent = (double)set.getValue() / cards.length * 100;
			String pc = String.format("%.2f", percent);
			System.out.println(set.getKey() + " -> " + pc + "%");
		}
	}

	private static String getCard(String[] cards, int index) {
		if (cards[index].length() == 2) {
			return Character.toString(cards[index].charAt(0));
		}
		else {
			return Character.toString(cards[index].charAt(0)) + 
					Character.toString(cards[index].charAt(1));
		}
	}

}
