package feb28.runtimepoly.com;

class Bikes{  
	 int speedlimit=90;  
	}  
	class Honda3 extends Bikes{  
	 int speedlimit=150;  
	  
	 public static void main(String args[]){  
	  Bikes obj=new Honda3();  
	  System.out.println(obj.speedlimit);//90  
	}  
}