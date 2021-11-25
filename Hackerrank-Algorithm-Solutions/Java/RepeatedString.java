package AlgorithmChallenges;

import java.util.Scanner;

public class RepeatedString {
	
	public static long repeatedString(String s, long n) {
		int str_length = s.length();
		
		long remainder = n % str_length;
		long num_of_occur = (n - remainder)/str_length;
		
		long aCount = 0;
		long remainderCount = 0;
		
		
		
		for(int i = 0; i < str_length; i++) {
			if(s.charAt(i) == 'a')
				aCount++;
			
			if(remainder > 0 && i == remainder-1)
				remainderCount = aCount;
		}
		
		return aCount*num_of_occur + remainderCount;
	}
	
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.print("String: ");
		String s = input.nextLine();
		System.out.print("First n Letters: ");
		long n = input.nextLong();
		
		System.out.println(repeatedString(s, n));
	}

}
