package domain;

import java.util.Date;
import java.util.ArrayList;

import observer.Observer;

public class Borrowing {
	
	private ArrayList<Book> books = new ArrayList<Book>();
	private ArrayList<Observer> observers = new ArrayList<Observer>();
	private Date borrowingDate;
	private Student student;
	
	public Borrowing(Student student, Date borrowingDate){
		setBorrowingDate(borrowingDate);
		setStudent(student);
	}
	
	private void setStudent(Student student){
		this.student = student;
		Observer observer = (Observer) student;
		this.observers.add(observer);
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
			book.setState(Book.BORROWED);
			
			System.out.print("Livro " + book.getName() + " emprestado para o estudante "+ this.student.getName() + "!");
			System.out.println();
		}
		notifyObserversOfBorrowing();
	}
	
	private void notifyObserversOfBorrowing() {
		
		for(Observer observer : observers){
			((Student) observer).newBorrowing(this);
		}
	}

	public void returnBooks(){
		
		for(Book book : books){
			book.setState(Book.AVAILABLE);
			
			System.out.print("Livro " + book.getName() + " devolvido pelo estudante "+ this.student.getName() + "!");
			System.out.println();
		}
		notifyObserversOfReturning();
	}
	
	public void notifyObserversOfReturning(){
		
		for(Observer observer : observers){
			((Student) observer).endBorrowing(this);
		}
	}
}
