package AlgorithmChallenges;

import java.util.Scanner;

public class DayofTheProgrammer {
	
	public static String dayOfProgrammer(int year) {
		int day = 13;
		int month = 9;
		if(year < 1918 && year%4 == 0) {
			day = 12;
		}
		else if(year > 1918 && year%400 == 0 || (year%100 != 0 && year%4 == 0)) {
			day = 12;
		}
		else if(year == 1918) {
			day = 26;
		}
		
		return String.format("%02d.%02d.%4d", day, month, year);
	}
	
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter year: ");
		int year = input.nextInt();
		
		
		System.out.printf("Day of the programmer for %d is %s", year, dayOfProgrammer(year));
		
	}

}
