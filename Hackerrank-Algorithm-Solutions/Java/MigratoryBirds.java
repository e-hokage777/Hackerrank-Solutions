package AlgorithmChallenges;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MigratoryBirds {
	public static int migratoryBirds(List<Integer> arr) {
		Map<Integer, Integer> birds = new HashMap<>();
		
		for(int i = 0; i <arr.size(); i++) {
			int birdType = arr.get(i);
			if(birds.containsKey(birdType))
				birds.put(birdType, birds.get(birdType) + 1);
			else
				birds.put(birdType, 1);
		}
		
		int highest = Collections.max(birds.entrySet(), Map.Entry.comparingByValue()).getKey();
		
		return highest;
		
	}
	
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.print("Bird IDs: ");
		List<Integer> birds = Stream.of(input.nextLine().replaceAll("(\\s)\\1+", " ").split(" ")).map(Integer::parseInt).collect(Collectors.toList());
		long start = System.currentTimeMillis();
		System.out.println(migratoryBirds(birds));
		long end = System.currentTimeMillis();
		
		System.out.println("Time taken: " + (end - start));
	}

}
