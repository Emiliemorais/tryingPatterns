package factory.prototype;

import domain.CPF;
import domain.Person;
import factory.PersonFactory;

public class Prototype extends PersonFactory {
	
	public Prototype(){
		setNextFactory(null);
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
	public Person create(Person person) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Person create() {
		// TODO Auto-generated method stub
		return null;
	}

}
