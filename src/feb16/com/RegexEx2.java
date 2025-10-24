package feb16.com;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern p = Pattern.compile(".s");
		Matcher m = p.matcher("as");
		boolean b = m.matches();
		
		boolean b2 = Pattern.compile(".s").matcher("as").matches();
		
		System.out.println(b+ " "+b2);

	}

}
