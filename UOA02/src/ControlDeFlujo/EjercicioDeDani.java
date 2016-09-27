package ControlDeFlujo;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class EjercicioDeDani {

	public static void main(String[] args) {
		Scanner teclado = null;
		int sumaPares=0,sumaImpares=0,numero;
		
		do{
			System.out.println("Introduce un numero, si escribe 0 se mostraran los resultados");
		numero=(teclado=new Scanner(System.in)).nextInt();
		if(numero!=0){if(numero%2==0){
			sumaPares++;
		}else sumaImpares++;
			
		}	
		}while(numero!=0);
		System.out.println("Numeros impares introducidos = "+sumaImpares);
		System.out.println("Numeros pares introducidos = "+sumaPares);

	}

}
