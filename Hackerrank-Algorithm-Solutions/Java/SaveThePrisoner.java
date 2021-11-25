package AlgorithmChallenges;

import java.util.Scanner;

public class SaveThePrisoner {
	
	public static int saveThePrisoner(int prisoners, int candies, int start) {
		int result = ((candies%prisoners)+start-1)%prisoners;
		
		return result != 0? result : prisoners;
	}
	
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.print("Number of test cases: ");
		int testCases = Integer.parseInt(input.nextLine());
		
		for(int i = 0; i < testCases; i++) {
			System.out.print("Number of prisoners, number of candies and starting prisoner position: ");
			String sNums[] = input.nextLine().split(" ");
			int prisoners = Integer.parseInt(sNums[0]);
			int candies = Integer.parseInt(sNums[1]);
			int start = Integer.parseInt(sNums[2]);
			
			System.out.println(saveThePrisoner(prisoners, candies, start));
		}
	}

}
