package Organiza_Cidade;

public class Região_de_Santos extends Cidade_de_Santos {
	
	Região_de_Santos(){
		super("r");
	}
	
	Região_de_Santos(String f)
	{super(f);}
	
	private String bairro;
	
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	
	public String getBairro() {
		return bairro;
	}

}
