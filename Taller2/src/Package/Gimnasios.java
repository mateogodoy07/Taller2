package Package;

import java.util.ArrayList;

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
	public void setEstado(String estado) {
		Estado = estado;
	}
	public int getCantidadPokemon() {
		return CantidadPokemon;
	}
	public void AñadirPokemon2(Pokemon pokemon, int indice) {
		CP[indice]= pokemon;
		
		
	}
	public ArrayList<Pokemon> getCP(){
		ArrayList<Pokemon> Rival = new ArrayList<>();
		for(int i = 0; i <CP.length; i++) {
			if(CP[i] != null) {
				Rival.add(CP[i]);
			}
		}
		return Rival;
	}

	

}
