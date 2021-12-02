package AlgorithmChallenges;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LisasWorkbook {
	public static int workbook(int n, int k, List<Integer> arr) {
		int numOfSpecialProbs = 0;
		int page = 1;
		
		for(int i : arr) {
			
			for(int j = 1; j <= i ; j++) {	
				
				if(j == page)
					numOfSpecialProbs++;
				
				if(j%k == 0 || j == i)
					page+=1;
				
			}
			
		}
		
		return numOfSpecialProbs;
		
	}
	
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.print("Number of chapters and Max problems per page");
		String sNums[] = input.nextLine().split(" ");
		
		int n = Integer.parseInt(sNums[0]);
		int k = Integer.parseInt(sNums[1]);
		
		System.out.print("Chapter problems");
		List chapters = Stream.of(input.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
		
		System.out.println(workbook(n,k, chapters));
	}
}
