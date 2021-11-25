package AlgorithmChallenges;

import java.util.Scanner;

public class CatsAndMouse {
	
	public static String catAndMouse(int catAPos, int catBPos, int mousePos) {
		int catADistFromMouse = Math.abs(catAPos - mousePos);
		int catBDistFromMouse = Math.abs(catBPos - mousePos);
		
		return catADistFromMouse == catBDistFromMouse? "Mouse C" : catADistFromMouse < catBDistFromMouse? "Cat A": "Cat B";
	}
	
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.print("Number of test cases: ");
		int testCases = Integer.parseInt(input.nextLine());
		
		for(int i = 0; i < testCases; i++) {
			System.out.print("Cat A, CatB and Mouse positions: ");
			String sNums[] = input.nextLine().split(" ");
			int catAPos = Integer.parseInt(sNums[0]);
			int catBPos = Integer.parseInt(sNums[1]);
			int mousePos = Integer.parseInt(sNums[2]);
			
			
			System.out.println(catAndMouse(catAPos, catBPos, mousePos));
		}
	}

}
