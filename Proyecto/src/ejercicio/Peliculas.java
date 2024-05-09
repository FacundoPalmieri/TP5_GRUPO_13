package ejercicio;

public class Peliculas {
	
	private int id;
	private String Nombre;
	private Categorias categorias;
	
	//Constructores
	public Peliculas(int id, String nombre, Categorias categorias) {
		super();
		this.id = id;
		Nombre = nombre;
		this.categorias = categorias;
	}
	
	public Peliculas() {
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
