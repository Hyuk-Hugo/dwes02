package ControlDeFlujo;

import java.util.Scanner;

public class Pedir2NumerosYSumarle1AlMenor {

	public static void main(String[] args) {
		Scanner teclado=null;
		int numero1;
		int numero2;
		
		System.out.println("A continuacion se le va a pedir escribir 2 numeros del 1 al 10 para sumarle 1 unidad al menor hasta que sean iguales");
		System.out.println("Escribe el primer numero");
		numero1=(teclado=new Scanner(System.in)).nextInt();
		System.out.println("Escribe el segundo numero");
		numero2=(teclado=new Scanner(System.in)).nextInt();
		
		do{
		if(numero1>numero2){
			System.out.println("*");
			numero2++;
		}else{
			if(numero1<numero2){
				System.out.println("*");
				numero1++;
			}
		}
		
		}while(numero1!=numero2);
	}

}
