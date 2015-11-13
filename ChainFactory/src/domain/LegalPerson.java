package domain;

public class LegalPerson extends Person {
	
	String cnpj;
	
	public LegalPerson(String name, String cnpj){
		super(name);
		this.cnpj = cnpj;
	}
	
	public LegalPerson(String name){
		super(name);
	}
	
	public LegalPerson(){}

	public LegalPerson(LegalPerson legalPerson) {
		super(legalPerson.getName());
		this.cnpj = legalPerson.getCNPJ();
	}

	private String getCNPJ() {
		return this.cnpj;
	}

	public static Person getInstance() {
		
		Person instance;
		
		if(person != null){
			instance = person;
		}
		else{
			instance = new LegalPerson("Singleton Legal Person");
		}
		
		return instance;
	}

	@Override
	public Person clone() {
		
		return new LegalPerson(this);
		
	}

}
