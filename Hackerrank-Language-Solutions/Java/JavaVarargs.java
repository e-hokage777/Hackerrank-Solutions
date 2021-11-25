package Challenges;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Add {
	public void add(int...nums) {
		
		int total = 0;
		int counter = 1;
		
		for(int n : nums) {
			total+=n;
			
			if(counter == nums.length) {
				System.out.print(n);
			}
			else {
				System.out.print(n+"+");
			}
			counter++;
			
		}
		
		System.out.print("="+total);
		System.out.println();
		
	}
}

public class JavaVarargs {
	
	
	public static void main(String args[]) {
		
		System.out.println("Enter six numbers here");
		System.out.println("Remember to press enter after each number and twice after the last");
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			int n1 = Integer.parseInt(reader.readLine());
			int n2 = Integer.parseInt(reader.readLine());
			int n3 = Integer.parseInt(reader.readLine());
			int n4 = Integer.parseInt(reader.readLine());
			int n5 = Integer.parseInt(reader.readLine());
			int n6 = Integer.parseInt(reader.readLine());
			
			Add a = new Add();
			a.add(n1,n2);
			a.add(n1,n2,n3);
			a.add(n1,n2,n3,n4,n5);
			a.add(n1,n2,n3,n4,n5,n6);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Please pay attention the instructions above and restart the program");
			System.exit(1);
		}
		catch(NumberFormatException e) {
			System.out.println("Please pay attention the instructions above and restart the program");
			System.exit(1);
		}
		
	}

}
