package com.cg;

public class Student {
	private int rno;
	private String name;
	private double sub1;
	private double sub2;
	private double sub3;
	public double total() {
		return sub1+sub2+sub3;
	}
	public double avg() {
		return (sub1+sub2+sub3)/3;
	}
	public int getRno() {
		return rno;
	}
	public void setRno(int rno) {
		this.rno = rno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSub1() {
		return sub1;
	}
	public void setSub1(double sub1) {
		this.sub1 = sub1;
	}
	public double getSub2() {
		return sub2;
	}
	public void setSub2(double sub2) {
		this.sub2=sub2;
	}
	public double getSub3() {
		return sub3;
	}
	public void setSub3(double sub3) {
		this.sub3=sub3;
	}
	
	public static void main(String args[]) {
		Student s = new Student();
		s.setRno(100);
		s.setName("geetha");
		s.setSub1(60);
		s.setSub2(90);
		s.setSub3(80);
		
		int rno =s.getRno();
		String name = s.getName();
		double sub1 = s.getSub1();
		double sub2 = s.getSub2();
		double sub3 = s.getSub3();
		System.out.println("student roll no:"+rno);
		System.out.println("student name"+name);
		System.out.println("student sub1"+sub1);
		System.out.println("student sub2"+sub2);
		System.out.println("student sub3"+sub3);
		System.out.println("student total:"+sub1+sub2+sub3);
		System.out.println("student avg:"+(sub1+sub2+sub3)/3);
		if((sub1+sub2+sub3)/3<=50) {
			System.out.println("the student is fail");
		}
		else if((sub1+sub2+sub3)/3>=60) {
			System.out.println("the student is first class");
		}
		else if((sub1+sub2+sub3)/3>=70) {
			System.out.println("the student is second class");
		}
		
		
	}

}
