import java.util.Locale;
import java.util.Scanner;

public class P05_AngleUnitConverter {

	public static void main(String[] args) {
		Locale.setDefault(Locale.ROOT);
		
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		input.nextLine();
		for (int i = 0; i < n; i++) {
			String inputString = input.nextLine();
			String[] data = inputString.split(" ");
			if (data[1].equals("deg")) {
				double radians = getRadians(Double.parseDouble(data[0]));
				System.out.printf("%.6f rad", radians);
			}
			else if (data[1].equals("rad")) {
				double degrees = getDegrees(Double.parseDouble(data[0]));
				System.out.printf("%.6f deg", degrees);
			}
			System.out.println();
		}
	}

	private static double getDegrees(double radians) {
		return radians * (180 / Math.PI);
	}

	private static double getRadians(double degrees) {
		return degrees * (Math.PI / 180);
	}

}
