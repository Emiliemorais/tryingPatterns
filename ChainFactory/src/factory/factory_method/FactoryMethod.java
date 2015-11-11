package factory.factory_method;

import factory.PersonFactory;
import factory.builder.Builder;

public abstract class FactoryMethod extends PersonFactory{
	
	public FactoryMethod(){
		setNextFactory(new Builder());
	}
	
}
