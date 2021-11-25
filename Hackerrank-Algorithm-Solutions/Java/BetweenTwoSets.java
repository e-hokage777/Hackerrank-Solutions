package AlgorithmChallenges;
import java.util.*;

public class BetweenTwoSets{

	public static int getTotalX(List<Integer> a, List<Integer> b){
		int count = 0;
		boolean possibility = false;

		Collections.sort(a);
		Collections.sort(b);

		int lowerLimit = a.get(a.size()-1);
		int upperLimit = b.get(0);

		System.out.println("Lower limit: "+lowerLimit);
		System.out.println("Upper Limit: "+ upperLimit);

		for(int i = lowerLimit; i <= upperLimit; i++){
			for(int x = 0; x < a.size();x++){
				if(i%a.get(x)== 0){
					possibility = true;
				}
				else{
					possibility = false;
					break;
				}
			}
			if(possibility){
			for(int x = 0; x <b.size(); x++){
				if(b.get(x)%i == 0)
					possibility = true;
				else{
					possibility = false;
				break;
			}
			}
		}

			if(possibility){
				System.out.println(i);
				count++;
			}
			}
			return count;
		}




	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		List<Integer>a = new ArrayList<>();
		List<Integer>b = new ArrayList<>();

		System.out.print("Factors: ");
		String factors[] = input.nextLine().split(" ");
		System.out.print("Multiples: ");
		String multiples[] = input.nextLine().split(" ");

		for(String s : factors){
			int n = Integer.parseInt(s);
			a.add(n);

		}

		for(String s : multiples){
			int n = Integer.parseInt(s);
			b.add(n);


		}

		System.out.println(getTotalX(a,b));
	}
}