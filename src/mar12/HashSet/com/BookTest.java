package mar12.HashSet.com;

import java.util.HashSet;

class BookTest{
	private String name;
	private int age;
	private int pages;
	public BookTest(String name, int age, int pages) {
		super();
		this.name = name;
		this.age = age;
		this.pages = pages;
	}
	
	



	public static void main(String[] args) {
		HashSet<BookTest> set = new HashSet<BookTest>();
		BookTest b1 = new BookTest("geetha",21,180);
		BookTest b2 = new BookTest("teja",19,100);
		BookTest b3 = new BookTest("sahasra",22,299);
		set.add(b1);
		set.add(b2);
		set.add(b3);
		for(BookTest b:set) {
			System.out.println(b.name+" "+ b.age +" "+b.pages);
		
		}
		

	}
	
	

}
