package classe3;

import javax.swing.JOptionPane;

public class Dados_Automóvel {
public static void main(String args[]) {
	
	//variável de instância
	Automóvel a = new Automóvel();
	
	String md, pr, mr, an;
	double pc;
	
	md = JOptionPane.showInputDialog("digitar o modelo");
	pr = JOptionPane.showInputDialog("digitar o preço");
	mr = JOptionPane.showInputDialog("digitar a marca");
	an = JOptionPane.showInputDialog("digitar o ano");
	pc = Double.parseDouble(pr);
	
	a.set_modelo(md);
	a.set_preço(pc);
	a.set_marca(mr);
	a.set_ano(an);
	
	System.out.println("modelo : " + a.get_modelo());
	System.out.println("preço R$ : " + a.get_preço());
	System.out.println("marca : " + a.get_marca());
	System.out.println("ano : " + a.get_ano());
	
	
}
}
