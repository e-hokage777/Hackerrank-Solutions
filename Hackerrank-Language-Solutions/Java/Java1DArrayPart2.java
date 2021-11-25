package Challenges;

import java.util.ArrayList;
import java.util.Scanner;

public class Java1DArrayPart2 {

	public static boolean canWin(int pos,int leap, int game[]) {
		if(pos >= game.length) return true;
		if(pos < 0 || game[pos] == 1) return false;
		
		game[pos] = 1;
		
		for(int i : game)
			System.out.print(i);
		System.out.println();
		
		return   canWin(pos+1,leap,game)  || canWin(pos-1,leap,game) || canWin(pos+leap,leap,game);
		
	}
	

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		System.out.print("Number of Queries: ");
		int queries = Integer.parseInt(input.nextLine());

		while (queries-- != 0) {

			System.out.print("Size of game: ");
			int size = input.nextInt();

			System.out.print("Leap: ");
			int leap = input.nextInt();

			int game[] = new int[size];

			for (int i = 0; i < size; i++) {
				System.out.print("Value at index " + i + ": ");
				game[i] = input.nextInt();
			}

			System.out.println(canWin(0,leap, game) ? "YES" : "NO");
		}
	}
}
