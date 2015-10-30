package command;

import java.util.ArrayList;

import domain.Book;
import domain.Borrowing;

public class BorrowCommand extends Command {

	Borrowing borrowing;
	
	public BorrowCommand(Borrowing borrowing) {
		this.borrowing = borrowing;
	}
	
	@Override
	public void execute() {
		ArrayList<Book> books = borrowing.getBooks();
		
		for(Book book : books){
			borrowing.borrowBook(book);
		}
		
	}

	@Override
	public void undo() {
		ArrayList<Book> books = borrowing.getBooks();
		
		for(Book book : books){
			borrowing.returnBook(book);
		}
				

	}

}
