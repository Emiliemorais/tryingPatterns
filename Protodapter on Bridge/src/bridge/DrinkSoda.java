package bridge;

import domain.Drink;

public class DrinkSoda extends ItemImplementor {
	
	@Override
	public String getDescription(Drink drink) {
		
		String description = "Refrigerante " + drink.getFlavor() + " (" + drink.getSize() + ") - R$ " + drink.getPrice();
		
		return description;
	}

}
