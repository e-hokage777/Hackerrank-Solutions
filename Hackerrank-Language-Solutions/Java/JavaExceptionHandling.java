package Challenges;

import java.util.Scanner;

class MyCalculator {
	public long power(int n, int p) {
		if (n < 0 || p < 0)
			throw new ArithmeticException("java.lang.Exception: n or p should not be negative.");
		else if (n == 0 && p == 0)
			throw new ArithmeticException("java.lang.Exception: n and p should not be zero.");
		else {
			double result = Math.pow(n, p);
			long res = (long) result;
			return res;
		}
	}
}

public class JavaExceptionHandling {

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		System.out.println("Input n, the number and p the power here");

		while (input.hasNext()) {
			int n = input.nextInt();
			int p = input.nextInt();

			MyCalculator calculator = new MyCalculator();
			try {
				System.out.println(calculator.power(n, p));
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}

	}
}
