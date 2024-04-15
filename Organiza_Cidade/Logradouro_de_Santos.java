package Organiza_Cidade;

public class Logradouro_de_Santos extends Bairro_de_Santos {

	Logradouro_de_Santos(){
		super("l");
	}
	
	private String logradouro;
	
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	
	public String getLogradouro() {
		return logradouro;
	}
}
