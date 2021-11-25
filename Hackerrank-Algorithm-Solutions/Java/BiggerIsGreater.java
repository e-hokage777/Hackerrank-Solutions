package AlgorithmChallenges;

import java.util.Arrays;
import java.util.Scanner;

class Result{
	
	public static void swap(char charArray[], int current, int replacement) {
		char temp = charArray[replacement];
		charArray[replacement] = charArray[current];
		charArray[current] = temp;
	}
	
	public static void reverse(char charArray[], int start, int end) {
		while(start < end) {
			char temp = charArray[end];
			charArray[end] = charArray[start];
			charArray[start] = temp;
			
			start++;
			end--;
		}
	}
	
	
	public static String biggerIsGreater(String w) {
		//Length of string
		int stringLength = w.length();
		//Converting to character array
		
		//Possible result;
		String answer = "no answer";
		
		if(stringLength < 2)
			return answer;
		
		char charArray[] = w.toCharArray();
		
		int prePivotIndex = stringLength - 2;
		
		//checking
		
		while(prePivotIndex >= 0) {
			if(charArray[prePivotIndex] < charArray[prePivotIndex + 1])
				break;
			prePivotIndex--;
		}
		
		//Getting the pivot index
		int pivotIndex = prePivotIndex;
		
		if(pivotIndex < 0)
			return answer;
		
		int successor = 0;
		
		for(int i =  stringLength -1; i > pivotIndex; i--) {
			if(charArray[i] > charArray[pivotIndex]) {
				successor = i;
				break;
			}
		}
		
		//swapping successor with pivot
		swap(charArray, pivotIndex, successor);
		
		//reverse suffix
		reverse(charArray, pivotIndex+1, stringLength-1);
		
		
		return new String(charArray);
		
	}
	
}

public class BiggerIsGreater {
	
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.print("Number of cases: ");
		int test_cases = Integer.parseInt(input.nextLine());
		
		while(test_cases-- > 0) {
			System.out.print("Your string: ");
			String w = input.nextLine();
			
			String final_result = Result.biggerIsGreater(w);
			System.out.println(final_result);
		}
	}

}
