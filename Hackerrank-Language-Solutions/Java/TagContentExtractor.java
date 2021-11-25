package Challenges;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TagContentExtractor {
	
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		String regex = "<(.+)>([^<>]+)</\\1>";
		Pattern pattern = Pattern.compile(regex);
		
		System.out.print("Number of Lines: ");
		int n = Integer.parseInt(input.nextLine());
		
		while(n-- > 0) {
			boolean run = false;
			System.out.print("Enter you HTML or XML: ");
			String s = input.nextLine();
			Matcher matcher = pattern.matcher(s);
			
			while(matcher.find()) {
				System.out.println(matcher.group(2));
				run = true;
			}
			
			if(run == false)
				System.out.println("None");
			
		}
	}

}
