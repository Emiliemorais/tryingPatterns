import domain.CPF;
import domain.CPFException;
import domain.Person;
import factory.PersonFactory;
import factory.factory_method.IndividualFactory;

public class PersonCreationRequest {

	public static void main(String[] args) throws CPFException {
		
		PersonFactory personFactory = new IndividualFactory();
		
		Person person = personFactory.create("factory", "Ítalo Paiva", new CPF("00240137140"));
		
		System.out.println(person.getName());
	}
}
