import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;


public class P02_GenerateWords {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		char[] chars = input.nextLine().toCharArray();
		
		List<String> combos = new ArrayList<String>();
		for (int i = 0; i < chars.length; i++) {
			for (int j = 0; j < chars.length; j++) {
				String currentCombo = "";
				currentCombo += chars[i];
				currentCombo += chars[j];
				for (int p = 0; p < chars.length; p++) {
					combos.add(currentCombo + chars[p]);
				}
			}
		}
		
		for (String combo : combos) {
			System.out.print(combo + " ");
		}
	}

}
