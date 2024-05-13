package ejercicio;

public class Peliculas {
	
	private static int id=1;
	private String Nombre;
	private Categorias categorias;
	
	//Constructores
	public Peliculas(String nombre, Categorias categorias) {
		super();
		id++;
		Nombre = nombre;
		this.categorias = categorias;
	}
	
	public Peliculas() {
	}
	
	//Getters y Setters

	public static int getId() {
		return id;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public Categorias getCategorias() {
		return categorias;
	}

	public void setCategorias(Categorias categorias) {
		this.categorias = categorias;
	}

	
	//ToString
	@Override
	public String toString() {
		return "Peliculas [id=" + id + ", Nombre=" + Nombre + ", categorias=" + categorias + "]";
	}
	

	
	
	
	

}
