package domain;

import java.util.Date;
import java.util.ArrayList;

import javax.xml.datatype.Duration;

public class Borrowing {
	
	private ArrayList<Book> books = new ArrayList<Book>();
	private Date borrowingDate;
	private Student student;
	
	public Borrowing(Student student, Date borrowingDate){
		setBorrowingDate(borrowingDate);
		setStudent(student);
	}
	
	private void setStudent(Student student){
		this.student = student;
	}
	
	public Student getStudent(){
		return this.student;
	}
	
	public void addBook(Book book){
		this.books.add(book);
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
			System.out.print("Livro " + book.getName() + " emprestado para o estudante "+ this.student.getName() + "!");
			System.out.println();
		}
	}
	
	public void returnBook(Book book){
		
	}


}
