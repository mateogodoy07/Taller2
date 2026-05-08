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
								int cambio;
								int Pokemon1;
								int Pokemon2;
								for(int j = 0; j  < PokemonesEquipo.size(); j++) {
									int poisicion = j+1;
									if(j < PokemonesEquipo.size()) {
										Pokemon p = PokemonesEquipo.get(j);
										System.out.println(poisicion+") "+p.getPokemon()+"|"+p.getTipo()+"|"+"Stats totales: "+EstadisticasTotales(p.getVida(), p.getAtaque(), p.getDefensa(), p.getAtaqueEspecial(), p.getDefensaEspecial(), p.getVelocidad()));
									
										}
											
								}
								System.out.println("");
								System.out.println("Que deseas hacer?");
								System.out.println("1) Cambiar Pokemon.");
								System.out.println("2) Salir.");
								
								cambio = Integer.valueOf(scanner.nextLine());
								
								if(cambio ==1) {
									System.out.println("Que Pokemon quieres cambiar(Indice de la posicion)?");
									Pokemon1 = Integer.valueOf(scanner.nextLine())-1;
									System.out.println("Que Pokemon quieres agregar(Indice de la posicion)?");
									Pokemon2 = Integer.valueOf(scanner.nextLine())-1;
									
									CambioPosicion(PokemonesEquipo, Pokemon1, Pokemon2);
									
									
								}
								if(cambio == 2) {
									System.out.println("Volviendo al menu");
									System.out.println();
								}
								
							}
							if(opcion == 4) {
								System.out.println("A cual Lider deseas retar??");
								System.out.println("");
								for(int j = 0; j  < 8; j++) {
									if(j < Gim.size()) {
										Gimnasios g = Gim.get(j);
										System.out.println(+g.getNG()+") "+g.getLider()+" - Estado: "+ g.getEstado());
										
									
										}
											
								}
								System.out.println("9)Volver al menu.");
								System.out.println("");
								System.out.print("Ingrese Opcion: ");
								int Lider = Integer.valueOf(scanner.nextLine())-1;
								if(Lider == 1) {
									System.out.println("Desafianda a EmmaLaArdillaRabiosa!!");
									for(Pokemon p:PokemonesEquipo) {
										
									}
									
										
								}
								
							}
							if(opcion == 5) {
								
							}
							if(opcion == 6) {
								
							}
							if(opcion ==7) {
								System.out.println("Volviendo al menu de entrada");
							}
							if(opcion ==8) {
								System.out.println("Nos vemos entrenador....");
								
								criterio = true;
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
	public static void CambioPosicion(ArrayList<Pokemon>Lista,int Pokemon1, int Pokemon2) {
		Pokemon temporal = Lista.get(Pokemon1);
		Lista.set(Pokemon1, Lista.get(Pokemon2));
		Lista.set(Pokemon2,temporal);
	}
	
	public static void Batalla(String MiNombre,ArrayList<Pokemon>MisPokemon,String NombreRival,ArrayList<Pokemon>PokemonRival) {
		int IM = 0; // IM = Indice Mio
		int IR = 0; // IR = Indice Rival
		int opcion = 0;
		double AtaqueFinal = 0; 
		
		ArrayList<Pokemon> EquipoOficial = new ArrayList<>();
		for(int j = 0; j  < 6; j++) {
			if(j < MisPokemon.size()) {
				Pokemon p = MisPokemon.get(j);
				EquipoOficial.add(p);
				}
					
		}
		
		Scanner scanner = new Scanner(System.in);
		
		while(IM < EquipoOficial.size() && IR < PokemonRival.size()) {
			Pokemon mipokemon = MisPokemon.get(IM);
			Pokemon pokemonRival = PokemonRival.get(IR);
			
			System.out.println(MiNombre+ " saca a "+mipokemon+"!");
			System.out.println(NombreRival+" saca a "+pokemonRival+"!");
			System.out.println("");
			System.out.println("Que deseas hacer?");
			System.out.println("1) Atacar");
			System.out.println("2) Cambiar de Pokemon");
			System.out.println("3) Rendirse");
			System.out.print("Ingrese Opcion: ");
			
			opcion = Integer.valueOf(scanner.nextLine());
			
			if(opcion == 1) {
				int misStats = EstadisticasTotales(mipokemon.getVida(), mipokemon.getAtaque(), mipokemon.getDefensa(), mipokemon.getAtaqueEspecial(), mipokemon.getDefensaEspecial(), mipokemon.getVelocidad());
				int statsRival = EstadisticasTotales(pokemonRival.getVida(), pokemonRival.getAtaque(), pokemonRival.getDefensa(), pokemonRival.getAtaqueEspecial(), pokemonRival.getDefensaEspecial(), pokemonRival.getVelocidad());
				System.out.println(mipokemon +" -> "+ misStats+" puntos");
				System.out.println(pokemonRival +" -> "+ statsRival+" puntos");
				
				double Ataque = TablaTipos.ObtenerEfectividad(mipokemon.getTipo(),pokemonRival.getTipo());
				
				if(Ataque == 0.5) {
					System.out.println(mipokemon+ " No es efectivo contra "+pokemonRival);
					AtaqueFinal = misStats * Ataque;
					System.out.println(mipokemon+ " -> "+(int)AtaqueFinal+" puntos");
					System.out.println(pokemonRival +" -> "+ statsRival+" puntos");
				}
				if(Ataque == 2.0) {
					System.out.println(mipokemon+ " Es muy efectivo contra "+pokemonRival);
					AtaqueFinal = misStats * Ataque;
					System.out.println(mipokemon+ " -> "+(int)AtaqueFinal+" puntos");
					System.out.println(pokemonRival +" -> "+ statsRival+" puntos");
				}
				
				if(AtaqueFinal > statsRival) {
					System.out.println("Ha Ganado "+mipokemon+"!"+" "+pokemonRival+ " ha sido derrotado!!");
					IR++;
				}
				if(AtaqueFinal < statsRival) {
					System.out.println("Ha Ganado "+pokemonRival+"!"+" "+mipokemon+ " ha sido derrotado...");
					Estado(EquipoOficial,mipokemon,false);
					IM++;
				}


			} // agregar opcion 2 y 3
			
			
		}
		if(IM>IR) {
			System.out.println("Haz Ganado el Combate Contra "+NombreRival);
			//hacer la agregacion de medalla al archivo
		}
		if(IM < IR) {
			System.out.println("Te has quedado sin pokemons en tu equipo!");
			System.out.println("Volviendo al menu...");
		}
		
		
	}
	public static void Estado(ArrayList<Pokemon> Equipo, Pokemon MiPokemon, boolean estado) {
	    try {
	        
	        File archivo = new File("Registros.txt");
	        Scanner lector = new Scanner(archivo);
	        ArrayList<String> Pokemons = new ArrayList<>();
	        
	        while (lector.hasNextLine()) {
	            Pokemons.add(lector.nextLine());
	        }
	        lector.close();
	        
	        
	        for (int i = 0; i < Pokemons.size(); i++) {
	            String[] partes = Pokemons.get(i).split(";");
	            if (partes[0].equals(MiPokemon.getPokemon())) {
	                Pokemons.set(i, MiPokemon.getPokemon() + ";Debilitado"); 
	            }
	        }
	        
	       
	        BufferedWriter escritor = new BufferedWriter(new FileWriter("Registros.txt", false));
	        for (String linea : Pokemons) {
	            escritor.write(linea);
	            escritor.newLine();
	        }
	        escritor.close();
	        
	    } catch (IOException e) {}
	}
	

}
