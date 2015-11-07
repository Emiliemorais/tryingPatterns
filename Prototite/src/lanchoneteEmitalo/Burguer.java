package lanchoneteEmitalo;

public class Burguer extends Item {

	public static final String CHICKEN_MEAT = "Frango";
	public static final String COW_MEAT = "Carne";
	private String meat;
	
	public Burguer(int id, String name, Integer price, String meat) {
		
		setId(id);
		setName(name);
		setPrice(price);
		setMeat(meat);

	}

	public Burguer(Burguer burguerPrototype) {
		setId(burguerPrototype.getId());
		setName(burguerPrototype.getName());
		setPrice(burguerPrototype.getPrice());
		setMeat(burguerPrototype.getMeat());
	}

	public String getMeat() {
		return this.meat;
	}

	private void setMeat(String meat) {
		this.meat = meat;
	}
	
	public void setChickenMeat(){
		setMeat(CHICKEN_MEAT);
	}

	public void setCowMeat(){
		setMeat(COW_MEAT);
	}

	@Override
	protected String getDescription() {
		
		String description = getName() + " de " + getMeat() + " - R$ " + getPrice();  
		
		return description;
	}

	@Override
	public Burguer clone() {
		
		Burguer burguer = new Burguer(this);
		
		return burguer;
	}

}
