package Challenges;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class JavaDequeue {
	public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<>();
        Set<Integer> set = new HashSet<>();
        System.out.print("Size of array: ");
        int n = in.nextInt();
        System.out.print("Size of subarrays: ");
        int m = in.nextInt();
        int max = 0;

        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            
            deque.add(num);
            set.add(num);
            
            max = Math.max(max, set.size());
            if(deque.size() == m) {
            	System.out.println(deque);
            	int removed = deque.remove();
            	
            	if(!deque.contains(removed))
            		set.remove(removed);
            	
            }
            
            
           
        }
        
        System.out.println(max);
	}

}
