package alvares_cabral;

public class Feira {
	
	Fazer_feira comprar;
	Fiscalizar_feira fiscalizar;
	
	public Feira() { }
	
	public void set_fruta (Fazer_feira f) {
		comprar = f;
	}
	
	public void set_verdura (Fazer_feira v) {
		comprar = v;
	}
	
	public void set_fiscalizar (Fiscalizar_feira i) {
		fiscalizar = i;
	}
	
	public void chama_comprar_fruta() {
		comprar.comprar_na_barraca();
	}
	
	public void chama_comprar_verdura() {
		comprar.comprar_na_barraca();
	}
	
	public void chama_fiscalizar_feira() {
		fiscalizar.fiscalizar_feira();
	}
		
	}
