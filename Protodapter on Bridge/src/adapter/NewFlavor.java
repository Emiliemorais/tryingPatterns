package adapter;

public class NewFlavor {

	public static final String CAJU_FLAVOR = "Caju";
	public static final String GUARANA_FLAVOR = "Guaraná";
	private static final String SODA_FLAVOR = "Cerradinho de limão";
	
	public String getSodaFlavor(){
		return SODA_FLAVOR;
	}
	
	public String getGuaranaFlavor() {
		return GUARANA_FLAVOR;		
	}
	
	public String getCajuJuice(){
		return CAJU_FLAVOR;
	}
}
