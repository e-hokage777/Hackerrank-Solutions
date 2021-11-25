package AlgorithmChallenges;
import java.util.Scanner;

public class TimeConversion {
	public static String timeConversion(String s){
		boolean pm = s.endsWith("PM");

		s = s.replaceAll("AM|PM", "");

		String hrMinSec[] = s.split(":");
		int hours = Integer.parseInt(hrMinSec[0]);
		int mins = Integer.parseInt(hrMinSec[1]);
		int secs = Integer.parseInt(hrMinSec[2]);

		if(pm){
			if(hours != 12)
				hours = (hours+12);
		}
		else {
			if(hours == 12)
				hours = 0;
		} 

		String militaryTime = String.format("%02d:%02d:%02d", hours, mins,secs);

		return militaryTime;
	}

	public static void main(String args[]){
		Scanner input = new Scanner(System.in);

		System.out.print("Time: ");

		String time = input.nextLine();

		System.out.println(timeConversion(time));
	}
}