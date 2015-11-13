package factory.factory_method;

import domain.CPF;
import domain.Individual;
import domain.Person;
import factory.builder.PersonBuilder;

public class IndividualFactory extends FactoryMethod {

	private PersonBuilder personBuilder;
	private PersonBuilder personBuilder2;

	@Override
	public Person create(String type, String name, CPF cpf) {
		
		Person person;
		
		if(type == "factory"){
			person = new Individual(name, cpf);
		}
		else{
			person = getNextFactory().create(type, name, cpf);
		}
		
		return person;
	}

	@Override
	public Person create(String type, String name, String cnpj) {
		
		Person person = getNextFactory().create(type, name, cnpj);
		
		return person;
	}

	@Override
	public Person create(Person person) {
		
		Person newPerson = getNextFactory().create(person);
		
		return newPerson;
	}

	@Override
	public Person create(String type){
		
		Person person = getNextFactory().create(type);
		
		return person;
	}

	@Override
	public Person create(String name, String cpf, PersonBuilder personBuilder) {
		
		Person person = getNextFactory().create(name, cpf, personBuilder);
		
		return person;
	}	
}
