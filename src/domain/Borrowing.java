package domain;

import java.util.Date;
import java.util.ArrayList;

import javax.xml.datatype.Duration;

public class Borrowing {
	
	ArrayList<Book> books = new ArrayList<Book>();
	Date borrowingDate;
	
	public Borrowing(Date borrowingDate){
		setBorrowingDate(borrowingDate);
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

	public ArrayList<Book> getBooks() {
		return books;
	}
	public Date getBorrowingDate() {
		return borrowingDate;
	}

	
	public void borrowBooks(){
		
		ArrayList<Book> books = getBooks();
		
		for(Book book : books){
			book.setState(book.BORROWED);
			System.out.print("Livro " + book.getName() + " emprestado!");
			System.out.println();
		}

	}
	
	public void returnBook(Book book){
		
	}


}
