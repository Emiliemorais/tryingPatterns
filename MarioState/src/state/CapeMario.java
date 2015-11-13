package state;

import domain.Mario;

public class CapeMario extends MarioState {

	private static final Integer MUSHROOM_POINTS = 1000;

	public CapeMario(Mario mario) {
		super(mario);
	}

	private void gainPoints(){
		mario.addPoints(MUSHROOM_POINTS);
		System.out.println("Mario fogo pegou cogumelo e ganhou 1000 pontos.");
	}
	
	@Override
	public void takeMushroom() {
		gainPoints();
	}

	@Override
	public void takeFlower() {
		mario.setState(new FireMario(mario));
		System.out.println("Mário está com capa e ganhou poder de fogo porque pegou uma Flor.");
	}

	@Override
	public void takeFeather() {
		gainPoints();
	}

	@Override
	public void sufferDamage() {
		mario.setState(new BigMario(mario));
		System.out.println("Mário estava com capa e a perdeu porque sofreu dano.");
	}
	
	@Override
	public String getStateName() {
		return "Mario com capa";
	}
}
