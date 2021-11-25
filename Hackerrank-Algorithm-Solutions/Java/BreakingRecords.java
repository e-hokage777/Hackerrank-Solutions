package AlgorithmChallenges;
import java.util.*;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class BreakingRecords {
	public static List<Integer> breakingRecords(List<Integer> scores){
		int leastScore = scores.get(0);
		int highestScore = scores.get(0);
		int leastBreakCount = 0;
		int hightestBreakCount = 0;
		List<Integer> result = new ArrayList<>();

		for(int i = 1; i < scores.size(); i++){
			int score = scores.get(i);
			if(score > highestScore){
				hightestBreakCount++;
				highestScore = score;
			}
			else if(score < leastScore){
				leastBreakCount++;
				leastScore = score;
			}
		}

		result.add(hightestBreakCount);
		result.add(leastBreakCount);

		return result;
		
	}
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);

		System.out.print("Scores: ");

		List<Integer> scores = Stream.of(input.nextLine().replaceAll("\\s+$", "").split(" ")).map(Integer::parseInt).collect(Collectors.toList());

		System.out.println(scores);

		List<Integer> result = breakingRecords(scores);

		result.forEach(System.out::println);
	}
}