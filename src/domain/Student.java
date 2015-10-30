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
	public void update(Borrowing borrowing) {
		this.borrowings.add(borrowing);
		sendEmail();
	}	
	
	private void sendEmail() {
		System.out.print("Um email com os dados do empréstimo foi enviado.");
	}	
}
