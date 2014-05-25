//Write a program to extract all email addresses from given text.
//The text comes at the first input line. Print the emails in the
//output, each at a separate line. Emails are considered
//to be in format <user>@<host>

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;;


public class P08_ExtractEmails {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String text = input.nextLine();
		
		// we use the Regex class. We we pass a pattern to the Match class,
		// which filters the strings that meet the conditions set by the pattern
		String pattern = 
				"[\\w-+]+(?:\\.[\\w-+]+)*@(?:[\\w-]+\\.)+[a-zA-Z]{2,7}";
		
		Pattern p = Pattern.compile(pattern);
		Matcher matcher = p.matcher(text);
		while (matcher.find()) {
			System.out.println(matcher.group());
		}
	}

}
