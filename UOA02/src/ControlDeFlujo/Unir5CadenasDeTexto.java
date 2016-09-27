package ControlDeFlujo;

import java.util.Scanner;

public class Unir5CadenasDeTexto {
	
	public static void main(String[] args) {
		
		Scanner teclado = null;
		String cadenaFinal = "";
		String cadena;
		
		System.out.println("A continuacion va a introducir 5 cadenas de texto");
		
		for(int i=1;i<=5;i++){
		System.out.println("Intoduce la "+i+ "a");
		cadena=(teclado=new Scanner(System.in)).next();
		cadenaFinal=cadenaFinal+cadena;
		
		}
		System.out.println("Su cadena final es "+cadenaFinal);
	}
}
