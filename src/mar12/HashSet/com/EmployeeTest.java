package mar12.HashSet.com;

import java.util.HashSet;

public class EmployeeTest {
	String name;
	String dept;
	int num;
	

	public EmployeeTest(String name, String dept, int num) {
		super();
		this.name = name;
		this.dept = dept;
		this.num = num;
	}


	public static void main(String[] args) {
		HashSet<EmployeeTest> emp = new HashSet<EmployeeTest>();
		EmployeeTest e1 = new EmployeeTest("geetha","ece",9090);
		EmployeeTest e2 = new EmployeeTest("teja","cse",8089);
		EmployeeTest e3 = new EmployeeTest("sahasra","civil",9000);
	    emp.add(e1);
	    emp.add(e2);
	    emp.add(e3);
		
		for(EmployeeTest e :emp)
			System.out.println(e.name+" "+e.dept+" "+e.num);
		
			
		

	}

}
