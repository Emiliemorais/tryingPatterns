package lanchoneteEmitalo;

import java.util.ArrayList;

public class Order {

	private Integer value = 0;
	private ArrayList<Item> items = new ArrayList<Item>();
	
	public void addItem(Item item){
		items.add(item);
		setValue(this.value + item.getPrice());
	}
	
	public void removeItem(Item item){
		items.remove(item);
	}
	
	public void finalizeOrder(){
		System.out.println("\t\t\t\t Itens do pedido");

		listItems();

		System.out.println("\t\t\t\t Valor total: R$ " + getValue());

	}
	
	public void listItems(){
		
		for(Item item : getItems()){
			System.out.println(item.getDescription());
		}
	}
	
	public Integer getValue() {
		return value;
	}
	
	private void setValue(Integer value) {
		this.value = value;
	}
	
	public ArrayList<Item> getItems() {
		return items;
	}	
}
