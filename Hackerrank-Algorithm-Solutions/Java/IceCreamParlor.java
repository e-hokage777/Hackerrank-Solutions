package AlgorithmChallenges;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IceCreamParlor {
	
	public static List<Integer> iceCreamParlor(int m, List<Integer> arr){
		int n = arr.size();
		List<Integer> pair = new ArrayList<>();
		
		for(int i = 0; i < n; i++) {
			int prev = arr.get(i);
			int diff = m - prev;
			arr.set(i,Integer.MAX_VALUE);
			int res = arr.indexOf(diff);
			if(res != -1) {
				pair.add(i+1);
				pair.add(res+1);
				return pair;
			}
		}
		
		return pair;
	}
	
	
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("Cost: ");
		int m = Integer.parseInt(input.nextLine());
		
		System.out.print("Prices: ");;
		List<Integer> arr = Stream.of(input.nextLine().replaceAll("(\\s)\\1+", " ").split(" ")).map(Integer::parseInt).collect(Collectors.toList());
		
		System.out.println(iceCreamParlor(m,arr));
	}

}
