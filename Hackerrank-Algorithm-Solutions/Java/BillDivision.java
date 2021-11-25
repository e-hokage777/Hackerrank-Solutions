package AlgorithmChallenges;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BillDivision {
	
	public static void bonAppetit(List<Integer> bill, int k, int b) {
		int total = 0;
		for(int i = 0; i < bill.size(); i++) {
			if(i == k)
				continue;
			else
				total+=bill.get(i);
		}
		int charge = total/2;
		
		System.out.println(charge == b? "Bon Appetit":b-charge);
	}
	
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("Index of item not eaten and charge: ");
		String kandb[] = input.nextLine().replaceAll("(\\s)\\1+", " ").split(" ");
		int k = Integer.parseInt(kandb[0]);
		int b = Integer.parseInt(kandb[1]);
		
		System.out.print("Prices of items ordered: ");;
		List<Integer> bill = Stream.of(input.nextLine().replaceAll("(\\s)\\1+", " ").split(" ")).map(Integer::parseInt).collect(Collectors.toList());
		
		bonAppetit(bill, k ,b);
	}

}
