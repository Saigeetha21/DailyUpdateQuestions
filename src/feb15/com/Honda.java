package feb15.com;

abstract class Bikes{  
	  abstract void run();  
	}  
	class Honda extends Bikes{  
	void run(){System.out.println("running safely");}  
	public static void main(String args[]){  
	 Honda h = new Honda();  
	 h.run();  
	}  
	}  

