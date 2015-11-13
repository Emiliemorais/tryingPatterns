package state;

import domain.Mario;

public abstract class MarioState {
	
	protected Mario mario;
	
	public MarioState(Mario mario){
		this.mario = mario;
	}
	
	public abstract void takeMushroom();
	public abstract void takeFlower();
	public abstract void takeFeather();
	public abstract void sufferDamage();
	
	public abstract String getStateName();
}
