package ejercicio;

public class Categorias {

	private int id;
	private String nombre;
	
	//Constructores
	
	public Categorias(int id,String nombre) {
		//super();
		this.id = id;
		this.nombre = nombre;
	}
	
	public Categorias() {
	
	}

	//Getters y Setters

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	//ToString
	
	@Override
	public String toString() {
		return nombre;
	}
	
	
	
	
	

}
