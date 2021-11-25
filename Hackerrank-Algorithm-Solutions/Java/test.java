package AlgorithmChallenges;

import java.util.HashMap;



public class test {
	
	public static void main(String a[]){
		HashMap<Integer, Integer> map = new HashMap<>();
		map.put(0, 1);
		map.put(1, 1);
		map.put(2, 1);
		
		map.merge(4, 5, Integer::sum);
		
		System.out.println(map);
		
		System.out.println(map.get(0));
	}
	
	
}