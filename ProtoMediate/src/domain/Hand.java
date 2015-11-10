package domain;
import java.util.ArrayList;


public class Hand {
	
	private ArrayList<Card> cards = new ArrayList<Card>(3);

	public Hand(){}
	
	public void addCard(Card card){
		this.cards.add(card);
	}
	
	public void removeCard(Card card){
		this.cards.remove(card);
	}
	
	public Card getCard(Card receivedCard){
		
		Card card = null;
		
		for (Card cardInHand : this.cards){
			if(cardInHand.equals(receivedCard)){
				card = receivedCard;
				break;
			}
		}
		return card;
	}
	
	public ArrayList<Card> getCards(){
		return cards;
	}
}
