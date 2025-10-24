package mar7.ArrayList.com;

import java.util.ArrayList;
import java.util.List;

public class Book {
	private String name;
	private int id;
	private int pages;
	
	
	
	public Book(String name, int id, int pages) {
		super();
		this.name = name;
		this.id = id;
		this.pages = pages;
	}



	public static void main(String args[]) {
		List<Book> b = new ArrayList<Book>();
		Book b1 = new Book("geetha",1,10);
		Book b2 = new Book("teja",6,60);
		Book b3 = new Book("Sahasra",9,19);
		b.add(b1);
		b.add(b2);
		b.add(b3);
		for(Book list:b)
			System.out.println(list.name+" "+list.id+" "+list.pages);
	}

}
