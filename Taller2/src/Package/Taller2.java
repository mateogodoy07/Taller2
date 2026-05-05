//Integrante 1: Mateo Godoy Carrasco - 21924663-3 - mateogodoy07
//Carrera: Ingenieria Civil Industrial
//Link repositorio: https://github.com/mateogodoy07/Taller2.git.2222


package Package;

import java.util.Scanner;
import java.util.ArrayList;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.random.*;
public class Taller2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean criterio = false;
		ArrayList<Pokemon>Pokemones = new ArrayList<>();
		ArrayList<Registros>Registro = new ArrayList<>();
		ArrayList<Habitats> H = new ArrayList<>(); // H = Habitats 
		ArrayList<Gimnasios>Gim = new ArrayList<>();
		ArrayList<String>PokemonsEcontrados = new ArrayList<>();
		ArrayList<AltoMando>Altomando = new ArrayList<>();
		try {
			File Pokedex = new File("Pokedex");
			Scanner lector = new Scanner(Pokedex);
			String linea;
			
			while(lector.hasNextLine()) {
				linea = lector.nextLine();
				String[] partes = linea.split(";");
				String Pokemon = partes[0];
				String Habitat = partes[1];
				double PorcentajeAparicion = Double.parseDouble(partes[2]);
				int Vida = Integer.valueOf(partes[3]);
				int Ataque = Integer.valueOf(partes[4]);
				int Defensa = Integer.valueOf(partes[5]);	
				int AtaqueEspecial = Integer.valueOf(partes[6]);
				int DefensaEspecial = Integer.valueOf(partes[7]);
				int Velocidad = Integer.valueOf(partes[8]);
				String Tipo = partes[9];
				
				Pokemon pokemon = new Pokemon(Pokemon,Habitat,PorcentajeAparicion,Vida,Ataque,Defensa,AtaqueEspecial,DefensaEspecial,Velocidad,Tipo);
				Pokemones.add(pokemon);
				
				
				
			}
			
		}catch(IOException e) {}
		try {
			File Habitats = new File("Habitats");
			Scanner lector3 = new Scanner(Habitats);
			String linea;
			
			while(lector3.hasNextLine()) {
				linea = lector3.nextLine();
				String Habitat = linea;
				
				Habitats habitats = new Habitats(Habitat);
				H.add(habitats);
			}
			
		}catch(IOException e) {}
		
		
		try {
			File AltoMando = new File("Alto Mando");
			Scanner lector1 = new Scanner(AltoMando);
			String linea;
			
			while(lector1.hasNextLine()) {
				linea = lector1.nextLine();
				String[] partes1 = linea.split(";");
				int NAM = Integer.valueOf(partes1[0]); //NAM = Numero Alto Mando
				String Nombre = partes1[1];
				AltoMando altomando = new AltoMando(NAM,Nombre);
				for(int j = 0 ;j < 6; j++) {
					String PAM = partes1[j+2]; // PAM = Pokemon Alto Mando
					for(Pokemon u: Pokemones) {
						if(u.getPokemon().equals(PAM)) {
							altomando.AñadirPokemon1(u, j);
						}
					}
				}
				Altomando.add(altomando); 
			}
			
		}catch(IOException e) {}
		
		try {
			File Registros = new File("Registros");
			Scanner lector2 = new Scanner(Registros);
			String linea;
			Registros registros = null;
			if(lector2.hasNextLine()) {
				linea = lector2.nextLine();
				String[] partes2 = linea.split(";");
				String Nombre = partes2[0];
				int CantidadMedallas = 8;
				registros = new Registros(Nombre,CantidadMedallas);
				for(int i = 0; i <CantidadMedallas;i++) {
					String Medallas = partes2[i+1];
					registros.AñadirMedallas(Medallas, i);
					
				}
				
				
			}
			
			while(lector2.hasNextLine()) {
				linea = lector2.nextLine();
				String[] partes2 = linea.split(";");
				String NombrePokemon = partes2[0];
				boolean Estado = Boolean.parseBoolean(partes2[1]);
				
				for(Pokemon p: Pokemones) {
					if(p.getPokemon().equals(NombrePokemon)) {
						registros.AñadirPokemon1(p,Estado);
					}
				}
				
				
			}
			Registro.add(registros);
		}catch(IOException e) {}
		try {
			File Gimnasios = new File("Gimnasios");
			Scanner lector4 = new Scanner(Gimnasios);
			String linea;
			
			
			while(lector4.hasNextLine()) {
				linea = lector4.nextLine();
				String[] partes4 = linea.split(";");
				int NG = Integer.valueOf(partes4[0]);// NG = Numero Gimnasio
				String Lider = partes4[1];
				String Estado = partes4[2];
				int CantidadPokemons = Integer.valueOf(partes4[3]);	
				Gimnasios gimnasios = new Gimnasios(NG,Lider,Estado,CantidadPokemons);
				for(int i = 0; i <CantidadPokemons;i++) {
					String Pokemons = partes4[i+4];
					for(Pokemon p: Pokemones) {
						if(p.getPokemon().equals(Pokemons)) {
							gimnasios.AñadirPokemon2(p,i);
						}
					}
					
				}
				Gim.add(gimnasios);
				
			}
			
		}catch(IOException e) {}
		
		
		do {
			System.out.println("1) Continuar.");
			System.out.println("2) Nueva Partida.");
			System.out.println("3) Salir.");
			
			int comando = Integer.valueOf(scanner.nextLine());
			
			if(comando == 1) {
				
			}
			if(comando == 2) {
				System.out.print("Ingrese Apodo: ");
				String ID = scanner.nextLine();
				if(ID==null) {
					System.out.println("Apodo no ingresado");
				}
				if(ID!=null){
					//BufferedWriter duracion = new BufferedWriter(new FileWriter("Registros.txt",false));
					System.out.println("Bienvenido " +ID+"!!");
					
				}
			}
			if(comando==3) {
				criterio = true;
				System.out.println("Hasta Pronto.");
			}
			
		}while(!criterio);
		

	}
	

}
