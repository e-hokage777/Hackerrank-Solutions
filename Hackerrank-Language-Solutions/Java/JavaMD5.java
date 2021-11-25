package Challenges;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class JavaMD5 {
	
	public static void main(String args[]) throws NoSuchAlgorithmException {
		MessageDigest digest = MessageDigest.getInstance("MD5");
		Scanner input =  new Scanner(System.in);
		
		byte hash[];
		
		
		System.out.print("Your String: ");
		hash = digest.digest(input.next().getBytes());
		
		
		for(byte b : hash) {
			System.out.printf("%02x", b);
		}
	}

}
