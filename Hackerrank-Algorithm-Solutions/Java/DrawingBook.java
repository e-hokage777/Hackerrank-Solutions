package AlgorithmChallenges;
import java.util.Scanner;

public class DrawingBook {
	public static int pageCount(int n, int p) {
		int frontFlips = 0;
		int backFlips = 0;
		//Checking number of pages for front
		frontFlips = p/2;
		
		int diff = n - p;
		
		if(diff == 1 && n%2 == 0) 
			backFlips = 1;
		else
			backFlips = diff/2;

		return frontFlips < backFlips? frontFlips:backFlips;
	}
	
	
	
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.print("Number of Pages: ");
		int n = input.nextInt();
		System.out.print("Page to turn to: ");
		int p = input.nextInt();
		
		System.out.println(pageCount(n,p));
	}

}
