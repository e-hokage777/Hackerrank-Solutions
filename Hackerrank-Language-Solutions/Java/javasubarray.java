package Challenges;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class javasubarray {

	public static void main(String args[]) {
		ArrayList<Integer> numbers = new ArrayList<>();
		Scanner input = new Scanner(System.in);

		int numNegativeSubs = 0;
		int sumSubs = 0;
		System.out.println("How many integers do you want in your list");

		int n = Integer.parseInt(input.next());

		for (int i = 0; i < n; i++) {
			int num = Integer.parseInt(input.next());
			numbers.add(num);
		}

//		for (int i = 0; i < numbers.size(); i++) {
//			sumSubs = numbers.get(i);
//
//			if (sumSubs > 0) {
//				numNegativeSubs += 1;
//			}
//		}

		int increase = 0;
		int xincrease = 0;

		for (int m = 0; m < numbers.size(); m++) {

			for (int i = 0; i < numbers.size()-xincrease; i++) {
				// [1,-2,3]

				for (int x = 0+xincrease; x < numbers.size() - increase; x++) {
					sumSubs += numbers.get(x);
				}

				if (sumSubs < 0) {
					numNegativeSubs += 1;
				}
				sumSubs = 0;
				increase += 1;
			}
			increase = 0;
			
			xincrease+=1;

		}
		
		System.out.println(numNegativeSubs);

	}
}
