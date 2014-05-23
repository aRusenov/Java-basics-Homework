import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class P01_SymmetricNumbersInRange {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int start = input.nextInt();
		int end = input.nextInt();
		
		List<Integer> symmetricNumbers = new ArrayList<Integer>();
		
		for (int i = start; i <= end; i++) {
			if (isSymmetric(i)) {
				symmetricNumbers.add(i);
			}
		}
		
		for (Integer symNum : symmetricNumbers) {
			System.out.print(symNum + " ");
		}
	}

	private static boolean isSymmetric(int i) {
		char[] array = Integer.toString(i).toCharArray();
		for (int f = 0, s = array.length - 1; f < array.length / 2; f++, s--) {
			if (array[f] != array[s]) {
				return false;
			}
		}
		return true;
	}

}
