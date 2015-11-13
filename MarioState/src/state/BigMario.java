package state;

import domain.Mario;

public class BigMario extends MarioState {

	private static final Integer MUSHROOM_POINTS = 1000;
	
	public BigMario(Mario mario) {
		super(mario);
	}

	@Override
	public void takeMushroom(){
		mario.addPoints(MUSHROOM_POINTS);
		System.out.println("Mario grande pegou cogumelo e ganhou 1000 pontos.");
	}

	@Override
	public void takeFlower(){
		mario.setState(new FireMario(mario));
		System.out.println("Mário está grande e tá com poder de fogo porque pegou uma Flor.");
	}

	@Override
	public void takeFeather(){
		mario.setState(new CapeMario(mario));
		System.out.println("Mário está grande e tá com capa porque pegou uma Pena.");
	}

	@Override
	public void sufferDamage(){
		mario.setState(new LittleMario(mario));
		System.out.println("Mário era grande e ficou pequeno porque sofreu dano.");
	}
	
	@Override
	public String getStateName() {
		return "Mario Grande";
	}
}
