package procedimientos;

import java.util.HashMap;

import javax.swing.JOptionPane;

import modelado.Perro;

public class Procesos {
	HashMap<Integer, Perro> mapPerro = new HashMap<>();	
//	int cod;
	
	
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
		switch (opc) {
		case 1:
			int rep;

            do {
                Perro perro = new Perro();
                perro.ingresarDatosPerro();
//                mapPerro.put(cod, perro);
//                cod++;
                mapPerro.put(perro.getCodigo(), perro);

                rep = JOptionPane.showConfirmDialog(null, "¿Desea ingresar otra mascota?", "Confirmación", JOptionPane.YES_NO_OPTION);
            } while (rep == JOptionPane.YES_OPTION);
            
            break;
            
		case 2:
            System.out.println("LISTA DE PERROS:");
            for (Perro p : mapPerro.values()) {
                p.mostrarInformacion();
                p.ladrar();
                p.comer(p.getTam());
                p.esterilizar(p.getEsterilizado());
                p.dormir(p.getTam());
                System.out.println("-------------------");
            }
            break;
			
		case 3:
			int codigoConsulta = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el código del perro a consultar"));
			
			Perro perro = mapPerro.get(codigoConsulta);
			if (perro!=null) {
                perro.mostrarInformacion();
                perro.esterilizar(perro.getEsterilizado());
                System.out.println("-------------------");
			}else {
				System.out.println("No se encontró un perro con este número de código.");
			}
            
            break;
            
		case 4:
			System.out.println("Saliendo del programa.");
			break;
		default:
            System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
		}
	}
}
