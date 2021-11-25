package AlgorithmChallenges;

import java.math.BigInteger;
import java.util.Scanner;

public class ExtraLongFactorials {
	
	public static void extraLongFactorials(int n) {
		BigInteger m = BigInteger.valueOf(n);
		System.out.println(factorial(m));
	}
	
	public static BigInteger factorial(BigInteger n) {
		if(n.equals(BigInteger.ONE))
			return n;
		else
			return n.multiply(factorial(n.subtract(BigInteger.ONE)));
	}
	
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Integer: ");
		int n = input.nextInt();
		extraLongFactorials(n);
	}

}
