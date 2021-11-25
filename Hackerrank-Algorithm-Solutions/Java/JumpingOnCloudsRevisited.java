package AlgorithmChallenges;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JumpingOnCloudsRevisited {

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("Number of clouds and jump distance: ");
		String sNums[] = input.nextLine().split(" ");

		int numClouds = Integer.parseInt(sNums[0]);
		int jumpDist = Integer.parseInt(sNums[1]);
		int currentPos = jumpDist%numClouds;
		int energy = 99;

		List<Integer> clouds = Stream.of(input.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
		
		while(currentPos != 0) {
			if(clouds.get(currentPos) == 1)
				energy-=2;
			energy--;
			
			currentPos = (currentPos+=jumpDist)%numClouds;
		}
		
		if(clouds.get(currentPos) == 1)
			energy-=2;
		
		System.out.println(energy);
		
	}

}
