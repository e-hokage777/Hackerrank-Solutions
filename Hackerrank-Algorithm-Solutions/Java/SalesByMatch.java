package AlgorithmChallenges;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SalesByMatch {
	
	public static int sockMerchant(int n, List<Integer> ar) {
		Map<Integer, Integer> pairs = new HashMap<>();
		int pairCounter = 0;
		for(int i : ar) {
			if(pairs.containsKey(i)) 
				pairs.put(i, pairs.get(i) + 1);
			else
				pairs.put(i, 1);
		}
		
		for(int i : pairs.values())
			if(i%2 != 0) {
				i--;
				pairCounter+=i;
			}
			else
				pairCounter+=i;
		
		pairCounter*=0.5;
		
		return pairCounter;
		
	}
	
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Number of socks: ");
		int n = Integer.parseInt(input.nextLine());
		
		System.out.print("Socks(enter integer to represent a sock): ");
		List<Integer> socks = Stream.of(input.nextLine().replaceAll("(\\s)\\1+", " ").split(" ")).map(Integer::parseInt).collect(Collectors.toList());
		
		System.out.println(sockMerchant(n, socks));
	}

}
