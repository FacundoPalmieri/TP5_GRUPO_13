package ejercicio;

public class Categorias {

	private int id;
	private String Nombre;
	
	//Constructores
	
	public Categorias(int id, String nombre) {
		super();
		this.id = id;
		Nombre = nombre;
	}
	
	public Categorias() {
	
	}

	//Getters y Setters

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	
	//ToString
	
	@Override
	public String toString() {
		return "Categorias [id=" + id + ", Nombre=" + Nombre + "]";
	}
	
	
	
	
	

}
