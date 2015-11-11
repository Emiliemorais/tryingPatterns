package domain;

public class Individual extends Person {

	private CPF cpf;
	
	public Individual(String name, CPF cpf) {
		super(name);
		this.cpf = cpf;
	}

	public Individual(){}
	
	@Override
	public Person getInstance() {
			
		Person instance;
		
		if(person != null){
			instance = person;
		}
		else{
			instance = new Individual();
		}
		
		return instance;
	}
	
	public CPF getCpf() {
		return this.cpf;
	}
}
