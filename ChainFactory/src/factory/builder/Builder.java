package factory.builder;

import domain.CPF;
import domain.Person;
import factory.PersonFactory;
import factory.singleton.Singleton;

public class Builder extends PersonFactory {
	
	public Builder(){
		setNextFactory(new Singleton());
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
	public Person create(Person person){
		
		return null;
	}

	@Override
	public Person create(){
		// TODO Auto-generated method stub
		return null;
	}


}
