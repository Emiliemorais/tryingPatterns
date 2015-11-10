package domain;

public class CardCheck{
	
	private static final Integer FOUR_VALUE = 1;
	private static final Integer FIVE_VALUE = 2;
	private static final Integer SIX_VALUE = 3;
	private static final Integer SEVEN_VALUE = 4;
	private static final Integer QUEEN_VALUE = 5;
	private static final Integer JACK_VALUE = 6;
	private static final Integer KING_VALUE = 7;
	private static final Integer ACE_VALUE = 8;
	private static final Integer TWO_VALUE = 9;
	private static final Integer THREE_VALUE = 10;
	
	// Manilhas
	private static final Integer SEVEN_OF_DIAMONDS_VALUE = 11;
	private static final Integer ACE_OF_SPADES_VALUE = 12;
	private static final Integer SEVEN_OF_HEARTS_VALUE = 13;
	private static final Integer ZAPE_VALUE = 14;
	
	private Card card1;
	private Card card2;
	
	public CardCheck(Card card1, Card card2){
		setCard1(card1);
		setCard2(card2);
	}
	
	public void setCard1(Card card1){
		this.card1 = card1;	
	}
	
	public void setCard2(Card card2){
		this.card2 = card2;
	}
	
	public Card checkWinnerCard(){
		
		Card card1 = getCard1();
		Card card2 = getCard2();
	
		Integer card1Value = getCardValue(card1);
		Integer card2Value = getCardValue(card2);
		
		Card winnerCard; 
		
		if(card1Value > card2Value){
			winnerCard = card1;
		}else if(card1Value < card2Value){
			winnerCard = card2;
		}else{
			winnerCard = null;
		}
		
		return winnerCard;
	}
	
	private Integer getCardValue(Card card){
		
		Integer cardValue = 0;
		
		String givenCardValue = card.getValue();
		switch(givenCardValue){
			
			case "4":
				if(card.getSuit() == "Paus"){
					cardValue = ZAPE_VALUE;
				}else{
					cardValue = FOUR_VALUE;
				}
				break;
			
			case "7":
				if(card.getSuit() == "Copas"){
					cardValue = SEVEN_OF_HEARTS_VALUE;
				}else if(card.getSuit() == "Ouros"){
					cardValue = SEVEN_OF_DIAMONDS_VALUE;
				}else{
					cardValue = SEVEN_VALUE;
				}
				break;
			
			case "A":
				if(card.getSuit() == "Espadas"){
					cardValue = ACE_OF_SPADES_VALUE;
				}else{
					cardValue = ACE_VALUE;
				}
				break;
			
			case "3":
				cardValue = THREE_VALUE;
				break;
				
			case "2":
				cardValue = TWO_VALUE;
				break;
				
			case "K":
				cardValue = KING_VALUE;
				break;
				
			case "J":
				cardValue = JACK_VALUE;
				break;
				
			case "Q":
				cardValue = QUEEN_VALUE;
				break;
				
			case "5":
				cardValue = FIVE_VALUE;
				break;
				
			case "6":
				cardValue = SIX_VALUE;
				break;
			
			default:
				//Invalid card value
		}
		
		return cardValue;
	}
	
	private Card getCard1(){
		return this.card1;
	}
	
	private Card getCard2(){
		return this.card2;
	}
}
