package factory.factory_method;

import domain.CPF;
import domain.LegalPerson;
import domain.Person;


public class LegalPersonFactory extends FactoryMethod {

	@Override
	public Person create(String type, String name, CPF cpf) {
		
		Person person = getNextFactory().create(type, name, cpf);
		
		return person;
	}

	@Override
	public Person create(String type, String name, String cnpj) {
		
		Person person = new LegalPerson(name, cnpj);
		
		return person;
	}

	@Override
	public Person create(Person person) {
		
		Person newPerson = getNextFactory().create(person);
		
		return newPerson;
	}

	@Override
	public Person create(){
		
		Person person = getNextFactory().create();
		
		return person;
	}
}
