package factory.singleton;

import domain.CPF;
import domain.Person;
import factory.PersonFactory;
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
