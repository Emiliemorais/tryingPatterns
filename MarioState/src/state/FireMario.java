package state;

import domain.Mario;

public class FireMario extends MarioState {

	private static final Integer MUSHROOM_POINTS = 1000;

	public FireMario(Mario mario) {
		super(mario);
	}

	private void gainPoints(){
		mario.addPoints(MUSHROOM_POINTS);
		System.out.println("Mario fogo pegou cogumelo e ganhou 1000 pontos.");
	}
	
	@Override
	public void takeMushroom(){
		gainPoints();
	}

	@Override
	public void takeFlower() {
		gainPoints();
	}

	@Override
	public void takeFeather() {
		mario.setState(new FireMario(mario));
		System.out.println("Mário está com poder de fogo e ganhou mais poder de fogo porque pegou uma Pena.");
	}

	@Override
	public void sufferDamage() {
		mario.setState(new BigMario(mario));
		System.out.println("Mário está com poder de fogo e ficou grande porque sofreu dano.");
	}

	@Override
	public String getStateName() {
		return "Mario com poder de Fogo";
	}
}
