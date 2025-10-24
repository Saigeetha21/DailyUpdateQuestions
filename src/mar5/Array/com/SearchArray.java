package mar5.Array.com;

public class SearchArray {

	public static void main(String[] args) {
	 String names[] = {"geetha","sai","Anjali","anu","reshu","moni"};
	 String searchName="geetha";
	 boolean found = false;
	 for(String name:names) {
		 if(name.equals(searchName)) {
			 found = true;
			 break;
			 
		 }
	 }	
	 if(found) {
		 System.out.println("the search name is found " + searchName);
	 }
	 else {
		 System.out.println("The search name is not found" + searchName);
	 }
	}

}
