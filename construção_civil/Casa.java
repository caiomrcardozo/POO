package construção_civil;

public class Casa extends Construção {
	
	Construção casa = new Construção();
	
	public Casa() {
		casa.setTipo("CASA");
	}
	
	public void constroi() {
		System.out.println("FAZ-SE " + casa.getTipo());
	}

}
