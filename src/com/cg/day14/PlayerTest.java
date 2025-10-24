package com.cg.day14;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class PlayerTest {
	public static void main(String[] args) {
		Player p;
		Scanner sc = new Scanner(System.in);
		TreeMap<String,Player> t = new TreeMap<>();
		
		System.out.println("Enter total players");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			System.out.println("enter total players");
			String capNumber = sc.next();
			String name = sc.next();
			String skill = sc.next();
			String team = sc.next();
			
			t.put(capNumber, new Player(name,skill,team));
		}
		System.out.println("Player Details");
		for(Map.Entry<String,Player> m :t.entrySet()) {
			Player p1 = m.getValue();
			System.out.println(m.getKey()+" --"+p1.getName()+"--"+p1.getSkill()+"--"+p1.getTeam());
		}
		
	}

}
