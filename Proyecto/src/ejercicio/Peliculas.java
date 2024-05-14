package ejercicio;

public class Peliculas {
	
	private static int id=1;
	private String Nombre;
	private Categorias categorias;
	
	//Constructores
	//Constructores
	public Peliculas(String nombre, Categorias categorias) {
		super();
		id++;
		Nombre = nombre;
		this.categorias = categorias;
	}
	
	public Peliculas() {
		id++;
	}
	
	//Getters y Setters

	public static int getId() {
		return id;
	}
	
	public static void setId(int id) {
		Peliculas.id = id;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getCategorias() {
		return categorias.toString();
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
