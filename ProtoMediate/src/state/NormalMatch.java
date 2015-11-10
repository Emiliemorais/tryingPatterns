package state;

import java.util.ArrayList;

import domain.Match;
import domain.Player;
import domain.Round;

public class NormalMatch extends MatchState {

	private Match match;
	
	public NormalMatch(Match match) {
		setStateName();
		this.match = match;
	}
	
	@Override
	public void endMatch() {
		ArrayList<Round> rounds = match.getRounds();
		Player players [] = null;
		
		int i = 0;
		for(Round round : rounds){
			players[i] = round.getWinner();
			i++;
		}
		
		getMatchWinner(players);
		
	}

	private void getMatchWinner(Player[] players) {
		//ArrayList<Player> players = match.getPlayers();

	}

	@Override
	protected void setStateName() {
		this.stateName = "Normal";		
	}
}
