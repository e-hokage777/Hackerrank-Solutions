package AlgorithmChallenges;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ACMICPCTeamTopics {

	public static List<Integer> acmTeam(List<String> topic, int num) {

		List<Integer> counts = new ArrayList<>();
		List<Integer> result = new ArrayList<>();
		int max = 0;
		int num_max = 0;

		for (int i = 0; i < num - 1; i++) {
			for (int j = i + 1; j < num; j++) {
				String perm = (new BigInteger(topic.get(i), 2).or(new BigInteger(topic.get(j), 2))).toString(2);
				int count = 0;
				for (int m = 0; m < perm.length(); m++) {
					if (perm.charAt(m) == '1')
						count++;

				}
				counts.add(count);

				if (count > max)
					max = count;
			}
		}

		for (int i : counts) {
			if (i == max)
				num_max++;
		}

		result.add(max);
		result.add(num_max);


		return result;
	}

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		String sNums[] = input.nextLine().split(" ");

		int num_attendees = Integer.parseInt(sNums[0]);
		int topics = Integer.parseInt(sNums[1]);

		List<String> attendees = new ArrayList<>();

		for (int i = 0; i < num_attendees; i++) {
			attendees.add(input.nextLine());
		}

		System.out.println(acmTeam(attendees, num_attendees));
	}
}
