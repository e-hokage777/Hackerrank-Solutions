package AlgorithmChallenges;

import java.util.Scanner;

public class StrangeCounter {
	public static long strangeCounter(long t) {
		
		long start = 3;
		long diff = 3;
		
		while(t > start) {
			diff *= 2;
			
			start += diff; 
		}
		
		return (start - t + 1);
	}
	
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter time: ");
		long t = input.nextLong();
		
		System.out.println(strangeCounter(t));
	}
}
