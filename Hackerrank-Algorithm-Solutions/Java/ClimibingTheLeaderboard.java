package AlgorithmChallenges;

import java.util.ArrayList;
import java.util.List;
import java.util.NavigableMap;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ClimibingTheLeaderboard {
	
	public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player){

		List<Integer> ranks = new ArrayList<>();
		NavigableMap<Integer, Integer> leaderboardScores = new TreeMap<Integer, Integer>().descendingMap();
		int counter = 1;
		for(int score : ranked) {
			if(leaderboardScores.containsKey(score))
				continue;
			else {
				leaderboardScores.put(score, counter);
				counter++;
			}
		}
		//100 90 90 80 75 60
		//50 65 77 90 102
		int leaderboardSize = leaderboardScores.size();
		int last = ranked.get(ranked.size()-1);
		int first = ranked.get(0);
		
		System.out.println(leaderboardScores);
		
		for(int score : player) {
			if(leaderboardScores.containsKey(score))
				ranks.add(leaderboardScores.get(score));
			else if (score > first)
				ranks.add(1);
			else if (score < last)
				ranks.add(leaderboardSize+1);
			else {
				ranks.add(leaderboardScores.get(leaderboardScores.ceilingKey(score)));
			}
		}
		
		return ranks;
}
	
	
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.print("Leaderboard scores: ");
		List<Integer> ranked = Stream.of(input.nextLine().replaceAll("(\\s)\\1+", " ").split(" ")).map(Integer::parseInt).collect(Collectors.toList());
		System.out.print("Player scores: ");
		List<Integer> player = Stream.of(input.nextLine().replaceAll("(\\s)\\1+", " ").split(" ")).map(Integer::parseInt).collect(Collectors.toList());
		
		System.out.println(climbingLeaderboard(ranked, player));
	}

}

//List<Integer> ranks = new ArrayList<>();
//Set<Integer> scoreSet = new TreeSet<>(ranked).descendingSet();
//List<Integer> scoreArr = new ArrayList<>(scoreSet);
//List<Integer> temp;
//int leaderboardSize = scoreSet.size();
//int highestScore = scoreArr.get(0);
//int lowest = scoreArr.get(leaderboardSize-1);
//
//for(int score : player) {
//	if(scoreSet.contains(score)) 
//		ranks.add(scoreArr.indexOf(score)+1);
//	else if(score > highestScore)
//		ranks.add(1);
//	else if(score < lowest)
//		ranks.add(leaderboardSize+1);
//	else {
//		scoreSet.add(score);
//		temp = new ArrayList<>(scoreSet);
//		ranks.add(temp.indexOf(score) + 1);
//		scoreSet.remove(score);
//	}
//		
//}
//
//return ranks;
