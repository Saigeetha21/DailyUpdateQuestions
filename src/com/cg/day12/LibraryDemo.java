package com.cg.day12;

public class LibraryDemo {
	public static void main(String[] args) {
		Person[] persons = new Person[] {
				
		};
		int[] books = getBooksIssued(persons);
		int avgBooks=findAvgBookIssued(books);
		System.out.println("the average number of books issued by library member is:"+avgBooks);
		
	}
	private static int[] getBooksIssued(Person[] persons) {
		int[] books = new int[persons.length];
		for(int i=0;i<persons.length;i++) {
			books[i] = persons[i].getBookIssued();
			
		}
		return books;
	}
	private static int findAvgBookIssued(int[] books) {
		int totalBooks =0;
		for(int book:books) {
			totalBooks+=book;
		}
		int avgBooks = totalBooks/books.length;
		return avgBooks;
	}

}
