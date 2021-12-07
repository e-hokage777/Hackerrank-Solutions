package AlgorithmChallenges;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManasaAndStones {
	
	public static List<Integer> stones(int n, int a, int b){
		List<Integer> stones = new ArrayList<Integer>();
		
		int start = (n-1) * Math.min(a, b);
		int diff = Math.abs(b-a);
		
		
		for(int i = 0; i < n; i++) {
			stones.add(i*diff + start);
			
			//For instances where a == b
			if(diff == 0)
				return stones;
		}
		
		return stones;
	}
	
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Number of test cases: ");
		
		int num_of_tests = Integer.parseInt(input.nextLine());
		
		while(num_of_tests-- > 0) {
			System.out.print("Number of stones: ");
			int n = Integer.parseInt(input.nextLine());
			
			System.out.print("Difference a: ");
			int a = Integer.parseInt(input.nextLine());
			
			System.out.print("Difference b: ");
			int b = Integer.parseInt(input.nextLine());
			
			System.out.println(stones(n,a,b));
		}
		
		input.close();
	}

}
