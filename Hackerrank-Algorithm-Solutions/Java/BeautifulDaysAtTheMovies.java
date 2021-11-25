package AlgorithmChallenges;

import java.util.Scanner;

public class BeautifulDaysAtTheMovies {
	
	public static int beautifulDays(int start, int end, int divisor) {
		int numberOfBeautifulDays = 0;
		for(int i = start; i <=end; i++) {
			int reversed = Integer.parseInt(new StringBuilder(String.valueOf(i)).reverse().toString());
			int difference = Math.abs(i - reversed);
			
			if((difference/divisor)*divisor == difference)
				numberOfBeautifulDays++;
		}
		
		return numberOfBeautifulDays;
	}
	
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.print("Start, End and Divisor: ");
		String sNums[] =  input.nextLine().split(" ");
		int start = Integer.parseInt(sNums[0]);
		int end = Integer.parseInt(sNums[1]);
		int divisor = Integer.parseInt(sNums[2]);
		
		System.out.println("There are " + beautifulDays(start, end, divisor) + " beautiful days");
	}

}
