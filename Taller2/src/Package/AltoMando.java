package Package;

import java.util.ArrayList;

public class AltoMando {
	private int NAM; //NAM = Numero Alto Mando
	private String Nombre;
	private ArrayList<Pokemon> Pokemones;
	
	public AltoMando(int NAM, String Nombre) {
		this.NAM = NAM;
		this.Nombre = Nombre;
		this.Pokemones = new ArrayList<>();
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

	public ArrayList<Pokemon> getPokemones() {
		return Pokemones;
	}

	public void Agregar(Pokemon pokemon) {
		Pokemones.add(pokemon);
	}

}
