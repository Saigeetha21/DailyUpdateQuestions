package com.cg.day8;

public class Casestudy {

	public static void main(String[] args) {
		String [][] data= {
				{"EMPNO", "EMPNAME", "JOINING_DATE" , "DESIGNATION","DEPT", "BASIC","HRA","IT"},
				{"100","AJAY","01/04/2009","E","R&D","2000","8000","3000"},
				{"101","Sammer","23/08/2012","C","PM","3000","12000","9000"},
				{"102","Soumya","12/11/2008","K","ACCT","10000","8000", "1000"},
				{"103","Kunal","16/07/1009","m","ENGG","5000","2000","2000"}
		};
		String [][] d= {{"Designation_Code", "Designation", "DA"},
				{"e",              "Engineer",     "20000"},
				{"c",              "Consultant",   "32000"},
				{"k",              "Clerk",        "2000"},
				{"m",              "Manager",      "40000"}
		};
		int salary=0;
		int e=Integer.parseInt(args[0]);
		String dse=" ";
		 for(int i=1; i<data.length; i++) {
			 int s = Integer.parseInt(data[i][0]);
			 if(s==e)
			 {
				 dse=data[i][3];
				 for(int j=5; j<data[i].length; j++) {
			   int n= Integer.parseInt(data[i][j]);
			   salary = salary+n;
				 }
			 }
			 
		 }
		 
		 
		            for(int k=1; k<d.length; k++) {
		            	if(dse==d[k][0]) {
		            		int m = Integer.parseInt(d[k][2]);
		            		salary = salary+m;
		            	}
		            	
		            }
		            
		            System.out.println(salary);

	}

}
