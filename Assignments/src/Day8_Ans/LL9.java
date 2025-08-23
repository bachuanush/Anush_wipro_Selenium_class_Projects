package Day8_Ans;

import java.util.LinkedList;
class Book {
private int id;
private String title;
private String author;
public Book(int id, String title, String author) {
this.id = id;
this.title = title;
this.author = author;
}

public int getId() {
return id;
}
public String getTitle() {
return title;
}
public String getAuthor() {
return author;
}
@Override
public String toString() {
return "Book [ID=" + id + ", Title=" + title + ", Author=" + author + "]";
}
}
public class LL9 {
public static void main(String[] args) {
LinkedList<Book> bookList = new LinkedList<>();
bookList.add(new Book(101, "The Great Gatsby", "F. Scott Fitzgerald"));
bookList.add(new Book(102, "To Kill a Mockingbird", "Harper Lee"));
bookList.add(new Book(103, "1984", "George Orwell"));
System.out.println("Books in the LinkedList:");
for (Book book : bookList) {
System.out.println(book);
}
}
}
