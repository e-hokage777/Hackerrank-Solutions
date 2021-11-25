package AlgorithmChallenges;

import java.util.Scanner;

public class UtopianTree {

	public static int utopianTree(int n) {
		int height = 0;
		
		for (int i = 0; i < n + 1; i++) {
			if(i%2 == 0)
				height+=1;
			else
				height*=2;
		}
		
		return height;

	}
	
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.print("Number of test cases: ");
		int testCases = input.nextInt();
		
		for(int i = 0; i < testCases; i++) {
			System.out.print("Number of growth cycles: ");
			System.out.println(utopianTree(input.nextInt()));
		}
	}
}
