package ejercicio;

public class Peliculas {
	
	private static int id=1;
	private String Nombre;
	private Categorias categorias;
	private int idPelicula;
	
	//Constructores
	public Peliculas(String nombre, Categorias categorias) {
		idPelicula=id;
		id++;
		Nombre = nombre;
		this.categorias = categorias;
	}
	
	public Peliculas(Categorias categorias) {
		idPelicula=id;
		this.categorias=categorias;
		id++;
	}
	
	//Getters y Setters

	public static int getId() {
		return id;
	}
	
	public int getidPelicula() {
		return idPelicula;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getCategorias() {
		return categorias.getNombre();
	}

	public void setCategorias(Categorias categorias) {
		this.categorias = categorias;
	}
	

	
	//ToString
	@Override
	public String toString() {
		return "Peliculas [id=" + idPelicula + ", Nombre=" + Nombre + ", categorias=" + getCategorias() + "]";
	}


	
	
	
	

}
