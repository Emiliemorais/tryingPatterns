
import domain.Mario;


public class Main {

	public static void main(String[] args) {
		
		Mario mario = new Mario();
		
		mario.takeMushroom();
		
		System.out.println("Estado atual: " + mario.getState().getStateName() + "\n");
		
		mario.sufferDamage();
		
		System.out.println("Estado atual: " + mario.getState().getStateName()+ "\n");
		
		mario.takeFlower();
		
		System.out.println("Estado atual: " + mario.getState().getStateName()+ "\n");
		
		mario.takeFlower();
		
		System.out.println("Estado atual: " + mario.getState().getStateName()+ "\n");
		
		mario.takeMushroom();
		
		System.out.println("Estado atual: " + mario.getState().getStateName()+ "\n");
		
		mario.takeFeather();
		
		System.out.println("Estado atual: " + mario.getState().getStateName()+ "\n");
		
		mario.sufferDamage();
		
		System.out.println("Estado atual: " + mario.getState().getStateName()+ "\n");
		
		mario.takeFeather();
		
		System.out.println("Estado atual: " + mario.getState().getStateName()+ "\n");
		
		mario.sufferDamage();
		
		System.out.println("Estado atual: " + mario.getState().getStateName()+ "\n");
		
		mario.takeMushroom();
		
		System.out.println("Estado atual: " + mario.getState().getStateName()+ "\n");
		
		mario.sufferDamage();
		
		System.out.println("Estado atual: " + mario.getState().getStateName()+ "\n");
		
		mario.sufferDamage();
		
		System.out.println("Estado atual: " + mario.getState().getStateName()+ "\n");
		
		System.out.println("Total de Pontos: " + mario.getPoints() + "pts");
	}

}
