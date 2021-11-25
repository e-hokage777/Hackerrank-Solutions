package Challenges;

import java.util.BitSet;
import java.util.Scanner;

public class JavaBitSet {	
	
	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Size and Number of Operations: ");
		String []numAndSize = input.nextLine().split(" ");
		
		int size = Integer.parseInt(numAndSize[0]);
		int iterations = Integer.parseInt(numAndSize[1]);
		
		BitSet set1 = new BitSet(5);
		BitSet set2 = new BitSet(5);
		
		for(int x = 0; x < iterations; x++) {
			System.out.print("Operation: ");
			String operations[] = input.nextLine().split(" ");
			
			String operation = operations[0];
			int arg1 = Integer.parseInt(operations[1]);
			int arg2 = Integer.parseInt(operations[2]);
			
			if(operation.equals("AND")) {
				if(arg1 == 1) {
					set1.and(set2);
				}
				else {
					set2.and(set1);
				}
				System.out.println(set1.cardinality() + " " + set2.cardinality());
			}
			if(operation.equals("OR")) {
				if(arg1 == 1) {
					set1.or(set2);
				}
				else {
					set2.or(set1);
				}
				System.out.println(set1.cardinality() + " " + set2.cardinality());
			}
			
			if(operation.equals("XOR")) {
				if(arg1 == 1) {
					set1.xor(set2);
				}
				else {
					set2.xor(set1);
				}
				
				System.out.println(set1.cardinality() + " " + set2.cardinality());
			}
			
			if(operation.equals("FLIP")) {
				if(arg1 == 1) {
					set1.flip(arg2);
				}
				else {
					set2.flip(arg2);
				}
				System.out.println(set1.cardinality() + " " + set2.cardinality());
			}
			
			if(operation.equals("SET")) {
				if(arg1 == 1) {
					set1.set(arg2);
				}
				else {
					set2.set(arg2);
				}
				System.out.println(set1.cardinality() + " " + set2.cardinality());
			}
		}
		
	}

}
