package factory.builder;

import domain.CPF;
import domain.CPFException;
import domain.Individual;
import domain.Person;

public class IndividualPersonBuilder extends PersonBuilder {

	@Override
	public void buildName(String name) {
		this.name = name;
	}

	@Override
	public void buildCPF(String cpf) {
		try {
			this.cpf = new CPF (cpf);
		} 
		catch (CPFException e) {
			e.printStackTrace();
		}
	}

	@Override
	public Person getPerson() {
		
		Person person = new Individual(name,cpf);
		
		return person;
	}

}
