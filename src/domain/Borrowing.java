package domain;

import java.util.Date;
import java.util.ArrayList;

import javax.xml.datatype.Duration;

public class Borrowing {
	
	// In days
	private static final Integer BORROWING_DURATION = 10;
	
	ArrayList<Book> books;
	Date borrowingDate;
	Date returnDate;	
	
	public Borrowing(Date borrowingDate){
		setBorrowingDate(borrowingDate);
		
		borrowingDate.
		
		setReturnDate(borrowingDate); 
	}
	
	public void addBook(Book book){
		this.books.add(book);
	}
	
	private void setBooks(ArrayList<Book> books) {
		this.books = books;
	}
	private void setBorrowingDate(Date borrowingDate) {
		this.borrowingDate = borrowingDate;
	}
	private void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}
	
	public ArrayList<Book> getBooks() {
		return books;
	}
	public Date getBorrowingDate() {
		return borrowingDate;
	}

	public Date getReturnDate() {
		return returnDate;
	}
	
	public void borrowBook(Book book){
		
	}
	
	public void returnBook(Book book){
		
	}


}
