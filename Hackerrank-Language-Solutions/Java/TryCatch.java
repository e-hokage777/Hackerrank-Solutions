package Challenges;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {
	
	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);

		
		int quotient;
		
		try {
			int x = input.nextInt();
			 int y = input.nextInt();
			
			quotient = x/y;
			System.out.println(quotient);
		}
		catch(InputMismatchException e1) {
			System.out.println("java.util.InputMismatchException");
		}
		
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
