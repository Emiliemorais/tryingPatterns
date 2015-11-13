package factory;

import domain.CPF;
import domain.Person;
import factory.builder.PersonBuilder;

public abstract class PersonFactory {
	
	protected PersonFactory factory;
	
	// Factory Method
	public abstract Person create(String type, String name, CPF cpf);
	public abstract Person create(String type, String name, String cnpj);
	
	// Builder
	public abstract Person create(String name, String cpf, PersonBuilder personBuilder);
	
	// Prototype
	public abstract Person create(Person person);
	
	// Singleton
	public abstract Person create(String type);
	
	protected PersonFactory getNextFactory(){
		return this.factory;
	}
	
	protected void setNextFactory(PersonFactory factory){
		this.factory = factory;
	}
}
