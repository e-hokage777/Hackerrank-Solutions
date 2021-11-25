package Challenges;

import java.util.ArrayList;
import java.util.Scanner;

public class JArrayList {

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		int n;
		int d;
		int q;
		int x;
		int y;

		

		ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();

		System.out.println("How many lines 'n', do you want to have?");
		n = input.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("How many integers do you want to be in line number " + (i + 1));
			d = input.nextInt();
			ArrayList<Integer> subList = new ArrayList<>();

			for (int m = 0; m < d; m++) {
				int num = input.nextInt();
				subList.add(num);
			}

			mainList.add(subList);
		}
		
		System.out.println("How many queries do you want to make?");
		q = input.nextInt();
		
		for(int p = 0; p < q; p++) {
			System.out.print("Line: ");
			x = input.nextInt();
			System.out.println();
			System.out.print("Position: ");
			y = input.nextInt();
			System.out.println();
			
			try {
				int number = mainList.get(x-1).get(y-1);
				System.out.println(number);
			}
			catch(Exception e) {
				System.out.println("ERROR");
			}
		}
	}

}
