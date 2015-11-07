package lanchoneteEmitalo;

public class Attendance {

	public static void main(String[] args) {
		
		Fries mediumFries = new Fries(1, "Fry Potato", 7, "M");
		
		Order order = new Order();
		order.addItem(mediumFries);
		
		Fries littleFries = mediumFries.clone();
		littleFries.setLittleSize();
		
		//order.addItem(littleFries);
		
		Burguer chickenBurguer = new Burguer(2, "Hambúrguer", 15, Burguer.CHICKEN_MEAT);
		order.addItem(chickenBurguer);
		
		Burguer cowBurguer = chickenBurguer.clone();
		cowBurguer.setCowMeat();
		//order.addItem(cowBurguer);
		
		Drink cokeDrink = new Drink(3, "Refrigerante", Drink.LITTLE_DRINK_PRICE, Drink.LITTLE_SIZE, Drink.COKE_FLAVOR);
		//order.addItem(cokeDrink);
		
		Drink spriteDrink = cokeDrink.clone();
		spriteDrink.setSpriteFlavor();
		spriteDrink.setLargeSize();
		order.addItem(spriteDrink);
				
		Combo combo1 = new Combo(4, "Combo");
		combo1.addItem(cokeDrink);
		combo1.addItem(cowBurguer);
		combo1.addItem(littleFries);
		order.addItem(combo1);
		
		order.finalizeOrder();
	}

}
