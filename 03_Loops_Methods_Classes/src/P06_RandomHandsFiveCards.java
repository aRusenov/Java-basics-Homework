import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;


public class P06_RandomHandsFiveCards {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		
		List<String> cards = GenerateDeck();
		Random random = new Random();
		for (int i = 0; i < n; i++) {
			List<String> currentHand = new ArrayList<String>();
			for (int j = 0; j < 5; j++) {
				int index = random.nextInt(cards.size() + 1);
				if (!currentHand.contains(cards.get(index))) {
					currentHand.add(cards.get(index));
				}
				else {
					j--;
				}
			}
			System.out.println(Arrays.toString(currentHand.toArray()));
		}

	}

	private static List<String> GenerateDeck() {
		String[] faces = new String[] { 
				"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "K", "Q", "A" };
		String[] suits = new String[] { "♣", "♦", "♥", "♠" };
		
		List<String> deck = new ArrayList<String>(); 
		for (int i = 0; i < faces.length; i++) {
			for (int j = 0; j < suits.length; j++) {
				deck.add(faces[i] + suits[j]);
			}
		}
		return deck;
	}

}
