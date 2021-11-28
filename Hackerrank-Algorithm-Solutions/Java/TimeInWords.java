package AlgorithmChallenges;

import java.util.Scanner;

public class TimeInWords {

	public static String timeInWords(int h, int m) {
		String one_to_20[] = { "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven",
				"twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nighteen", "twenty" };

		String twenty = "twenty";

		String M = String.valueOf(m);

		if (m == 0)
			return one_to_20[h - 1] + " o' clock"; // Taking care of the oclocks;

		if (m == 1)
			return "one minute past " + one_to_20[h - 1]; // Taking care of one minute past

		if (m == 59)
			return "one minute to " + one_to_20[h]; // Taking care of one minute to

		if (m == 30)
			return "half past " + one_to_20[h - 1]; // Taking care of the 30s;

		if (m == 15)
			return "quarter past " + one_to_20[h - 1]; // Taking care of quarter past

		if (m == 45)
			return "quarter to " + one_to_20[h]; // Taking care of quarter to

		// Taking care of the rest
		if (m <= 20) {
			return one_to_20[m - 1] + " minutes past " + one_to_20[h - 1];
		}

		if (m <= 29)
			return "twenty " + one_to_20[m - 20 - 1] + " minutes past " + one_to_20[h - 1];

		int diff = 60 - m;

		if (diff <= 20)
			return one_to_20[diff - 1] + " minutes to " + one_to_20[h];

		else
			return "twenty " + one_to_20[diff - 20 - 1] + " minutes to " + one_to_20[h];

	}

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter hour: ");
		int h = input.nextInt();
		System.out.print("Enter minutes: ");
		int m = input.nextInt();

		System.out.println(timeInWords(h, m));
	}

}
