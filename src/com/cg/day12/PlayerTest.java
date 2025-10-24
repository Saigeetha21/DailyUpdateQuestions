package com.cg.day12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class PlayerTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Player> al = new ArrayList<Player>();
		System.out.println("Enter the team");
		int n=sc.nextInt();
		
		
		for(int i =0; i<n;i++) {
			System.out.println("Enter "+(i+1)+" Team");
			System.out.println("Enter the name of the team");
			String tname = sc.next();
			System.out.println("Enter the no of matches played");
			int m = sc.nextInt();
			Player p = new Player(tname, m);
			al.add(p);
			
		}
		Collections.sort(al);
		
		for(Player p :al)
			System.out.println(p);
		
	}

}
