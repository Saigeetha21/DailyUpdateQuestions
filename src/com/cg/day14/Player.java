package com.cg.day14;

public class Player {
	String name;
	String team;
	String skill;
	public String getName() {
		return name;
	}
	public void setName() {
		this.name = name;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam() {
		this.team = team;
	}
	public String getSkill() {
		return skill;
	}
	public Player(String name,String team, String skill) {
		super();
		this.name = name;
		this.team = team;
		this.skill =skill;
	}
	public Player() {
		super();
	}
	@Override
	public String toString() {
		return "Player [name=" + name + ", team=" + team + ", skill=" + skill + "]";
	}
	public String getBowlerName() {
		// TODO Auto-generated method stub
		return null;
	}
	public String getWicketCount() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
