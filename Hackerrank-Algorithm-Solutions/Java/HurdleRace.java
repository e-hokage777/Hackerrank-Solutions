package AlgorithmChallenges;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HurdleRace {
	
	public static int hurdleRace(int jumpHeight, List<Integer> heights) {
		int max = Collections.max(heights);
		
		int potionsNeeded = max - jumpHeight;
		
		return potionsNeeded > 0 ? potionsNeeded : 0; 
	}
	
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("Number of Hurdles and Maximum height that can be jumped: ");
		String sNums[] = input.nextLine().split(" ");
		
		int numberOfHurdles = Integer.parseInt(sNums[0]);
		int jumpHeight = Integer.parseInt(sNums[1]);
		
		List<Integer> heights = Stream.of(input.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
		System.out.println(hurdleRace(jumpHeight, heights));
	}

}
