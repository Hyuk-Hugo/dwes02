package ControlDeFlujo;

import java.util.Scanner;

public class EjercicioInventadoPorMi {

	public static void main(String[] args) {
		Scanner teclado = null;
		double suma=0,media,contador=0;
		System.out.println("A continuacion se le va a pedir introducir 10 numeros");
		
	for(int i=1;i<=5;i++){
		System.out.println("introduce el numero, numero "+i);
		double num=(teclado=new Scanner(System.in)).nextDouble();
		suma=suma+num;
		contador=i;
	}
	media=suma/contador;
	System.out.println("La suma de los numeros es "+suma);
	System.out.println("La media de los numeros es "+media);

	}

}
