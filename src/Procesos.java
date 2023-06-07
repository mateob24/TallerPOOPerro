import java.util.HashMap;

import javax.swing.JOptionPane;

public class Procesos {
	HashMap<Integer, Perro> mapPerro = new HashMap<>();
	
	public void menu() {
		
		String menu = "MENÚ - PERRO\n";
			menu += "1. Ingrese los datos\n";
			menu += "2. Imprima la lista completa\n";
			menu += "3. Consulta individual\n";
			menu += "4. Salir del menú\n";
			menu += "Ingrese una opción:";
			
		int opc=0;	
		
		do {
			
			opc=Integer.parseInt(JOptionPane.showInputDialog(menu));
			validarMenu(opc);
			
		} while (opc!=4);
	}

	private void validarMenu(int opc) {
		
	}
}
