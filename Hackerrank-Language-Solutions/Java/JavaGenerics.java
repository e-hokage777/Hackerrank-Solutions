package Challenges;

import java.util.Scanner;

class Printer {
	public <T> void printArray(T obj[]){
		
		for(T element : obj) {
			System.out.println(element);
		}
		
	}
}

public class JavaGenerics {
	
	
	public static void main(String args[]) {
		
		Printer printer = new Printer();
		
		Integer intArray[] = {1,2,3};
		String stringArray[] = {"Hello", "World"};
		
		printer.printArray(intArray);
		printer.printArray(stringArray);
	}

}
