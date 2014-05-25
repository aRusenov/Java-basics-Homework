//Write a program to enter a number n and n integer 
//numbers and sort and print them. Keep the numbers 
//in array of integers: int[]. 

import java.util.Arrays;
import java.util.Scanner;


public class P01_SortArrayOfNumbers {

	public static void main(String[] args) {
		int n = 10;
		int[] numbers = new int[] { 10, 2, 5, 11, 4, 3, 7, 9, 13, 18 };
		
		// If you feel like entering the input
//		Scanner input = new Scanner(System.in);
//		n = input.nextInt();
//		numbers = new int[n];
//		for (int i = 0; i < n; i++) {
//			numbers[i] = input.nextInt(); 
//		}
		Arrays.sort(numbers);
		for (int num : numbers) {
			System.out.println(num);
		}
		
	}

}
