package mar5.Array.com;

public class PersonArray {
	private String name;
    public PersonArray(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

	public static void main(String[] args) {
		PersonArray[] people = new PersonArray[3];
		people[0] = new PersonArray("geetha");
		people[1] = new PersonArray("teja");
		people[2] = new PersonArray("kavya");

		// Accessing object properties
		for (PersonArray person : people) {
		    System.out.println("Name: " + person.getName());
		
		}
	}

}
