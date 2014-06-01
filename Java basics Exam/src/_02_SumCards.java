import java.util.Scanner;

import sun.tools.jar.resources.jar;


public class _02_SumCards {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] cards = input.nextLine().split(" ");
		
		int sum = 0;
		int value;
		int count = 0;
		for (int i = 0; i < cards.length; i++) {
			value = getCardValue(cards[i]);
			count = 0;
			for (int j = i + 1; j < cards.length; j++) {
				if (getCardValue(cards[j]) == value) {
					count++;
				}
				else {
					break;
				}
			}
			i += count;
			if (count == 0) {
				sum += value;
			}
			else {
				sum += ((count + 1) * value) * 2;
			}
		}
		System.out.println(sum);
	}

	public static int getCardValue(String string) {
		String card = "";
		if (string.length() > 2) {
			card = "" + string.charAt(0) + string.charAt(1);
		}
		else {
			card = "" + string.charAt(0);
		}
		
		switch (card) {
			case "2":
			case "3":
			case "4":
			case "5":
			case "6":
			case "7":
			case "8":
			case "9":
			case "10":
				return Integer.parseInt(card);
			case "J":
				return 12;
			case "Q":
				return 13;
			case "K":
				return 14;
			case "A":
				return 15;
			default:
				return 0;
		}
	}
	
}
