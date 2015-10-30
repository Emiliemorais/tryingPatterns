import java.util.Date;

import domain.Book;
import domain.Borrowing;


public class Library {
	
	public static void main(String[] args) {
		
		Book book = new Book(1, "Dom Casmurro", 0);
		Book book2 = new Book(2, "Cinco minutos e a viuvinha", 0);
				
		Date borrowingDate = new Date(2015, 10, 30);
		Borrowing borrowing = new Borrowing(borrowingDate);
		borrowing.addBook(book);
		borrowing.addBook(book2);
		
		// Borrowing the requested books
		Invoker invoker = new Invoker();
		invoker.makeBorrowing(borrowing);
	}
}
