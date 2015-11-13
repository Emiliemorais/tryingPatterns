package factory.builder;

import domain.CPF;
import domain.Person;
import factory.PersonFactory;
import factory.singleton.Singleton;

public class Builder extends PersonFactory {
	
	private String name;
	private String cpf;
	
	public Builder(){
		setNextFactory(new Singleton());
	}

	@Override
	public Person create(String name, String cpf, PersonBuilder personBuilder) {
		
		personBuilder.buildName(name);
		personBuilder.buildCPF(cpf);
		
		Person person = personBuilder.getPerson();
		
		return person;
	}
	
	@Override
	public Person create(String type, String name, CPF cpf) {
		
		Person person = getNextFactory().create(type, name, cpf);
		
		return person;
	}

	@Override
	public Person create(String type, String name, String cnpj) {
		
		Person person = getNextFactory().create(type, name, cnpj);
		
		return person;
	}

	@Override
	public Person create(Person person){
		
		Person newPerson = getNextFactory().create(person);
		
		return newPerson;
	}

	@Override
	public Person create(String type){
		
		Person person = getNextFactory().create(type);
		
		return person;
	}

	public String getName() {
		return name;
	}

	public String getCpf() {
		return cpf;
	}
}
