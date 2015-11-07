package lanchoneteEmitalo;

public class Drink extends Item {
	
	public static final String LITTLE_SIZE = "300ml";
	public static final String MEDIUM_SIZE = "500ml";
	public static final String LARGE_SIZE = "700ml";
	public static final Integer LITTLE_DRINK_PRICE = 4;
	public static final Integer MEDIUM_DRINK_PRICE = 6;
	public static final Integer LARGE_DRINK_PRICE = 8;
	public static final String COKE_FLAVOR = "Coca-cola";
	public static final String SPRITE_FLAVOR = "Sprite";
	
	private String size;
	private String flavor;
	
	private Drink(Drink drinkPrototype){
		
		setId(drinkPrototype.getId());
		setName(drinkPrototype.getName());
		setPrice(drinkPrototype.getPrice());
		setSize(drinkPrototype.getSize());
		setFlavor(drinkPrototype.getFlavor());
	}
	
	public Drink(int id, String name, Integer price, String size, String flavor){
		
		setId(id);
		setName(name);
		setPrice(price);
		setSize(size);
		setFlavor(flavor);
	}

	@Override
	public Drink clone(){
		
		Drink drink = new Drink(this);
		
		return drink;
	}

	public void setLittleSize(){
		setSize(LITTLE_SIZE);
		setPrice(LITTLE_DRINK_PRICE);
	}
	
	public void setMediumSize(){
		setSize(MEDIUM_SIZE);
		setPrice(MEDIUM_DRINK_PRICE);
	}
	
	public void setLargeSize(){
		setSize(LARGE_SIZE);
		setPrice(LARGE_DRINK_PRICE);
	}
	
	public void setCokeFlavor(){
		setFlavor(COKE_FLAVOR);
	}

	public void setSpriteFlavor(){
		setFlavor(SPRITE_FLAVOR);
	}

	public String getFlavor() {
		return flavor;
	}

	private void setFlavor(String flavor){
		this.flavor = flavor;
	}

	
	public String getSize() {
		return size;
	}

	private void setSize(String size){
		this.size = size;
	}

	@Override
	protected String getDescription(){
		
		String description = getFlavor() + " (" + getSize() + ") - R$ " + getPrice();  
		
		return description;
	}
}
