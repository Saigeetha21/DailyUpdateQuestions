package feb22.methodoverload.com;

public class TypePromotion {
	void sum(int a,long b) {
		System.out.println(a+b);
	}
	void sum(int a,int b,int c) {
		System.out.println(a+b+c);
	}

	public static void main(String[] args) {
		TypePromotion t = new TypePromotion();
		t.sum(10,12); //now second int literal will be promoted to long
		t.sum(10,10,10);
		// TODO Auto-generated method stub

	}

}
