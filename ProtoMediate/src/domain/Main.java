package domain;

public class Main {
	
	public static void main(String[] args) {
				
		Card zape = new Card("Paus", "4");
		Card threeOfSpades = new Card("Espadas", "3");
		Card twoOfDiamonds = new Card("Ouros", "2");
		
		Hand emiliesHand = new Hand();
		emiliesHand.addCard(zape);
		emiliesHand.addCard(threeOfSpades);
		emiliesHand.addCard(twoOfDiamonds);
		
		Player emilie = new Player("Emilie", emiliesHand);
		
		Card sevenOfHearts = new Card("Copas", "7");
		Card twoOfSpades = new Card("Espadas", "2");
		Card threeOfDiamonds = new Card("Ouros", "3");
		
		Hand italosHand = new Hand();
		italosHand.addCard(sevenOfHearts);
		italosHand.addCard(twoOfSpades);
		italosHand.addCard(threeOfDiamonds);
		
		Player italo = new Player("Ítalo", italosHand);
		
		Match match = new Match(emilie, italo);
		
		//First round
		emilie.throwCard(emiliesHand.getCard(threeOfSpades), match);
		italo.throwCard(italosHand.getCard(sevenOfHearts), match);
		match.endCurrentRound();
		
		
		//Second round
		emilie.throwCard(emiliesHand.getCard(zape), match);
		italo.throwCard(italosHand.getCard(twoOfSpades), match);
		match.endCurrentRound();
		
		//Third round
		emilie.throwCard(emiliesHand.getCard(twoOfDiamonds), match);
		italo.throwCard(italosHand.getCard(threeOfDiamonds), match);
		match.endCurrentRound();
		
		//match.getState().endMatch();
	}
}
