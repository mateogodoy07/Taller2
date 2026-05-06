//Integrante 1: Mateo Godoy Carrasco - 21924663-3 - mateogodoy07
//Carrera: Ingenieria Civil Industrial
//Link repositorio: https://github.com/mateogodoy07/Taller2.git.2222


package Package;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileWriter;
public class Taller2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean criterio = false;
		ArrayList<Pokemon>Pokemones = new ArrayList<>();
		ArrayList<Registros>Registro = new ArrayList<>();
		ArrayList<Habitats> H = new ArrayList<>(); // H = Habitats 
		ArrayList<Gimnasios>Gim = new ArrayList<>();
		ArrayList<Pokemon>PokemonesEquipo = new ArrayList<>();
		ArrayList<Pokemon>PokemonesEncontrados = new ArrayList<>();
		ArrayList<AltoMando>Altomando = new ArrayList<>();
		try {
			File Pokedex = new File("Pokedex.txt");
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
			File Habitats = new File("Habitats.txt");
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
			File AltoMando = new File("Alto Mando.txt");
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
			File Registros = new File("Registros.txt");
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
			File Gimnasios = new File("Gimnasios.txt");
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
					try {
						BufferedWriter NuevoRegistro = new BufferedWriter(new FileWriter("Registros.txt",false));
						Registros NuevaPartida = new Registros(ID,8);
						NuevoRegistro.write(ID);
						
						for(int i = 0; i < 8; i++) {
							NuevoRegistro.write(";none");// debe ser solo un none
						}
						NuevoRegistro.newLine();
						NuevoRegistro.close();
						System.out.println("Bienvenido " +ID+"!!");
						int opcion = 0;
						do {
							System.out.println(ID + " que deseas hacer?");
							System.out.println("");
							System.out.println("1) Revisar equipo.");
							System.out.println("2) Salir a capturar.");
							System.out.println("3) Acceso al PC(cambiar Pokémon del equipo).");
							System.out.println("4) Retar un gimnasio.");
							System.out.println("5) Desafío al Alto Mando.");
							System.out.println("6) Curar Pokémon");
							System.out.println("7) Guardar.");
							System.out.println("8) Guardar y salir.");
							System.out.println("");
							System.out.print("Ingrese Opcion: ");
							opcion = Integer.valueOf(scanner.nextLine());
							
							if(opcion == 1) {
								for(int j = 0; j  < 6; j++) {
									int poisicion = j+1;
									if(j < PokemonesEquipo.size()) {
										Pokemon p = PokemonesEquipo.get(j);
										System.out.println(poisicion+") "+p.getPokemon()+"|"+p.getTipo()+"|"+"Stats totales: "+EstadisticasTotales(p.getVida(), p.getAtaque(), p.getDefensa(), p.getAtaqueEspecial(), p.getDefensaEspecial(), p.getVelocidad()));
									
										}
											
								}
								
							}
							if(opcion == 2) {
								System.out.println("Donde deseas ir a explorar?");
								System.out.println("");
								System.out.println("Zonas disponibles:");
								System.out.println("");
								System.out.println("1) Lago");
								System.out.println("2) Cueva");
								System.out.println("3) Montaña");
								System.out.println("4) Bosque");
								System.out.println("5) Prado");
								System.out.println("6) Mar");
								System.out.println("7) Volver al menu.");
								String Lugar;
								int Habitat = Integer.valueOf(scanner.nextLine());
								
								if(Habitat == 1) {
									Lugar = "Lago";
									ArrayList<Pokemon>Lago = new ArrayList<>();
									EncontrarHabitat(Lugar,Pokemones,Lago);
									ObtenerPokemon(Lago,PokemonesEquipo,true );
										
								}
								if(Habitat == 2) {
									Lugar = "Cueva";
									ArrayList<Pokemon>Cueva = new ArrayList<>();
									EncontrarHabitat(Lugar,Pokemones,Cueva);
									ObtenerPokemon(Cueva,PokemonesEquipo,true );
									
								}
								if(Habitat == 3) {
									Lugar = "Montaña";
									ArrayList<Pokemon>Montaña = new ArrayList<>();
									EncontrarHabitat(Lugar,Pokemones,Montaña);
									ObtenerPokemon(Montaña,PokemonesEquipo,true );
									
								}
								if(Habitat == 4) {
									Lugar = "Bosque";
									ArrayList<Pokemon>Bosque = new ArrayList<>();
									EncontrarHabitat(Lugar,Pokemones,Bosque);
									ObtenerPokemon(Bosque,PokemonesEquipo,true );
									
								}
								if(Habitat == 5) {
									Lugar = "Prado";
									ArrayList<Pokemon>Prado = new ArrayList<>();
									EncontrarHabitat(Lugar,Pokemones,Prado);
									ObtenerPokemon(Prado,PokemonesEquipo,true );
									
								}
								if(Habitat == 6) {
									Lugar = "Mar";
									ArrayList<Pokemon>Mar = new ArrayList<>();
									EncontrarHabitat(Lugar,Pokemones,Mar);
									ObtenerPokemon(Mar,PokemonesEquipo,true );
									
								}
								if(Habitat == 7) {
									System.out.println("Volviendo al menu");
									System.out.println("");
								}
							}
							if(opcion == 3) {
								
							}
							if(opcion == 4) {
								
							}
							if(opcion == 5) {
								
							}
							if(opcion == 6) {
								
							}
							
						}while(opcion != 8&&opcion != 7);
						
					}catch(IOException e) {}
					
				}
				
			}
			if(comando==3) {
				criterio = true;
				System.out.println("Hasta Pronto.");
			}
			
		}while(!criterio);
		

	}
	public static void EncontrarHabitat(String Habitat,ArrayList<Pokemon>Rango,ArrayList<Pokemon>PAZ) { // PAZ = Pertenece a zona 
		for(int i = 0; i < Rango.size();i++) {
			if(Rango.get(i).getHabitat().equals(Habitat)) {
				PAZ.add(Rango.get(i));
			}
		}
	}
	public static void ObtenerPokemon(ArrayList<Pokemon>Rango,ArrayList<Pokemon>Capturado,boolean Estado) {
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		double probabilidad = random.nextDouble();
		double acumulado = 0;
		Pokemon PokemonElegido = null;
		
		for(int i = 0; i < Rango.size();i++) {
			acumulado += Rango.get(i).getPorcentajeAparicion();
			if(probabilidad < acumulado) {
				PokemonElegido = Rango.get(i);
				break;
			}
		}
		if(PokemonElegido != null) {
			System.out.println("Oh!! Ha aparecido un increible "+PokemonElegido.getPokemon()+"!!");
			System.out.println("");
			System.out.println("Que deseas hcaer?");
			System.out.println("1) Capturar");
			System.out.println("2) Huir");
			int Respuesta = Integer.valueOf(scanner.nextLine());
			String estado = null;
			if(Respuesta == 1) {
				Capturado.add(PokemonElegido);
				if(Estado == true) {
					 estado = "Vivo";
				}
				if(Estado !=true) {
					 estado = "Debilitado";
				}
				try {
					BufferedWriter Pokemon = new BufferedWriter(new FileWriter("Registros.txt",true));
					Pokemon.write(PokemonElegido.getPokemon()+";"+ estado);
					Pokemon.newLine();
					Pokemon.close();
				}catch(IOException e) {}
				
				System.out.println(PokemonElegido.getPokemon() +" capturado con exito!!");
				System.out.println("");
				System.out.println(PokemonElegido.getPokemon() +" ha sido agregado a tu equipo!");
			}
			if(Respuesta ==2) {
				System.out.println("Haz huido con exito!");
			}
			
		}
		
	}
	public static int EstadisticasTotales(int Vida, int Ataque, int Defensa, int AtaqueEspecial, int DefensaEspecial, int Velocidad ) {
		int StatsTotales;
		StatsTotales = Vida+Ataque+Defensa+AtaqueEspecial+DefensaEspecial+Velocidad;
		return StatsTotales;
	}

}
