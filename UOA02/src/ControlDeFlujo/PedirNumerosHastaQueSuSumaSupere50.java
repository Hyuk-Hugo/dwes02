package ControlDeFlujo;

import java.util.Scanner;

public class PedirNumerosHastaQueSuSumaSupere50 {

	public static void main(String[] args) {
		

		Scanner teclado = null;
		double suma=0;
		double numero;
		
		do{
			System.out.println("Escribe un numero para sumarlo");
			numero=(teclado=new Scanner(System.in)).nextDouble();
			suma=suma+numero;
		}while(suma<=50);
		System.out.println("La suma de todos los numeros que has introducido es "+suma);
	}

}
