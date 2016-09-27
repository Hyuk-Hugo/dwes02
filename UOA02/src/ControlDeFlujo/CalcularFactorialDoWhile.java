package ControlDeFlujo;

import java.util.Scanner;

public class CalcularFactorialDoWhile {

	public static void main(String[] args) {
		
		Scanner teclado;
		double numero;
		double factorial=1;
		
		System.out.println("Introduce un numero del que quieras saber su factorial");
		numero=(teclado=new Scanner(System.in)).nextDouble();
		do{
			factorial=factorial*numero;
			numero--;
			
		}while(numero>0);
		System.out.println("El factorial es "+factorial);

	}

}
