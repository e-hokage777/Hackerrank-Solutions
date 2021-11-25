package Challenges;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

class Checker implements Comparator<Player>{

	@Override
	public int compare(Player o1, Player o2) {
		Integer player1Score = o1.score;
		Integer player2Score = o2.score;
		
		if(player1Score != player2Score) 
			return -player1Score.compareTo(player2Score);
		else
			return o1.name.compareTo(o2.name);
	}
	
}

class Player {
	String name;
	int score;
	
	Player(String name, int score){
		this.name = name;
		this.score = score;
	}
	
	public String toString() {
		return this.name + " " + this.score;
	}
}

public class JavaComparator {
	
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		ArrayList<Player> players = new ArrayList<Player>();
		System.out.print("Number of Players: ");
		int num = Integer.parseInt(input.nextLine());
		
		for(int i = 0 ; i < num; i++) {
			System.out.print("Name and Score: ");
			String playerDetails[] = input.nextLine().trim().split(" ");
			Player player = new Player(playerDetails[0], Integer.parseInt(playerDetails[1]));
			players.add(player);
		}
		
		players.sort(new Checker());
		
		for(Player p : players) {
			System.out.println(p);
		}
	}

}
