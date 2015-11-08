package domain;

public class Fries extends Item {
	
	private static final String LITTLE_SIZE = "P";
	private static final String MEDIUM_SIZE = "M";
	private static final String LARGE_SIZE = "G";
	private static final Integer LITTLE_FRIES_PRICE = 5;
	private static final Integer MEDIUM_FRIES_PRICE = 7;
	private static final Integer LARGE_FRIES_PRICE = 10;
	
	private String size;
	
	private Fries(Fries friePrototype){
		
		setId(friePrototype.getId());
		setName(friePrototype.getName());
		setPrice(friePrototype.getPrice());
		setSize(friePrototype.getSize());
	}
	
	public Fries(int id, String name, Integer price, String size){
		
		setId(id);
		setName(name);
		setPrice(price);
		setSize(size);
	}

	@Override
	public Fries clone(){
		
		Fries fries = new Fries(this);
		
		return fries;
	}

	public void setLittleSize(){
		setSize(LITTLE_SIZE);
		setPrice(LITTLE_FRIES_PRICE);
	}
	
	public void setMediumSize(){
		setSize(MEDIUM_SIZE);
		setPrice(MEDIUM_FRIES_PRICE);
	}
	
	public void setLargeSize(){
		setSize(LARGE_SIZE);
		setPrice(LARGE_FRIES_PRICE);
	}
	
	public String getSize() {
		return size;
	}

	private void setSize(String size){
		this.size = size;
	}

	@Override
	protected String getDescription(){
		
		String description = getName() + " (" + getSize() + ") - R$ " + getPrice();  
		
		return description;
	}
}
