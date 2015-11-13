package domain;

public class Individual extends Person {

	private CPF cpf;
	
	public Individual(String name, CPF cpf) {
		super(name);
		this.cpf = cpf;
	}
	
	public Individual(String name) {
		super(name);
	}

	private Individual(Individual individual) {
		super(individual.getName());
		this.cpf = individual.getCpf();
	}
	
	public Individual(){}
	
	public static Person getInstance() {
			
		Person instance;
		
		if(person != null){
			instance = person;
		}
		else{
			instance = new Individual("Singleton Individual Person");
		}
		
		return instance;
	}
	
	public CPF getCpf() {
		return this.cpf;
	}

	@Override
	public Person clone() {
		return new Individual(this);
	}
}
