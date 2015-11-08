package bridge;

import domain.Drink;

public class DrinkJuice extends ItemImplementor{

	@Override
	public String getDescription(Drink drink){
		
		String description = "Suco de " + drink.getFlavor() + " (" + drink.getSize() + ") - R$ " + drink.getPrice();
		
		return description;
	}
	
}
