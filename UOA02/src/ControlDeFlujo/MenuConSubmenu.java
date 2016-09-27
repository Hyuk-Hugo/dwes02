package ControlDeFlujo;

import java.util.Scanner;

public class MenuConSubmenu {

	public static void main(String[] args) {
		boolean volver=false;
		do {
		System.out.println("Seleccione la carrera a la que quieres acceder");
		
		System.out.println("1. Carrera a pie ");
		System.out.println("2. Carrera de sacos ");
		System.out.println("3. Carrera de cuchara con huevo");
		System.out.println("4. Carrera de bicis");
		System.out.println("5. Carrera por el gran Hugo");
		Scanner teclado = new Scanner(System.in);
		int opcion=teclado.nextInt();
		
		switch(opcion){
		case 1:  volver=eleccion("carrera a pie");break;
		case 2: volver=eleccion("carrera de sacos");break;
		case 3: volver=eleccion("Carrera de cuchara con huevo");break;
		case 4: volver=eleccion("Carrera de bicis");break;
		case 5: volver=eleccion("Carrera por el gran Hugo");break;
		}
		}while(volver);

	}
	public static boolean eleccion(String nombreDeCarrera){
		System.out.println(nombreDeCarrera.toUpperCase());
	
		System.out.println("1. apuntarse ");
		System.out.println("2. desapuntarse ");
		System.out.println("3. informacion");
		System.out.println("4. volver");
	
		Scanner teclado = new Scanner(System.in);
		int opcion=teclado.nextInt();
		switch(opcion){
		case 1: System.out.println("Se ha apuntado a la carrera "+nombreDeCarrera+" ¡Buena suerte!");break;
		case 2: System.out.println("Introduce tu nombre para borrarlo(no funciona todavía xD)");break;
		case 3: System.out.println("Es una "+nombreDeCarrera+", ¡no hagas trampas!");break;
		case 4: return true;
		}
		return false;
	}

}
