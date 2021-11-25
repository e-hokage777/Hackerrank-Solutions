package AlgorithmChallenges;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FormingAMagicSquare {
	public static int formingMagicSquare(List<List<Integer>> s) {
		List<Integer> posCosts = new ArrayList<>();
		int possibilities[][][] = {
				{{8,1,6}, {3,5,7}, {4,9,2}},
				{{6,1,8}, {7,5,3}, {2,9,4}},
				{{4,9,2}, {3,5,7}, {8,1,6}},
				{{2,9,4}, {7,5,3}, {6,1,8}},
				{{8,3,4}, {1,5,9}, {6,7,2}},
				{{4,3,8}, {9,5,1}, {2,7,6}},
				{{6,7,2}, {1,5,9}, {8,3,4}},
				{{2,7,6}, {9,5,1}, {4,3,8}}
		};
		
		for(int i[][] : possibilities) {
			int tempCost = 0;
			for(int x =0; x < 3; x++) {
				for(int y = 0; y < 3; y++) {
					tempCost+= Math.abs(s.get(x).get(y)-i[x][y]);
				}
			}
			posCosts.add(tempCost);
			
		}
		
		return Collections.min(posCosts);

	}

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		List<List<Integer>> s = new ArrayList<>();
		System.out.println("Enter matrix elements");
		for (int i = 0; i < 3; i++) {
			List<Integer> temp = Stream.of(input.nextLine().replaceAll("(\\s)\\1+", " ").split(" "))
					.map(Integer::parseInt).collect(Collectors.toList());
			s.add(temp);
		}

		System.out.println("Minimum cost of making magic: " + formingMagicSquare(s));
	}
}
