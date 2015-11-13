import domain.CPF;
import domain.CPFException;
import domain.Person;
import factory.PersonFactory;
import factory.builder.IndividualPersonBuilder;
import factory.factory_method.IndividualFactory;

public class PersonCreationRequest {

	public static void main(String[] args) throws CPFException {
		
		PersonFactory personFactory = new IndividualFactory();
		
		// Creating using factory method
		Person person = personFactory.create("factory", "Ítalo Paiva", new CPF("00240137140"));
		System.out.println(person.getName());
		
		// Creating using singleton
		person = personFactory.create("individual");
		System.out.println(person.getName());
		
		person = personFactory.create("legalperson");
		System.out.println(person.getName());
		
		// Creating using prototype
		person = personFactory.create(person);
		System.out.println(person.getName());
		
		// Creating using builder
		person = personFactory.create("Emilie Morais", "03382132109", new IndividualPersonBuilder());
		System.out.println(person.getName());
		
		// Creating using prototype
		person = personFactory.create(person);
		System.out.println(person.getName());
	}
}
