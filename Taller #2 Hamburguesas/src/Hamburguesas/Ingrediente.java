package Hamburguesas;

public class Ingrediente {
	
	//Atributos
	private String nombre;
	private int costoAdicional;
	
	//Métodos
	public Ingrediente(String nombre, int costoAdicional) {
		this.nombre = nombre;
		this.costoAdicional = costoAdicional;
		
	}
	
	public String getNombres() {
		return nombre;
	}
	
	public int getCostoAdicionals() {
		return costoAdicional;
	}
	
	//Setters y Getters

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCostoAdicional() {
		return costoAdicional;
	}

	public void setCostoAdicional(int costoAdicional) {
		this.costoAdicional = costoAdicional;
	}
}
