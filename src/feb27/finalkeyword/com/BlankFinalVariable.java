package feb27.finalkeyword.com;

//we can initialize blank final variable only in constructor only
public class BlankFinalVariable {
	final int speedlimit;
	
	BlankFinalVariable(){
	speedlimit =10;
	System.out.println("The speed limit "+speedlimit);
	
	}
	public static void main(String[] args) {
		new BlankFinalVariable();
		
	}

}
