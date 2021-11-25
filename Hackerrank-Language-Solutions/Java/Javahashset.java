package Challenges;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Javahashset {
	
	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("How many pairs do you want to use");
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];
        
        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }

//Write your code here
        int distinctCount = 0;
        HashSet<ArrayList<String>> nameSet = new HashSet<>();
        
        for(int i = 0; i < t; i++){
            int initSize = nameSet.size();
            
            ArrayList<String> tempArray = new ArrayList<String>();
            
            tempArray.add(pair_left[i]);
            tempArray.add(pair_right[i]);
            
            nameSet.add(tempArray);

            if(nameSet.size() > initSize){
                distinctCount++;
            }
            
            System.out.println(distinctCount);
        }
        
	}

}
