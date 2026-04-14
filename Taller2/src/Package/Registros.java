package Package;

public class Registros {
	private String nombre;
	private int medallas;
	private String Pokemon;
	private String Estado;
	
	public Registros(String nombre,int medallas,String Pokemon,String Estado ) {
		this.nombre = nombre;
		this.medallas = medallas;
		this.Pokemon = Pokemon;
		this.Estado = Estado;
		
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getMedallas() {
		return medallas;
	}

	public void setMedallas(int medallas) {
		this.medallas = medallas;
	}

	public String getPokemon() {
		return Pokemon;
	}

	public void setPokemon(String pokemon) {
		Pokemon = pokemon;
	}

	public String getEstado() {
		return Estado;
	}

	
	public void setEstado(String estado) {
		Estado = estado;
	}
	

}
