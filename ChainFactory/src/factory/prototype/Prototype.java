package factory.prototype;

import domain.CPF;
import domain.Individual;
import domain.Person;
import factory.PersonFactory;
import factory.builder.PersonBuilder;

public class Prototype extends PersonFactory {
	
	public Prototype(){
		setNextFactory(null);
	}

	@Override
	public Person create(String type, String name, CPF cpf) {
		return null;
	}

	@Override
	public Person create(String type, String name, String cnpj) {
		return null;
	}

	@Override
	public Person create(String name, String cpf, PersonBuilder personBuilder) {
		
		Person person = getNextFactory().create(name, cpf, personBuilder);
		
		return person;
	}	
	
	@Override
	public Person create(Person person) {
		
		Person newPerson = person.clone();
		
		return newPerson;
	}

	@Override
	public Person create(String type) {
		return null;
	}
	
}
