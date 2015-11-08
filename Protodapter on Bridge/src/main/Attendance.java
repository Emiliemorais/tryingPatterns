package main;

import bridge.DrinkJuice;
import bridge.DrinkSoda;
import adapter.DrinkAdapter;
import domain.Burguer;
import domain.Combo;
import domain.Drink;
import domain.Fries;
import domain.Order;

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
		
		Drink cokeDrink = new Drink(3, "Bebida", Drink.LITTLE_DRINK_PRICE, Drink.LITTLE_SIZE, Drink.COKE_FLAVOR, new DrinkSoda());
		//order.addItem(cokeDrink);
		
		// Testing new Soda flavor by adapter 
		Drink spriteDrink = new DrinkAdapter(cokeDrink);
		spriteDrink.setSpriteFlavor();
		spriteDrink.setLargeSize();
		order.addItem(spriteDrink);
		
		// Implementing adapter
		DrinkAdapter guaranaDrink = new DrinkAdapter(cokeDrink);
		guaranaDrink.setGuaranaFlavor();
		order.addItem(guaranaDrink);
				
		Drink guaranaLarge = guaranaDrink.clone();
		guaranaLarge.setMediumSize();
		order.addItem(guaranaLarge);
		
		Drink guavaJuiceDrink = new Drink(3, "Bebida", Drink.LITTLE_DRINK_PRICE, Drink.LITTLE_SIZE, Drink.GUAVA_FLAVOR, new DrinkJuice());
		
		DrinkAdapter cajuJuice = new DrinkAdapter(guavaJuiceDrink);
		cajuJuice.setLargeSize();
		cajuJuice.setCajuJuice();
		order.addItem(cajuJuice);
		
		// Adding a combo
		Combo combo1 = new Combo(4, "Combo");
		combo1.addItem(cokeDrink);
		combo1.addItem(cowBurguer);
		combo1.addItem(littleFries);
		order.addItem(combo1);
		
		order.finalizeOrder();
	}

}
