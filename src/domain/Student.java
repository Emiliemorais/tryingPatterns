package domain;

import java.util.ArrayList;

import observer.Observer;

public class Student extends Observer{

	private Integer enrollment;
	private String name;
	private ArrayList<Borrowing> borrowings = new ArrayList<Borrowing>();
	
	public Student(Integer enrollment, String name){
		setEnrollment(enrollment);
		setName(name);
	}
	
	private void setEnrollment(Integer enrollment) {
		this.enrollment = enrollment;
	}
	
	private void setName(String name) {
		this.name = name;
	}
	
	public Integer getEnrollment() {
		return enrollment;
	}
	
	public String getName() {
		return name;
	}

	@Override
	public void newBorrowing(Borrowing borrowing) {
		this.borrowings.add(borrowing);
		sendEmail("Um email com os dados do empréstimo foi enviado.");
	}	

	@Override
	public void endBorrowing(Borrowing borrowing) {
		this.borrowings.remove(borrowing);
		sendEmail("Um email confirmando a devolução foi enviado.");
	}
	
	private void sendEmail(String message){
		System.out.println();
		System.out.println(message);
		System.out.println();
	}
}
