package com.cg.intef;

interface Language{
	void getName(String name);
}

public class ProgrammingLanguage implements Language{
	public void getName(String name) {
		System.out.println("Programming language");
	}

}
class Test{
	public static void main(String[] args) {
		ProgrammingLanguage language = new ProgrammingLanguage();
		language.getName("java");
	}
}
