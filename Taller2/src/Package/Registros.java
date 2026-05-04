package Package;

import java.util.ArrayList;

public class Registros {
	private String nombre;
	private ArrayList<Pokemon> Pokemones;
	private ArrayList<Boolean> Estados;
	private ArrayList<String> Medallas;
	public Registros(String nombre) {
		this.nombre = nombre;
		this.Pokemones = new ArrayList<>();
		this.Estados = new ArrayList<>();
		this.Medallas = new ArrayList<>();
		
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void AñadirPokemon1(Pokemon pokemon, boolean estado) {
		Pokemones.add(pokemon);
		Estados.add(estado);
		
	}
	public void AñadirMedallas(String NombreMedalla) {
		Medallas.add(NombreMedalla);
	}
	
	
	

}
