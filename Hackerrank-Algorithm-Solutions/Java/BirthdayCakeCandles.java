package AlgorithmChallenges;
import java.util.*;

public class BirthdayCakeCandles{
	public static int birthdayCakeCandles(List<Integer> arr){
		int largest = 0;
		int largeCount = 0;

		Collections.sort(arr);

		largest = arr.get(arr.size()-1);

		for(int i = 0; i < arr.size(); i++){
			if(largest == arr.get(i))
				largeCount++;
		}

		return largeCount;
	}
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);

		List<Integer> arr = new ArrayList<>();

		System.out.print("Candles: ");

		String sNums[] = input.nextLine().split(" ");

		for(String s : sNums){
			int num = Integer.parseInt(s);
			arr.add(num);
		}

		System.out.println(birthdayCakeCandles(arr));
 
	}
}