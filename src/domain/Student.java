package domain;

public class Student {

	private Integer enrollment;
	private String name;
	
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
}
