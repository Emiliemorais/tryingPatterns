package state;

public abstract class MatchState {
	
	protected String stateName;
	
	public abstract void endMatch();
	
	protected abstract void setStateName();
	
	public String getStateName(){
		return this.stateName;
	}
}
