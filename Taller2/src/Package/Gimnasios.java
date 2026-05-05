package Package;


public class Gimnasios {
	private int NG; // NG = Numero Gimnasio
	private String Lider;
	private String Estado;
	private int CantidadPokemon;
	private Pokemon[]CP; // CP = Cantidad Pokemon
	public Gimnasios(int NG, String Lider, String Estado, int CantidadPokemon) {
		this.NG = NG;
		this.Lider = Lider;
		this.Estado = Estado;
		this.CP = new Pokemon[CantidadPokemon];
	}

	public int getNG() {
		return NG;
	}

	public String getLider() {
		return Lider;
	}

	public String getEstado() {
		return Estado;
	}
	public int getCantidadPokemon() {
		return CantidadPokemon;
	}
	public void AñadirPokemon2(Pokemon pokemon, int indice) {
		CP[indice]= pokemon;
		
		
	}

	

}
