package feb22.methodoverload.com;
//if there are matching type arguments in the method, type promotion is not performed.
public class TypePromotion1 {
	void sum(int a,int b) {
		System.out.println("int arg method invoked");
	}
	void sum(long a,long b) {
		System.out.println("long arg method invoked");
	}

	public static void main(String[] args) {
		//Since 20 is of type int, Java chooses the sum method that accepts two int parameters.

		TypePromotion1 t1 = new TypePromotion1();
		t1.sum(20,20);
		//if you are taking long as (20l,20l)then only long printed
		// TODO Auto-generated method stub

	}

}
