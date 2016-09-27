package ControlDeFlujo;

import java.util.Scanner;

public class DiaSemanaLaborableONo {

	public static void main(String[] args) {
		

		
		System.out.println("Introduce un dia de la semana");
		Scanner teclado = new Scanner(System.in);
		String dia=teclado.next();
		
		switch(dia.toLowerCase()){
		
		case"lunes":;
		case"martes":;
		case"miercoles":;
		case"jueves":;
		case"viernes":System.out.println("Laborable");break;
		case"sabado":;	
		case"domingo":System.out.println("No es laborable."); ;break;
		
		default:System.out.println("No has escrito bien el dia");
		
		}
	}

}
