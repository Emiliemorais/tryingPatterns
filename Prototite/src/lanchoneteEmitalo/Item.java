package lanchoneteEmitalo;

public abstract class Item {

	private int id;
	private String name;
	private Integer price;
	
	public int getId() {
		return id;
	}
	
	protected void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	protected void setName(String name) {
		this.name = name;
	}
	
	public int getPrice() {
		return price;
	}
	
	protected void setPrice(int price) {
		this.price = price;
	}
	
	protected abstract String getDescription();
	
	public abstract Item clone();
}
