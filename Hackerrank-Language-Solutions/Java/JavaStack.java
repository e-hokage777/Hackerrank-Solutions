package Challenges;

import java.util.Scanner;

public class JavaStack {

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			String string = input.next();
			
			while(string.length() != (string  = string.replaceAll("\\(\\)|\\{\\}|\\[\\]", "")).length());
			System.out.println(string.isEmpty());
			
		}
	}

}
