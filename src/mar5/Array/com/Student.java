package mar5.Array.com;

public class Student {
	private String name;
	private int age;
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	
    public static void main(String[] args) {
    	
    
	Student students[] = new Student[3];
	students[0] = new Student("geetha",20);
	students[1] = new Student("teja",19);
	students[2] = new Student("sai",10);
	
	for(int i=0;i<students.length;i++)
	   System.out.println("students"+ (i + 1)+":name="+students[i].getName()+",age="+students[i].getAge());
}

}
