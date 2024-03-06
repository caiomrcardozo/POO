package classe3;

public class Automóvel {
	
	//atributos
	
	private String modelo;
	private double preço;
	private String marca;
	private String ano;
	
	//métodos set
	
	public void set_modelo(String modelo) {
		this.modelo = modelo;
	}
	
	public void set_preço(double preço) {
		this.preço = preço;
		
	}
	
	public void set_marca(String marca) {
		this.marca = marca;
	}
	
	public void set_ano(String ano) {
		this.ano = ano;
	}
	
	//métodos get
	
	public String get_modelo() {
		return modelo;
	}
	
	public double get_preço() {
		return preço;
	}
	
	public String get_marca() {
		return marca;
	}
	
	public String get_ano() {
		return ano;
	}
}
