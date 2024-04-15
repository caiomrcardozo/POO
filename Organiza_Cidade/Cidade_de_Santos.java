package Organiza_Cidade;

public class Cidade_de_Santos {
	
	private String região;
	private int população;
	
	Cidade_de_Santos( ){}
	
	Cidade_de_Santos(String s){
		
		if (s == "r")
			System.out.println("Secretaria de Regionais");
		if (s == "b")
			System.out.println("Secretaria de Bairros");
		if (s == "l")
			System.out.println("Secretaria de Logradouros");
	}
	
	public void setRegião(String região) {
		this.região = região;
	}
	
	public void setPopulação(int população) {
		this.população = população;
	}
	
	public String getRegião() {
		return região;
	}
	
	public int getPopulação() {
		return população;
	}
}
