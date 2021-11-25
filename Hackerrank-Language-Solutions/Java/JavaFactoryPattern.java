package Challenges;

import java.util.Scanner;

interface Food {
	public String getType();
}

class FoodFactory {
	
	public Food getFood(String s) {
		if(s.equals("pizza"))
			return new Pizza();
		else if (s.equals("cake"))
			return new Cake();
		else
			return null;
	}
	
}

class Pizza implements Food {

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "Someone ordered Fast Food!";
	}
	
}

class Cake implements Food {

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "Someone ordered Fast Food!";
	}
	
}

public class JavaFactoryPattern {

	public static void main(String args[]) {
		try {
			Scanner input = new Scanner(System.in);
			
			FoodFactory foodFactory = new FoodFactory();
			
			System.out.print("Name of Food ");
			Food food = foodFactory.getFood(input.nextLine());
			
			System.out.println("The factory returned " + food.getClass());
			System.out.println(food.getType());
		}
		catch(Exception e) {
			System.out.println("Unsuccessful Termination!!");
		}
	}
}
