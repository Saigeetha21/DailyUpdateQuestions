package feb20.com;

class Employee{  
	 float salary=40000;  
	} 


	public class EmployeeTest extends Employee{  
	 int bonus=10000;  
	 public static void main(String args[]){  
	   EmployeeTest p=new EmployeeTest();  
	   System.out.println("Programmer salary is:"+p.salary);  
	   System.out.println("Bonus of Programmer is:"+p.bonus);  
	}  
	}  