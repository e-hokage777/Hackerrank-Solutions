package Challenges;

import java.util.HashMap;
import java.util.Scanner;

public class Maps {
	
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		
		HashMap<String, Integer> phonebook = new HashMap<>();
		
		System.out.println("How many entries do you want to add to the phonebook");
		
		int n = Integer.parseInt(input.nextLine());
		
		
		for(int i = 0; i < n; i++) {
			String name = input.nextLine();
			int number = Integer.parseInt(input.nextLine());
			
			
			phonebook.put(name, number);
		}
		
		System.out.println("Here is where the queries are going to be made");
			
		for(int x = 0; x < phonebook.size(); x++) {
			
			String name = input.nextLine();
			if(phonebook.get(name) == null) {
				System.out.println("Not Found");
			}
			else
				System.out.println(name +"="+ phonebook.get(name));

		}

	}
}
