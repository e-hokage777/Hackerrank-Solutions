package Challenges;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaRegex2DuplicateWords {
	
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		String regex = "(\\b\\w+)(?:\\W+\\1\\b)+";
		//(\\s+\\w+\\b)(?:\\1)+
		//Sam went to to to his
		
		Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
		
		
		System.out.print("Number of lines: ");
		int counter = Integer.parseInt(input.nextLine());
		
		for(int i = 0 ; i < counter; i++) {
			System.out.print("Sentence: ");
			String line = input.nextLine();
			Matcher matcher = pattern.matcher(line);
			
			while(matcher.find()) {
				System.out.println(matcher.group());
				System.out.println(matcher.group(1));
				line = line.replaceAll(matcher.group(), matcher.group(1));
			}
			
			System.out.println(line);
		}
		
	}

}
