package Challenges;

import java.util.ArrayList;
import java.util.Scanner;

public class JavaList {
	
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		int numbers;
		int queries;
		
		//System.out.println("How many integers do you want in the list");
		
		numbers = input.nextInt();
		
		for(int x = 0; x < numbers; x++) {
			int num = input.nextInt();
			
			list.add(num);
		}
		
		//System.out.println("How many queries do you want to make");
		
		queries = input.nextInt();
		input.nextLine();
		
		for(int i = 0; i < queries; i++) {
			String choice = input.nextLine();
			
			if(choice.equals("Insert")){
				//System.out.println("Index:");
				int x = input.nextInt();
				//System.out.println("Replacement:");
				int y = input.nextInt();
				input.nextLine();
				
				list.add(x,y);
			}
			else if (choice.equals("Delete")) {
			
			//System.out.println("Input the index of the value you would like to delete");
			int x = input.nextInt();
			input.nextLine();
			list.remove(x);
		}
		
	}
		for(int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i)+ " ");
		}

}
}
