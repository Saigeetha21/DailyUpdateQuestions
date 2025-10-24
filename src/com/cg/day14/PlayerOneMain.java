package com.cg.day14;

import java.util.HashMap;
import java.util.Scanner;

public class PlayerOneMain {
	public static void main(String[] args) {
		HashMap<String,Player> players = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		boolean addAnotherPlayer = true;
		while(addAnotherPlayer) {
			System.out.println("enter the player name:");
			String playerName = sc.nextLine();
			System.out.println("Enter wickets- separated by \"|\" symbol.");
			String[] wickets = sc.nextLine().split("\\|");
			players.put(playerName, new PlayerOne(playerName,wickets.length));
			System.out.println("Do you want to add another player(yes/no)");
			addAnotherPlayer = sc.nextLine().equalsIgnoreCase("yes");
		}
		boolean searchAnotherPlayer = true;
		while(searchAnotherPlayer) {
			System.out.println("enter the player name to search");
			String playerName =sc.nextLine();
			if(players.containsKey(playerName)) {
				Player player = players.get(playerName);
				System.out.println("Player name :"+player.getBowlerName());
				System.out.println("Wicket Count:" +player.getWicketCount());
			}else {
				System.out.println("No player found with the name "+playerName);
			}
			System.out.println("Do you want to search another player(yes/no)");
			searchAnotherPlayer = sc.nextLine().equalsIgnoreCase("yes");
			
		}
	}

}
