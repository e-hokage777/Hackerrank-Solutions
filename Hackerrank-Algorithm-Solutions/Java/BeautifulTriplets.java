package AlgorithmChallenges;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BeautifulTriplets {
	
	public static int beautifulTriplets(int d, List<Integer> arr) {
		int arrLength = arr.size();
		int result = 0;
		
		for(int i = 0; i < arrLength-2; i++) {
			int next = i+1;
			int second = arr.get(i)+d;
			int third = arr.get(i) + 2 * d;
			int count = 1;
			while(next < arrLength && arr.get(next) <= second && count <3) {
				if(arr.get(next) == second) {
					count++;
					second = third;
				}
				
				next++;
			}
			
			
			if(count == 3) {
				result++;
			}
		}
		
		return result;
	}
	
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.print("Number of elements and Beautiful difference: ");
		String sNums[] = input.nextLine().split(" ");
		
		int sizeOfArr = Integer.parseInt(sNums[0]);
		int bDiff = Integer.parseInt(sNums[1]);
		
		List<Integer> arr = Stream.of(input.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
		
		System.out.println(beautifulTriplets(bDiff, arr));
	}

}
