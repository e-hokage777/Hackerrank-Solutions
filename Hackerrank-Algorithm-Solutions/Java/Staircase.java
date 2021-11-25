package AlgorithmChallenges;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class Staircase {
	public static void stairCase(int n){
		StringBuilder builder;
		String stair = "#";
		String width = String.valueOf(n);
		for(int i = 0; i < n; i++){
			int freq = i + 1;
			builder = new StringBuilder();
			while(freq-- >  0){
				builder.append(stair);
			}
			System.out.printf("%"+width+"s", builder.toString());
			System.out.println();
		}

	}

	public static void main(String args[]) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Base and Height of Staircase: ");
		int bandh = Integer.parseInt(reader.readLine());

		stairCase(bandh);
	}
}