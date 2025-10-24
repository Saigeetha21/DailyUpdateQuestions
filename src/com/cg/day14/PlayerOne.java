package com.cg.day14;

public class PlayerOne {
	private String bowlerName;
    private int wicketCount;
    public PlayerOne(String bowlerName, int wicketCount) {
    	this.bowlerName = bowlerName;
    	this.wicketCount = wicketCount;
    }
    public String getBowlerName() {
    	return bowlerName;
    }
    public void setBowlerName(String bowlerName) {
    	this.bowlerName = bowlerName;
    }
    public int getWicketCount() {
    	return wicketCount;
    }
    public void setWicketCount(int wicketCount) {
    	this.wicketCount = wicketCount;
    }

}
