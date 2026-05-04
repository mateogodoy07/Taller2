package Package;

import java.util.ArrayList;

public class Gimnasios {
	private int NG; // NG = Numero Gimnasio
	private String Lider;
	private String Estado;
	private int CantidadPokemon;
	private ArrayList<Pokemon>CP; // CP = Cantidad Pokemon
	public Gimnasios(int NG, String Lider, String Estado, int CantidadPokemon) {
		this.NG = NG;
		this.Lider = Lider;
		this.Estado = Estado;
		this.CP = new ArrayList<>();
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
	public void AñadirPokemon2(Pokemon pokemon) {
		CP.add(pokemon);
		
		
	}

	

}
