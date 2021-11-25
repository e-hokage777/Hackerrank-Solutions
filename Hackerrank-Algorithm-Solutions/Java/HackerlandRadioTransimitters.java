package AlgorithmChallenges;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HackerlandRadioTransimitters {
	
	public static int hackerlandRadioTransmitters(List<Integer> x, int k) {
		Collections.sort(x);
		int n = x.size();
		int i = 0;
		int j = 1;
		int lights = 0;
		
		while(i < n) {
			int foptimal = x.get(i) + k;
			
			while(i < n && x.get(i) <= foptimal) i++;
			lights++;
			
			int soptimal = x.get(--i) + k;
			
			while(i < n && x.get(i) <= soptimal) i++;
			
			
			
		}
		
		return lights;
		//1 3 5 7 9
		//1 2 3 4 5
	}
	
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Number of houses and Transmitter ranges");
		String nandk[] = input.nextLine().split(" ");
		int n = Integer.parseInt(nandk[0]);
		int k = Integer.parseInt(nandk[1]);
		
		List<Integer> houses = Stream.of(input.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
		
		System.out.println("Minimun number of transmitters needed :" + hackerlandRadioTransmitters(houses,k));
	}

}
