package feb20.com;

class Book {
    String title;
    String author;
    int pages;

    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    public void displayInfo() {
        System.out.println("Title: " + title + ", Author: " + author + ", Pages: " + pages);
    }
}

class Novel extends Book {
    String genre;

    public Novel(String title, String author, int pages, String genre) {
        super(title, author, pages);
        this.genre = genre;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Genre: " + genre);
    }
}

class Textbook extends Book {
    String subject;

    public Textbook(String title, String author, int pages, String subject) {
        super(title, author, pages);
        this.subject = subject;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Subject: " + subject);
    }
}

public class BookTest {
    public static void main(String[] args) {
        Novel novel = new Novel("To Kill a Mockingbird", "Harper Lee", 281, "Fiction");
        novel.displayInfo();

        Textbook textbook = new Textbook("Introduction to Java Programming", "Daniel Liang", 1234, "Computer Science");
        textbook.displayInfo();
    }
}
