package construção_civil;

import javax.swing.*;
public class Empresa_de_Construcao {
	public static void main(String[] args) {
		
		Construção pedreiro = null;
		
		int tipo_construção = Integer.parseInt(JOptionPane.showInputDialog("digitar o tipo " + "de construção:" + "\n" + "1 = CASA e 2 = APARTAMENTO ou 3 = tudo" ));
		
		switch(tipo_construção) {
		case 1:
			pedreiro = new Casa(); break;
			
		case 2:
			pedreiro = new Apartamento(); break;
			
		case 3:
			pedreiro = new Construção(); break;
			
			default:
				System.out.println("CONSTRUÇÃO INDEFINIDA");
				System.exit(0);
		}
		
		pedreiro.constroi();
		}

}
