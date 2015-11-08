package domain;

import bridge.ItemImplementor;

public abstract class Item {

	private int id;
	private String name;
	private Integer price;
	protected ItemImplementor itemImplementor;
	
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
	
	public ItemImplementor getItemImplementor() {
		return itemImplementor;
	}

	protected void setItemImplementor(ItemImplementor itemImplementor) {
		this.itemImplementor = itemImplementor;
	}

	protected abstract String getDescription();
	
	public abstract Item clone();
}
