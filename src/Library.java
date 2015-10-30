import java.util.Date;

import domain.Book;
import domain.Borrowing;
import domain.Student;


public class Library {
	
	public static void main(String[] args) {
		
		Student student = new Student(130010765, "Juninho");
					
		Date borrowingDate = new Date(2015, 10, 30);
		Borrowing borrowing = new Borrowing(student, borrowingDate);
		
		Book book = new Book(1, "Dom Casmurro", 0);
		Book book2 = new Book(2, "Cinco minutos e a viuvinha", 0);
		
		borrowing.addBook(book);
		borrowing.addBook(book2);
		
		// Borrowing the requested books
		Invoker invoker = new Invoker();
		invoker.makeBorrowing(borrowing);
	}
}
