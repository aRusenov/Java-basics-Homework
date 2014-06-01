import java.util.Scanner;


public class _01_StuckNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = Integer.parseInt(input.nextLine());
		String[] numbers = input.nextLine().split(" ");
		
		String firstPiar = "";
		String secondPair = "";
		boolean found = false;
		
		// gets first pair
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers.length; j++) {
				if (j != i) { 
					firstPiar = numbers[i] + numbers[j];
					// get second pair
					for (int p = 0; p < numbers.length; p++) {
						if (p != i && p != j) {
							for (int k = 0; k < numbers.length; k++) {
								if (k != p && k != i && k != j) {
									secondPair = numbers[p] + numbers[k]; 
									if (firstPiar.equals(secondPair)) {
										found = true;
										System.out.printf("%s|%s==%s|%s",
												numbers[i], numbers[j], numbers[p], numbers[k]);
										System.out.println();
									}
								}
							}
						}
					}
				}
			}
		}
		if (!found) {
			System.out.println("No");
		}

	}

}
