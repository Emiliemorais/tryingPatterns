package domain;

public class Player {
	
	private String name;
	private Hand hand;
	private Match match;
		
	public Player(String name, Hand hand) {
		setName(name);
		setHand(hand);
	}

	public void raise(Match match){
		
	}
		
	public void throwCard(Card cardYouWantToThrow, Match match){
		
		hand.removeCard(cardYouWantToThrow);
		match.receiveCard(this, cardYouWantToThrow);
		
		System.out.println(getName() + " jogou a carta " + cardYouWantToThrow.getValue() + " de " + cardYouWantToThrow.getSuit());
	}
	
	public String getName() {
		return name;
	}
	
	private void setName(String name) {
		this.name = name;
	}
	
	public Hand getHand() {
		return hand;
	}
	
	public void setHand(Hand hand) {
		this.hand = hand;
	}
}
