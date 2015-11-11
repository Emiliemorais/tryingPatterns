package domain;

public class LegalPerson extends Person {
	
	String cnpj;
	
	public LegalPerson(String name, String cnpj){
		super(name);
		this.cnpj = cnpj;
	}
	
	public LegalPerson(){}

	@Override
	public Person getInstance() {
		
		Person instance;
		
		if(person != null){
			instance = person;
		}
		else{
			instance = new LegalPerson();
		}
		
		return instance;
	}

}
