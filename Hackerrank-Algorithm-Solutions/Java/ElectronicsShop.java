package AlgorithmChallenges;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ElectronicsShop {
	
	public static int getMoneySpent(List<Integer> drives, List<Integer> keyboards, int budget) {
		int moneySpent = -1;
		
		for(int i : keyboards) {
			for (int j : drives) {
				int tot = i + j;
				if(tot > moneySpent && tot <= budget)
					moneySpent = tot;
			}
		}
		
		return moneySpent;
	}
	
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("budget, keyboards, drives: ");
		String bkd[] = input.nextLine().split(" ");
		
		int b = Integer.parseInt(bkd[0]);
		int k = Integer.parseInt(bkd[1]);
		int d = Integer.parseInt(bkd[2]);
		
		System.out.print("Keyboard Prices: ");
		List<Integer> keyboards = Stream.of(input.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
		System.out.print("Drive prices: ");
		List<Integer> drives = Stream.of(input.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
		
		int result = getMoneySpent(drives,keyboards,b);
		
		System.out.println(result);
		
	}

}
