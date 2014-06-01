import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Locale;
import java.util.Scanner;


public class _03_SimpleExpression {

	public static void main(String[] args) {
		Locale.setDefault(Locale.ROOT);
		
		Scanner input = new Scanner(System.in);
		String line = input.nextLine().replace(" ", "");
		char[] chars = line.toCharArray(); 
		
		BigDecimal sum = new BigDecimal("0");
		BigDecimal currentNumber = getNextNumber(0, chars);
		sum = sum.add(currentNumber);
		for (int i = 0; i < chars.length; i++) {
			if (chars[i] == '+' || chars[i] == '-') {
				switch (chars[i]) {
				case '+':
					sum = sum.add(getNextNumber(i + 1, chars));
					break;
				case '-':
					sum = sum.subtract(getNextNumber(i + 1, chars));
				default:
					break;
				}
			}
		}
		System.out.printf("%.7f", sum);
	}
	
	public static BigDecimal getNextNumber(int index, char[] chars) {
		String currentNumber = "";
		while (index < chars.length &&
				chars[index] != '-' && chars[index] != '+') {
			currentNumber += "" + chars[index];
			index++;
		}
		BigDecimal value = new BigDecimal(currentNumber, MathContext.DECIMAL64);
		return value;
	}

}
