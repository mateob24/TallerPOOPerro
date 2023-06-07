import javax.swing.JOptionPane;

public class Perro {
	
	//ATRIBUTOS O CARACTERÍSTICAS DEL OBJETO PERRO
	private String nombre;
	private String raza;
	private int edad;
	private String tam;
	private String genero;

	//MÉTODO CONSTRUCTOR IMPLÍCITO
	public Perro() {
		nombre = "Default";
		raza = "Default";
		edad = 0;
		tam = "Default";
		genero = "Default";
  }
	
	//ENCAPSULACIÓN DE LOS DATOS
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getRaza() {
		return raza;
	}


	public void setRaza(String raza) {
		this.raza = raza;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		if (edad >= 0) {
			this.edad = edad;
		}else {
			System.out.println("La edad NO puede ser un valor negativo");
		}
	}


	public String getTam() {
		return tam;
	}


	public void setTam(String tam) {
		this.tam = tam;
	}


	public String getGenero() {
		return genero;
	}


	public void setGenero(String genero) {
		this.genero = genero;
	}	

//-------------------------------------------------------------------------------------
	
	//MÉTODO PARA EL INGRESO DE DATOS DEL OBJETO PERRO
	public void ingresarDatosPerro() {
		nombre = JOptionPane.showInputDialog("Ingrese el nombre del perro");
		raza = JOptionPane.showInputDialog("Indique de qué raza es el perro "+nombre);
		edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad de "+nombre));
		tam = JOptionPane.showInputDialog("Ingrese el tamaño de "+nombre+"\n(Grande, mediano, pequeño)");
		genero = JOptionPane.showInputDialog("Ingrese el generó de "+nombre);
	}
	
	public void ladrar() {
		System.out.println("¡Guau guau!");
	}
	
	public void comer(String tam) {
		if (tam.equalsIgnoreCase("grande")) {
			System.out.println("Come del plato de 100gr");
		}else if (tam.equalsIgnoreCase("mediano")) {
			System.out.println("Come del plato de 80gr");
		}else if (tam.equalsIgnoreCase("pequeño")) {
			System.out.println("Come del plato de 60gr");
		}
	}
	
}
