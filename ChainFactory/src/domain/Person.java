package domain;

public abstract class Person {
	
	private String name;
	
	protected static Person person = null;
	
	public Person(String name){
		
		this.name = name;
	}
	
	public Person(){}
	
	public String getName() {
		return this.name;
	}
	
	public abstract Person clone();
}
