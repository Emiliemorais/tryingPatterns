package domain;

public class Card {
	
	private String suit;
	private String value;
	
	public Card(String suit, String value){
		setSuit(suit);
		setValue(value);
	}

	public String getSuit() {
		return suit;
	}
	
	private void setSuit(String suit) {
		this.suit = suit;
	}
	
	public String getValue() {
		return value;
	}
	
	private void setValue(String value) {
		this.value = value;
	}
	
	
}
