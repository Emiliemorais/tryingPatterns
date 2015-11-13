package domain;

import state.LittleMario;
import state.MarioState;

public class Mario {
	
	private MarioState state;
	private Integer points;
	
	public Mario(){
		System.out.println("Iniciando jogo...  Mário pequeno.");
		state = new LittleMario(this);
		points = 0;
	}
	
	public void takeMushroom(){
		getState().takeMushroom();
	}
	
	public void takeFlower(){
		getState().takeFlower();
	}
	
	public void takeFeather(){
		getState().takeFeather();
	}
	
	public void sufferDamage(){
		getState().sufferDamage();
	}

	public void addPoints(Integer newPoints){
		this.points += newPoints;
	}

	public void setState(MarioState state){
		this.state = state;
	}
	
	public MarioState getState() {
		return state;
	}

	public Integer getPoints() {
		return points;
	}
}
