import java.util.ArrayList;

import command.BorrowCommand;
import domain.Book;
import domain.Borrowing;


public class Library {

	public static void main(String[] args) {
		

		Book book = new Book(1, "Dom Casmurro", 0);
		Book book2 = new Book(2, "Cinco minutos e a viuvinha", 0);
				
		Borrowing borrowing = new Borrowing();
		borrowing.addBook(book);
		borrowing.addBook(book2);
		
		
	
	}

}
