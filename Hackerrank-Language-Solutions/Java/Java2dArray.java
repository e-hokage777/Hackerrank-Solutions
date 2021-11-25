package Challenges;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Java2dArray {

	public static void main(String args[]) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();

		int mainTotal = Integer.MIN_VALUE;

		for (int i = 0; i < 6; i++) {
			ArrayList<Integer> subArrayList = new ArrayList<>();
			String[] subList = new String[6];
			try {
				subList = reader.readLine().replaceAll("\\s+$", "").split(" ");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			for (int j = 0; j < subList.length; j++) {
				int arrItem = Integer.parseInt(subList[j]);
				subArrayList.add(arrItem);
			}

			mainList.add(subArrayList);

		}
		int eachLine = 0;
		int line = 0;
		System.out.println(mainList);

		for (int m = 1; m < 17; m++) {
			int total = mainList.get(line).get(eachLine % 4) + mainList.get(line).get((eachLine % 4) + 1)
					+ mainList.get(line).get((eachLine % 4) + 2) + mainList.get(line+1).get((eachLine % 4) + 1)
					+ mainList.get(line+2).get(eachLine % 4) + mainList.get(line+2).get((eachLine % 4) + 1)
					+ mainList.get(line+2).get((eachLine % 4) + 2);
			System.out.println(total);

			eachLine++;
			
			if(m%4 == 0) {
				line++;
			}
			
			if(total > mainTotal) {
				mainTotal = total;
			}
			
		}
		
		System.out.println(mainTotal);

	}
	

}
