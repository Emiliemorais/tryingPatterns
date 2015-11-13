package factory.builder;

import domain.CPF;
import domain.Person;

public abstract class PersonBuilder {
	
	protected String name;
	protected CPF cpf;
	
	public abstract void buildName(String name);
	public abstract void buildCPF(String cpf);
	
	public abstract Person getPerson();
}
