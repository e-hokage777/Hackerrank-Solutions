package AlgorithmChallenges;
import java.util.*;
import static java.lang.System.out;


public class AppleandOrange {
	public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges){
		int applesOnRoof = 0;
		int orangesOnRoof = 0;
		int distance = 0;

		for(int i : apples){
			distance = i + a;
			if(distance >=s && distance <=t)
				applesOnRoof++;
		}
		distance = 0;

		for(int i : oranges){
			distance = i + b;
			if(distance >=s && distance <= t){
				orangesOnRoof++;
			}
		}

		System.out.println(applesOnRoof);
		System.out.println(orangesOnRoof);

	}

	public static void main(String args[]){
		List<Integer> apples = new ArrayList<>();
		List<Integer> oranges = new ArrayList<>();
		Scanner input = new Scanner(System.in);
		out.print("Two ends of roof: ");
		String sandt[] = input.nextLine().split(" ");
		int s = Integer.parseInt(sandt[0]);
		int t = Integer.parseInt(sandt[1]);

		out.print("Position of apple tree and orange tree: ");
		String aandb[] = input.nextLine().split(" ");
		int a = Integer.parseInt(aandb[0]);
		int b = Integer.parseInt(aandb[1]);

		out.print("Apples(where they fell): ");
		String pOfApples[] = input.nextLine().split(" ");

		for(String m : pOfApples){
			int apple = Integer.parseInt(m);
			apples.add(apple);
		}

		out.print("Oranges(where they fell): ");
		String pOfOranges[] = input.nextLine().split(" ");


		for(String m : pOfOranges){
			int orange = Integer.parseInt(m);
			oranges.add(orange);
		}

		countApplesAndOranges(s,t,a,b,apples,oranges);



	}
}