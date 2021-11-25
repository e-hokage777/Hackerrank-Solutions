package AlgorithmChallenges;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Results {

	static List<Integer> sortedArr = new ArrayList<>();

	public static String checkSwap(List<Integer> arr, int current, int fromSorted) {
		
		int currentTemp = arr.get(current);
		int nextTemp = fromSorted;
		int nextTempInd = arr.indexOf(fromSorted);
		
		//Swapping
		arr.set(current, nextTemp);
		arr.set(nextTempInd, currentTemp);
		
		if(arr.equals(sortedArr))
			return "yes" + "\n" + "swap " + (current + 1) + " " + (nextTempInd + 1);
		
		//Swapping back
		arr.set(current, currentTemp);
		arr.set(nextTempInd, nextTemp);
		
		return "no";
	}

	public static String checkReverse(List<Integer> arr, int currentIndex, int fromSortedArr) {
		int arrLength = arr.size();
		int r = -1;
		int l = currentIndex;
		

		// finding right end
		for (int i = currentIndex; i < arrLength; i++) {
			if (arr.get(i) < arr.get(Math.min(i+1, arrLength-1)) || i == arrLength-1) {
				r = i;
				break;
			}
		}
		

		
		int rr = r;
		
		if(r < 0)
			return "no";

		while (r > l) {
			int temp = arr.get(r);

			arr.set(r, arr.get(l));
			arr.set(l, temp);

			r--;
			l++;

		}
		
		System.out.println("Reversed Array: " + arr);

		if (arr.equals(sortedArr))
			return "yes" + "\n" + "reverse " + (currentIndex + 1) + " " + (rr + 1);
		else
			return "no";
	}

	public static void almostSorted(List<Integer> arr) {
		sortedArr.addAll(arr);
		Collections.sort(sortedArr);
		
		//System.out.println(sortedArr);

		String answer = null;

		if (arr.equals(sortedArr)) {
			System.out.println("yes");
			return;
		}

		int lengthOfArr = arr.size();

		for (int i = 0; i < lengthOfArr; i++) {
			int fromArr = arr.get(i);
			int fromSorted = sortedArr.get(i);

			if (fromArr != fromSorted) {
				answer = checkSwap(arr, i, fromSorted);
			}

			if (answer == "no")
				answer = checkReverse(arr, i, fromSorted);

			if (answer != null) {
				break;
			}
		}

		System.out.println(answer);
	}

}

public class AlmostSorted {

	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Number of elements: ");
		int numberOfElements = Integer.parseInt(reader.readLine());

		System.out.print("Array elements: ");
		List<Integer> arr = Stream.of(reader.readLine().replaceAll("(\\s)\\1+", " ").split(" ")).map(Integer::parseInt)
				.collect(Collectors.toList());

		Results.almostSorted(arr);

		reader.close();
	}

}
