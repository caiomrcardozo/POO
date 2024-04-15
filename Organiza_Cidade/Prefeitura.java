package Organiza_Cidade;

public class Prefeitura {

	public static void main(String[] args) {
		
		Região_de_Santos r = new Região_de_Santos();
		Bairro_de_Santos b = new Bairro_de_Santos();
		Cidade_de_Santos c = new Cidade_de_Santos();
		Logradouro_de_Santos l = new Logradouro_de_Santos();
		
		b.setBairro("Jardim Radio Clube");
		b.setRegião("Zona Noroeste");
		b.setRua("Álvaro Guimaraes");
		b.setPopulação(10000);
		System.out.println("BAIRRO: " + b.getBairro());
		System.out.println("REGIÃO: " + b.getRegião());
		System.out.println("RUA: " + b.getRua());
		System.out.println("POPULAÇÃO: " + b.getPopulação());
		
		r.setRegião("Zona Leste");
		r.setBairro("Marapé");
		r.setPopulação(99000);
		System.out.println("BAIRRO: " + r.getBairro());
		System.out.println("REGIÃO: " + r.getRegião());
		System.out.println("POPULAÇÃO: " + r.getPopulação());
		
		c.setRegião("Região Central");
		c.setPopulação(20000);
		System.out.println("REGIÃO: " + c.getRegião());
		System.out.println("POPULAÇÃO: " + c.getPopulação());
	}

}
