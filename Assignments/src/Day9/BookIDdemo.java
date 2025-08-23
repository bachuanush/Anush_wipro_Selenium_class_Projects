package Day9;

import java.util.*;

class Book implements Comparable<Book> {
    private int bookId;
    private String title;

    public Book(int bookId, String title) {
        this.bookId = bookId;
        this.title = title;
    }

 
    public int getBookId() {
        return bookId;
    }

    public int compareTo(Book other) {
        return Integer.compare(other.bookId, this.bookId); 
    }

    public String toString() {
        return "Book{id=" + bookId + ", title='" + title + "'}";
    }
}
public class BookIDdemo {
	 public static void main(String[] args) {
	       
	        List<Book> books = new ArrayList<>();
	        books.add(new Book(103, "book1"));
	        books.add(new Book(101, "book2"));
	        books.add(new Book(104, "book3"));
	        
	        Collections.sort(books);
	        System.out.println("Books sorted by bookId in Desc order :");
	        for (Book book : books) {
	            System.out.println(book);
	        }
	    }
}
