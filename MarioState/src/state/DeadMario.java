package state;

import domain.Mario;

public class DeadMario extends MarioState {

	public DeadMario(Mario mario) {
		super(mario);
	}

	private void gameOver(){
		System.out.println("Mário está morto, GAME OVER!");
	}
	
	@Override
	public void takeMushroom(){
		gameOver();
	}

	@Override
	public void takeFlower(){
		gameOver();
	}

	@Override
	public void takeFeather(){
		gameOver();
	}

	@Override
	public void sufferDamage(){
		gameOver();
	}
	
	@Override
	public String getStateName(){
		return "Morto";
	}
}
