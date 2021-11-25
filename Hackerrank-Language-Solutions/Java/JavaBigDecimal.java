package Challenges;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

class Compare implements Comparator<String>{

	@Override
	public int compare(String s1, String s2) {
		BigDecimal d1 = new BigDecimal(s1);
		BigDecimal d2 = new BigDecimal(s2);
		return -d1.compareTo(d2);
	}
	
}

public class JavaBigDecimal {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("How many Numbers? ");
		int n = Integer.parseInt(input.nextLine());
		
		ArrayList<String> bigDecimals = new ArrayList<>();
		
		for(int i = 0; i < n; i++) {
			System.out.print("Number: ");
			bigDecimals.add(input.nextLine());
		}
		
		bigDecimals.sort(new Compare());
		
		for(String s : bigDecimals) {
			System.out.println(s);
		}
	}

}
