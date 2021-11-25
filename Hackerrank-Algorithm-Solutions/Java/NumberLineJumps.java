package AlgorithmChallenges;
import java.util.Scanner;

public class NumberLineJumps {
	public static String kangaroo(int x1, int v1, int x2, int v2){
		if(x1 > x2 && v1 >= v2)
			return "NO";
		else if(x2 > x1 && v2 >= v1)
			return "NO";
		else{
			int smallest = (x1 > x2)? x2:x1;
			int largest = (x1 < x2)? x2:x1;

			if(x1 > x2){
				while(true){
					x1+=v1;
					x2+=v2;
					if(x1 == x2)
						return "YES";
					if(x2 > x1)
						return "NO";


				}
			}

			if(x2 > x1){
				while(true){
					x1+=v1;
					x2+=v2;
					if(x1 == x2)
						return "YES";
					if( x1 > x2)
						return "NO";
				}
			}
		}

		return "NO";

	}

	public static void main(String args[]){

		Scanner input = new Scanner(System.in);
		System.out.print("Enter x1 v1 x2 v2:");
		String vals[] = input.nextLine().replace("\\s+$", "").split(" ");

			int x1 = Integer.parseInt(vals[0]);
			int v1 = Integer.parseInt(vals[1]);
			int x2 = Integer.parseInt(vals[2]);
			int v2 = Integer.parseInt(vals[3]);

			System.out.println(kangaroo(x1,v1,x2,v2));

	}
}