package Challenges;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class UsernameValidator{
	public static final String regularExpression = "^[a-zA-Z][a-zA-Z0-9_]{7,29}";
}

public class ValidUsername {

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Number of names to test: ");
		int number = input.nextInt();
		input.nextLine();
		
		while(number-- !=0) {
			String tocompare = input.nextLine();
			if(tocompare.matches(UsernameValidator.regularExpression)) 
				System.out.println("Valid");
			else 
				System.out.println("Invalid");
		}
	}

}
