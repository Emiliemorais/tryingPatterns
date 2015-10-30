package domain;

public class Student {

	Integer enrollment;
	String name;

	
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
