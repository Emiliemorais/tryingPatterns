package factory;

import domain.CPF;
import domain.Person;

public abstract class PersonFactory {
	
	protected PersonFactory factory;
	
	public abstract Person create(String type, String name, CPF cpf);
	public abstract Person create(String type, String name, String cnpj);
	public abstract Person create(Person person);
	public abstract Person create();
	
	protected PersonFactory getNextFactory(){
		return this.factory;
	}
	
	protected void setNextFactory(PersonFactory factory){
		this.factory = factory;
	}
}
