package state;

import domain.Mario;

public class LittleMario extends MarioState {

	public LittleMario(Mario mario) {
		super(mario);
	}

	@Override
	public void takeMushroom(){
		mario.setState(new BigMario(mario));
		System.out.println("Mario era pequeno e ficou grande porque pegou Cogumelo.");
	}

	@Override
	public void takeFlower(){
		mario.setState(new BigMario(mario));
		System.out.println("Mario era pequeno e ficou grande porque pegou uma Flor.");
		mario.setState(new FireMario(mario));
		System.out.println("Mario era pequeno e tá com poder de fogo porque pegou uma Flor.");
	}

	@Override
	public void takeFeather(){
		mario.setState(new BigMario(mario));
		System.out.println("Mario era pequeno e ficou grande porque pegou uma Pena.");
		mario.setState(new FireMario(mario));
		System.out.println("Mario era pequeno e tá com capa porque pegou uma Pena.");
	}

	@Override
	public void sufferDamage(){
		mario.setState(new DeadMario(mario));
		System.out.println("Mario morreu... Game Over!");
	}
	
	@Override
	public String getStateName() {
		return "Mario Pequeno";
	}
}
