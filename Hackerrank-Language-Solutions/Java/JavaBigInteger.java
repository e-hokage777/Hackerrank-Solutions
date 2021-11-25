package Challenges;

import java.math.BigInteger;
import java.util.Scanner;

public class JavaBigInteger {
	
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		
		BigInteger A;
		BigInteger B;
		
		System.out.print("Enter your first big integer: ");
		A = new BigInteger(input.nextLine());
		
		System.out.print("Enter you next big integer: ");
		B = new BigInteger(input.nextLine());
		
		System.out.println(A.add(B));
		System.out.println(A.multiply(B));
		
	}

}
