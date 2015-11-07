package lanchoneteEmitalo;

import java.util.ArrayList;

public class Combo extends Item {

	private ArrayList<Item> items = new ArrayList<Item>();
	
	
	private Combo(Combo comboPrototype){
		
		setId(comboPrototype.getId());
		setName(comboPrototype.getName());
	}
	
	public Combo(int id, String name){
		
		setId(id);
		setName(name);
		setPrice(0);
	}
		
	public void addItem(Item item){
		items.add(item);
		setPrice(getPrice() + item.getPrice());
	}
		
	@Override
	protected String getDescription() {
		
		String description = getName() + " - R$ " + getPrice() + "\n \t \t";
		
		for(Item item: items){
			
			description += item.getDescription() + "\n \t \t";

		}
		
			
		return description;
	}

	@Override
	public Combo clone() {
		
		Combo combo = new Combo(this);
		
		return combo;
	}

}
