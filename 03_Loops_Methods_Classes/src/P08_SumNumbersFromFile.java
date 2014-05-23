import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 * Write a program to read a text file "Input.txt" holding a
 * sequence of integer numbers, each at a separate line.
 * Print the sum of the numbers at the console. Ensure
 * you close correctly the file in case of exception 
 * or in case of normal execution. In case of exception 
 * (e.g. the file is missing), print "Error" as a result.
 */
public class P08_SumNumbersFromFile {

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(
					new FileReader("NumbersInput/input.txt"));
			int sum = 0;
			String line = br.readLine();
			while (line != null) {
				sum += Integer.parseInt(line);
				line = br.readLine();
			}
			System.out.println(sum);
		} catch (FileNotFoundException e) {
			System.out.println("Error");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
