package AlgorithmChallenges;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;


class SAFResult {
	static double shortestDistances[];
	static int shortestDistancesPath[];
	
	//Calculating distance from road end
	public static void distanceFromRoadEnd (int end, int index, double distFromParent,int parent, int visited[], ArrayList<Integer> houseRels[], ArrayList<Integer> distances[]) {
		if(visited[end] != 1) {
			visited[end] = 1;
			double distance = distFromParent + distances[parent].get(index);
			if(shortestDistances[end] != 0) {
				if(distance < shortestDistances[end]) {
					shortestDistances[end] = distance;
					shortestDistancesPath[end] = 1;
				}
			}
			
			else {
				shortestDistances[end] = distance;
				shortestDistancesPath[end] = 1;
			}
			
			for(int i = 0; i < houseRels[end].size(); i++) {
				distanceFromRoadEnd(houseRels[end].get(i), i, distance, end, visited, houseRels, distances);
			}
				
		}
	}
	
	//Calculating distances from road start
	public static void distanceFromRoadStart (int end, int index, double distFromParent,int parent, int visited[], ArrayList<Integer> houseRels[], ArrayList<Integer> distances[]) {
		if(visited[end] != 1) {
			visited[end] = 1;
			double distance = distFromParent + distances[parent].get(index);
			if(shortestDistances[end] != 0) {
				if(distance < shortestDistances[end]) {
					shortestDistances[end] = distance;
					shortestDistancesPath[end] = 0;
				}
			}
			
			else {
				shortestDistances[end] = distance;
				shortestDistancesPath[end] = 0;
			}
			
			for(int i = 0; i < houseRels[end].size(); i++) {
				distanceFromRoadStart(houseRels[end].get(i), i, distance, end, visited, houseRels, distances);
			}
			
		}
	}

	public static List<Double> solve(int numberOfFriends, int pickedRoad, List<List<Integer>> roads) {
		List<Double> result = new ArrayList<>();
		
		if(roads.size() == 1) {
			result.add(5.00000);
			result.add(5.00000);
			return result;
		}
		ArrayList<Integer> houseRels[] = new ArrayList[numberOfFriends+1];
		ArrayList<Integer> distances[] = new ArrayList[numberOfFriends+1];
		
		//Setting up shortest distances
		shortestDistances = new double[numberOfFriends+1];
		shortestDistancesPath = new int[numberOfFriends+1];
		
		
		int visitedEnd[] = new int[numberOfFriends+1];
		int visitedOther[] = new int[numberOfFriends+1];
		
		
		//Getting picked road values
		List<Integer> pickedRoadArr = roads.get(pickedRoad-1);
		int pickedRoadStart = pickedRoadArr.get(0);
		int pickedRoadEnd = pickedRoadArr.get(1);
		
		
		//Setting up the edges
		for(int i = 1; i < numberOfFriends+1; i++) {
			int start = roads.get(i-1).get(0);
			int end = roads.get(i-1).get(1);
			int distance = roads.get(i-1).get(2);
			
			ArrayList<Integer> houseRelStart = houseRels[start];
			ArrayList<Integer> houseRelEnd = houseRels[end];
			ArrayList<Integer> startDistance = distances[start];
			ArrayList<Integer> endDistance = distances[end];
 			
			//Assigning edges to road starts
			if(houseRelStart == null) {
				houseRelStart = new ArrayList<>();
				houseRelStart.add(end);
				houseRels[start] = houseRelStart;
				
			}
			else {
				houseRelStart.add(end);
				houseRels[start] = houseRelStart;
			}
			
			//Assigning edges to road ends
			if(houseRelEnd == null) {
				houseRelEnd = new ArrayList<>();
				houseRelEnd.add(start);
				houseRels[end] = houseRelEnd;
			}
			else {
				houseRelEnd.add(start);
				houseRels[end] = houseRelEnd;
			}
			
			//Setting up the distances
			if(startDistance == null) {
				startDistance = new ArrayList<>();
				startDistance.add(distance);
				distances[start] = startDistance;
			}
			else {
				startDistance.add(distance);
				distances[start] = startDistance;
			}
			
			if(endDistance == null) {
				endDistance = new ArrayList<>();
				endDistance.add(distance);
				distances[end] = endDistance;
			}
			else {
				endDistance.add(distance);
				distances[end] = endDistance;
			}
		}
		
		System.out.println(Arrays.toString(houseRels));
		System.out.println(Arrays.toString(distances));
		
		visitedEnd[pickedRoadStart] = 1;
		visitedOther[pickedRoadStart] = 1;
		
		for(int i = 0; i < houseRels[pickedRoadStart].size(); i++) {
			if(houseRels[pickedRoadStart].get(i) == pickedRoadEnd) {
				distanceFromRoadEnd(houseRels[pickedRoadStart].get(i), i, 0, pickedRoadStart, visitedEnd, houseRels, distances);
			}
			
			else
				distanceFromRoadStart(houseRels[pickedRoadStart].get(i), i, 0, pickedRoadStart, visitedOther, houseRels, distances);
		}
		
		
		System.out.println(Arrays.toString(shortestDistances));
		System.out.println(Arrays.toString(shortestDistancesPath));
		
		double largestFromStart = -1;
		double largestFromEnd = -1;
		
		//Picking largest from start
		for(int i = 1; i < numberOfFriends+1; i++) {
			if(shortestDistances[i] > largestFromStart && shortestDistancesPath[i] == 0)
				largestFromStart = shortestDistances[i];
			
			if(shortestDistances[i] > largestFromEnd && shortestDistancesPath[i] == 1)
				largestFromEnd = shortestDistances[i];
		}
		
		double distFromStart = Math.abs(largestFromEnd-largestFromStart)/2;
		double largestSmallest = Math.min(largestFromStart, largestFromEnd) + distFromStart;
		
		System.out.println(largestFromStart+ " " + largestFromEnd);
		
		result.add(distFromStart);
		result.add(largestSmallest);
		
		
		return result;
	}
}

public class SavitaAndFriends {

	public static void main(String args[]) throws NumberFormatException, IOException {
		Scanner input = new Scanner(System.in);
		System.out.print("Number of test cases: ");
		int numOfTestCases = Integer.parseInt(input.nextLine());

		for (int i = 0; i < numOfTestCases; i++) {
			System.out.print("Number of houses, number of roads and picked road: ");
			String sNums[] = input.nextLine().split(" ");

			int numbOfHouses = Integer.parseInt(sNums[0]);
			int numOfRoads = Integer.parseInt(sNums[1]);
			int pickedRoad = Integer.parseInt(sNums[2]);
			
			List<List<Integer>> roads = new ArrayList<>();
			
			for(int j = 0; j < numOfRoads; j++) {
				System.out.print("Start, End and distance between: ");
				roads.add(Stream.of(input.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList()));
			}
			
			List<Double> result = SAFResult.solve(numbOfHouses, pickedRoad, roads);
			
		}

	}

}
