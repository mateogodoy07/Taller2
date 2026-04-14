//Integrante 1: Mateo Godoy Carrasco - 21924663-3 - mateogodoy07
//Carrera: Ingenieria Civil Industrial
//Link repositorio: https://github.com/mateogodoy07/Taller2.git.2222


package Package;

import java.util.Scanner;
import java.util.ArrayList;
import java.io.BufferedWriter;
import java.util.random.*;
public class Taller2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean criterio = false;
		do {
			System.out.println("1) Continuar.");
			System.out.println("2) Nueva Partida.");
			System.out.println("3) Salir.");
			
			int comando = Integer.valueOf(scanner.nextLine());
			
			if(comando == 1) {
				
			}
			if(comando == 2) {
				
			}
			if(comando==3) {
				criterio = true;
				System.out.println("Hasta Pronto.");
			}
			
		}while(!criterio);

	}

}
