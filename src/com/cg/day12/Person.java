package com.cg.day12;

public class Person {
	private int id;
	private String name;
	private int bookIssued;
	public Person(int id, String name, int bookIssued) {
		super();
		this.id = id;
		this.name = name;
		this.bookIssued = bookIssued;
		
		
		
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getBookIssued() {
		return bookIssued;
	}

}
