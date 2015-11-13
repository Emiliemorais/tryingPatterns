package factory.singleton;

import domain.CPF;
import domain.Individual;
import domain.LegalPerson;
import domain.Person;
import factory.PersonFactory;
import factory.builder.PersonBuilder;
import factory.prototype.Prototype;

public class Singleton extends PersonFactory {

	public Singleton(){
		setNextFactory(new Prototype());
	}

	@Override
	public Person create(String type, String name, CPF cpf) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Person create(String type, String name, String cnpj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Person create(String name, String cpf,PersonBuilder personBuilder) {
		
		Person person = getNextFactory().create(name, cpf, personBuilder);
		
		return person;
	}	
	
	@Override
	public Person create(Person person) {
		
		Person newPerson = getNextFactory().create(person);
		
		return newPerson;
	}

	@Override
	public Person create(String type){
		
		Person person;
		
		if(type == "individual"){
			person = Individual.getInstance();
		}
		else{
			person = LegalPerson.getInstance();
		}
		
		return person;
	}
}
