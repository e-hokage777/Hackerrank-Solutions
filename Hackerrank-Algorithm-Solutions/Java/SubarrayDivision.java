package AlgorithmChallenges;
import java.util.*;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class SubarrayDivision {

	public static int birthday(List<Integer> s, int d, int m){
		int counter = 0;
		int temp = 0;

		for(int i = 0; i < s.size()-(m-1);i++){
			temp = s.subList(i,(m+i)).stream().reduce(0,(ans,k)->ans+k);

			if(temp == d)
				counter++;
		}

		return counter;

	}

	public static void main(String args[]){
		Scanner input = new Scanner(System.in);

		System.out.print("Chocolate integers: ");

		List<Integer> s = Stream.of(input.nextLine().replaceAll("\\s+$", "").split(" ")).map(Integer::parseInt).collect(Collectors.toList());

		String dandm[] = input.nextLine().trim().split(" ");

		int d = Integer.parseInt(dandm[0]);
		int m = Integer.parseInt(dandm[1]);

		System.out.println(birthday(s,d,m));

	}

}