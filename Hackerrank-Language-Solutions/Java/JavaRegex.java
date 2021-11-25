package Challenges;

import java.util.Scanner;

class ValidateIp{
	public static final String regex = "(((2?[0-4]?[0-9])|([0-1]?[0-9]?[0-9])|(25[1-5]))\\.){3}((2?[0-4]?[0-9])|([0-1]?[0-9]?[0-9])|(25[1-5]))$";
}

public class JavaRegex {
	
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Number of IPs to Validate: ");
		int number = Integer.parseInt(input.nextLine());
		
		while(number-- !=0) {
			System.out.print("IP address: ");
			String ip = input.nextLine();
			
			System.out.println(ip.matches(ValidateIp.regex));
		}
	}

}
