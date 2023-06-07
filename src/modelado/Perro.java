package modelado;

import javax.swing.JOptionPane;

public class Perro {
	
	//ATRIBUTOS O CARACTERÍSTICAS DEL OBJETO PERRO
	private int codigo;
	private String nombre;
	private String esterilizado;
	private int edad;
	private String tam;
	private String genero;

	//MÉTODO CONSTRUCTOR IMPLÍCITO
	public Perro() {
		codigo = 0;
		nombre = "Default";
		esterilizado = "Default";
		edad = 0;
		tam = "Default";
		genero = "Default";
  }
	
	//ENCAPSULACIÓN DE LOS DATOS
	public int getCodigo() {
		return codigo;
	}


	public void setCodigo(int codigo) {
		if (codigo >= 0) {
			this.codigo = codigo;
		}else {
			System.out.println("El código NO puede ser un valor negativo");
		}
	}

	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getEsterilizado() {
		return esterilizado;
	}


	public void setEsterilizado(String esterilizado) {
		this.esterilizado = esterilizado;
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
		
		codigo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un código para identificar su perro"));
		nombre = JOptionPane.showInputDialog("Ingrese el nombre del perro con el código "+codigo);
		esterilizado = JOptionPane.showInputDialog("Indique si el perro "+nombre+" es esterilizado\n(Si o no)");
		edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad de "+nombre));
		tam = JOptionPane.showInputDialog("Ingrese el tamaño de "+nombre+"\n(Grande, mediano, pequeño)");
		genero = JOptionPane.showInputDialog("Ingrese el generó de "+nombre);
		
	}
	
	public void mostrarInformacion() {
		
		System.out.println("INFORMACIÓN DEL PERRO:");
		System.out.println("-Codigo: "+codigo);
		System.out.println("-Nombre: "+nombre);
		System.out.println("-Edad: "+edad);
		System.out.println("-Tamaño: "+tam);
		System.out.println("-Genero: "+genero);
		
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
	
	public void esterilizar(String esterilizado) {
		if (esterilizado.equalsIgnoreCase("no")) {
			System.out.println("El perro "+nombre+" puede ser esterilizado (se recomiendo)");
		}else {
			System.out.println("El perro "+nombre+" ya fue esterilizado");
		}
	}

	public void dormir(String tam) {
		if (tam.equalsIgnoreCase("grande")) {
			System.out.println("Duerme en su cama 120cm x 120cm");
		}else if (tam.equalsIgnoreCase("mediano")) {
			System.out.println("Duerme en su cama 100cm x 100cm");
		}else if (tam.equalsIgnoreCase("pequeño")) {
			System.out.println("Duerme en su cama 80cm x 80cm");
		}
	}
	
}
