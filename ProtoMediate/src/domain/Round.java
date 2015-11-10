package domain;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Round {
	
	private Map<Player, Card> roundCards = new HashMap<Player, Card>();
	private Match match;
	private Player winner;
	private CardCheck cardCheck;
	
	public Round(Match match) {
		this.match = match;
	}

	public void addRoundCard(Player player, Card card){
		this.roundCards.put(player, card);
	}
	
	// Verify who wins
	public void endRound(){
		
		Map<Player, Card> currentRoundCards = getRoundCards();
		Map<Card, Player> cardsOwner = new HashMap<Card, Player>();
		
		ArrayList<Player> players = match.getPlayers();
		
		Card [] cards = new Card[2];
		int i = 0;
		
		for(Player player : players){
			Card card = currentRoundCards.get(player);
			cardsOwner.put(card, player);
			cards[i] = card;
			i++;
		}
		
		cardCheck = new CardCheck(cards[0], cards[1]);
		
		Card winnerCard = cardCheck.checkWinnerCard();
		
		setWinner(cardsOwner.get(winnerCard));
	}
	
	private void setWinner(Player player){
		this.winner = player;		
	}
	
	public void showWinner(){
		System.out.println();
		if(this.winner != null){
			System.out.println("O ganhador da rodada foi: " + this.winner.getName());
		}else{
			System.out.println("A rodada empatou!");
		}
		System.out.println();
	}
	
	public Map<Player, Card> getRoundCards(){
		return this.roundCards;
	}

	public Player getWinner() {
		return this.winner;
	}
}
