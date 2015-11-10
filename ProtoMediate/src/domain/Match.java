package domain;
import java.util.ArrayList;

import state.MatchState;
import state.NineMatch;
import state.NormalMatch;
import state.SixMatch;
import state.TrucoMatch;
import state.TwelveMatch;


public class Match {
	
	private ArrayList<Round> rounds = new ArrayList<Round>(3);
	private ArrayList<Player> players = new ArrayList<Player>();
	private Round currentRound;
	private MatchState state;
	
	public Match(Player player1, Player player2){
		
		this.players.add(player1);
		this.players.add(player2);
		
		currentRound = new Round(this);
		setState(new NormalMatch(this));
	}
	
	// For 4 people game
	public Match(Player player1, Player player2, Player player3, Player player4){
		
		this.players.add(player1);
		this.players.add(player2);
		this.players.add(player3);
		this.players.add(player4);
	}
	
	public void endCurrentRound(){
				
		currentRound.endRound();
		this.rounds.add(currentRound);
		
		currentRound.showWinner();
		nextRound();
	}
	
	private void nextRound(){
		currentRound = new Round(this);
	}
	
	public void receiveCard(Player playerWhoThrew, Card card){
		
		currentRound.addRoundCard(playerWhoThrew, card);
	}
	
	public void raise(){
		
		switch(getState().getStateName()){
			
			case "Normal":
				setState(new TrucoMatch());
				break;
			
			case "Truco":
				setState(new SixMatch());
				break;
			
			case "Mei pau":
				setState(new NineMatch());
				break;
				
			case "Nove, ladrão":
				setState(new TwelveMatch());
				break;
				
			case "Doze, carai!":
				// NOthing to do
				break;
				
			default:
				// Nothing to do
		}
	}
	
	public MatchState getState(){
		return this.state;
	}
	
	private void setState(MatchState state){
		
		this.state = state;
	}

	public ArrayList<Player> getPlayers() {
		return this.players;
	}

	public ArrayList<Round> getRounds() {
		return this.rounds;
	}
}
