package Challenges;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Flower {
	public String whatsYourName() {
		return "Flower";
	}
}

class Jasmine extends Flower{
	
	public String whatsYourName() {
		return "Jasmine";
	}

}

class Lily extends Flower{
	public String whatsYourName() {
		return "Lily";
	}
}

class Region {
	Flower flower;
	public Flower yourNationalFlower() {
		return flower;
	}
	
}

class WestBengal extends Region{
	public WestBengal() {
		this.flower = new Jasmine();
	}
	public Flower yourNationFlower() {
		return this.flower;
	}
}

class AndhraPradesh extends Region{
	public AndhraPradesh() {
		this.flower = new Lily();
	}
	
	public Flower yourNationFlower() {
		return this.flower;
	}
}

public class JavaCovariantReturnTypes {

	public static void main(String args[]) throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		String s = reader.readLine().trim();
		Region region = null;

		switch (s) {
		case "WestBengal":
			region = new WestBengal();
			break;
		case "AndhraPradesh":
			region = new AndhraPradesh();
			break;
		}
		
		Flower flower = region.yourNationalFlower();
		System.out.println(flower.whatsYourName());
	}

}
