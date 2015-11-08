package adapter;

import domain.Drink;

public class DrinkAdapter extends Drink{
	
	private NewFlavor newFlavors;

	public DrinkAdapter(Drink drink) {
		super(drink.getId(), drink.getName(), drink.getPrice(), drink.getSize(), drink.getFlavor(), drink.getItemImplementor());
		this.newFlavors = new NewFlavor();
	}
	
	@Override
	public void setSpriteFlavor(){
		setFlavor(newFlavors.getSodaFlavor());
	}
	
	public void setGuaranaFlavor(){
		String flavor = newFlavors.getGuaranaFlavor();
		setFlavor(flavor);
	}
	
	public void setCajuJuice(){
	
		String cajuFlavor = newFlavors.getCajuJuice();
		setFlavor(cajuFlavor);
	}
}
