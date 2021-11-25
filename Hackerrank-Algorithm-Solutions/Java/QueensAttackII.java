package AlgorithmChallenges;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class QueensAttackII {
	
	
	public static int maxNumOfSteps(int r, int c, int size, HashMap<Integer, ArrayList<Integer>> obstacles , int r_c, int c_c, int accum) {
//		if(r+r_c > size || c+c_c > size || r+r_c < 1 || c+c_c < 1 || (obstacles.get(r+r_c) != null && obstacles.get(r+r_c).contains(c+c_c)))
//			return accum;
//		
//		accum++;
//		
//		return maxNumOfSteps(r+r_c, c+c_c, size, obstacles, r_c, c_c, accum);
		
		while(true) {
			if(r+r_c > size || c+c_c > size || r+r_c < 1 || c+c_c < 1 || (obstacles.get(r+r_c) != null && obstacles.get(r+r_c).contains(c+c_c)))
				break;
			accum++;
			
			r+=r_c;
			c+=c_c;
		}
		
		return accum;
	}
	
	public static int queensAttack(int boardSize, int numOfObstacles, int row_queen, int column_queen, HashMap<Integer, ArrayList<Integer>> obstacles ) {
		int up = maxNumOfSteps(row_queen, column_queen, boardSize, obstacles, 1, 0,0);
		int down = maxNumOfSteps(row_queen, column_queen, boardSize, obstacles, -1, 0,0);
		int left = maxNumOfSteps(row_queen, column_queen, boardSize, obstacles, 0, -1,0);
		int right = maxNumOfSteps(row_queen, column_queen, boardSize, obstacles, 0, 1,0);
		int leftUp = maxNumOfSteps(row_queen, column_queen, boardSize, obstacles, 1, -1,0);
		int leftDown = maxNumOfSteps(row_queen, column_queen, boardSize, obstacles, -1, -1,0);
		int rightUp = maxNumOfSteps(row_queen, column_queen, boardSize, obstacles, 1, 1,0);
		int rightDown = maxNumOfSteps(row_queen, column_queen, boardSize, obstacles, -1, 1,0);
		
//		System.out.println("up: " + up);
//		System.out.println("down: " + down);
//		System.out.println("left: " + left);
//		System.out.println("right: " + right);
//		System.out.println("left up: " + leftUp);
//		System.out.println("left down: " + leftDown);
//		System.out.println("right up: " + rightUp);
//		System.out.println("right down: " + rightDown);

		
		return up+down+left+right+leftUp+leftDown+rightUp+rightDown;
	}
	
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.print("Board size and number of obstacles(space-separated): ");
		String sNums[] = input.nextLine().split(" ");
		int boardSize = Integer.parseInt(sNums[0]);
		int numOfObstacles = Integer.parseInt(sNums[1]);
		
		System.out.print("Queen's position(row and column): ");
		String sNums2[] = input.nextLine().split(" ");
		
		int row_queen = Integer.parseInt(sNums2[0]);
		int column_queen = Integer.parseInt(sNums2[1]);
		
		HashMap<Integer, ArrayList<Integer>> obstacles = new HashMap<>();
		
		System.out.println("Obstacle Positions");
		for(int i = 0; i < numOfObstacles; i++ ) {
			System.out.print("Obstacle: ");
			String sNums3[] = input.nextLine().split(" ");
			int r = Integer.parseInt(sNums3[0]);
			int c = Integer.parseInt(sNums3[1]);
			
			ArrayList<Integer> rowCols = obstacles.get(r);
			if(rowCols == null) {
				rowCols = new ArrayList<>();
				rowCols.add(c);
				obstacles.put(r, rowCols);
			}
			
			else {
				rowCols.add(c);
			}
			
		}
		
		System.out.println(queensAttack(boardSize, numOfObstacles, row_queen, column_queen, obstacles));
	}

}
