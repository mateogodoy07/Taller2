package Package;

import java.util.ArrayList;

public class AltoMando {
	private int NAM; //NAM = Numero Alto Mando
	private String Nombre;
	private Pokemon[]CP;
	int CantidadPokemon = 6;
	public AltoMando(int NAM, String Nombre) {
		this.NAM = NAM;
		this.Nombre = Nombre;
		this.CP = new Pokemon[CantidadPokemon];
	}

	public int getNAM() {
		return NAM;
	}

	public void setNAM(int nAM) {
		NAM = nAM;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public void AñadirPokemon1(Pokemon pokemon, int indice) {
		CP[indice]= pokemon;
		
		
	}
	public ArrayList<Pokemon> getCP() {
	    ArrayList<Pokemon> AltoMando = new ArrayList<>();
	    for (int i = 0; i < CP.length; i++) {
	        if (CP[i] != null) {
	            AltoMando.add(CP[i]);
	        }
	    }
	    return AltoMando;
	}
	

}
