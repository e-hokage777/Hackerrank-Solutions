package AlgorithmChallenges;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class MinMaxSum{
	public static void minMaxSum(List<Integer> arr){
		long maxSum = 0;
		long minSum = 0;
		Collections.sort(arr);

		for(int i = 0; i < 4; i++){
			minSum+=arr.get(i);
		}

		for(int i = 1; i < 5; i++){
			maxSum+=arr.get(i);
		}

		System.out.println(minSum + " " + maxSum);
 

}


	public static void main(String args[]){
		Scanner input = new Scanner(System.in);

		List<Integer> arr = new ArrayList<>();

		System.out.println(Integer.MAX_VALUE);

		System.out.print("Enter five numbers: ");
		String sNums[] = input.nextLine().split(" ");

		for(String s : sNums){
			int num = Integer.parseInt(s);
			arr.add(num);
		}

		minMaxSum(arr);

	}
}