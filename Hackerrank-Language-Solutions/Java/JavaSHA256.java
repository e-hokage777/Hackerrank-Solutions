package Challenges;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class JavaSHA256 {
	
	public static void main(String args[]) throws NoSuchAlgorithmException {
		Scanner input = new Scanner(System.in);
		MessageDigest digester = MessageDigest.getInstance("SHA-256");
		
		System.out.print("Enter Your String: ");
		
		byte hash[] = digester.digest(input.next().getBytes());
		
//		BigInteger mag = new BigInteger(1,hash);
//		
//		String res = mag.toString(16);
//		
//		System.out.println(res);
		
		for(byte b : hash) {
			System.out.printf("%02x", b);
		}
	}

}
