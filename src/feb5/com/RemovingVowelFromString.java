package feb5.com;

import java.util.Scanner;

public class RemovingVowelFromString {
	
	public static String removeEvenElements(String s1) {
		StringBuffer sb1 = new StringBuffer();
		for(int i =0;i<s1.length();i++) {
			char k =s1.charAt(i);
			if((i+1)%2!=0) {
				sb1.append(k);
			}
			else {
				if(k!='a'&&k!='e'&&k!='i'&&k!='o'&&k!='u'&&k!='A'&&k!='E'&&k!='I'&&k!='O'&&k!='U') {
					sb1.append(k);
				}
			}
		}
		return sb1.toString();
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s1 = in.nextLine();
		System.out.println(removeEvenElements(s1));
		in.close();
	}

}
