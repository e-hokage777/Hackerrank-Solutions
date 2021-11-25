package Challenges;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class JavaPrimalityTest {

	public static void main(String args[]) throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		String n = reader.readLine().replaceAll("\\s+$", "");
		
		reader.close();
		
		BigInteger A = new BigInteger(n);
		
		if(A.isProbablePrime(1))
			System.out.println("prime");
		else
			System.out.println("not prime");
	}

}
