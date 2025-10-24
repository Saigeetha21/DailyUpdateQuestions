package com.cg.day12;

public class Player implements Comparable<Player> {
	String name;
	int matches;
	public Player() {
		super();
	}
	
	public Player(String name, int matches) {
		super();
		this.name = name;
		this.matches = matches;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMatches() {
		return matches;
	}
	public void setMatches(int matches) {
		this.matches = matches;
	}

	@Override
	public String toString() {
		return "Player [name=" + name + ", matches=" + matches + "]";
	}
	public int compareTo(Player p) {
		if(this.matches == p.getMatches())
			return 0;
		else if(this.matches>p.getMatches())
			return 1;
		else 
			return -1;
	}

}
