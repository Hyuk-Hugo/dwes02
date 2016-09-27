package ControlDeFlujo;

import java.util.Scanner;

public class DecirLosNumerosQueTieneEseMes {

	public static void main(String[] args) {
		
		Scanner teclado=null;
		int numeroMes;
		int dias=0;
		String bisiesto;
		
		System.out.println("Escribe el numero de mes del que quieres saber su numero de dias");
		numeroMes=(teclado=new Scanner(System.in)).nextInt();
		System.out.println("¿El mes es bisiesto? contesta con si o no");
		bisiesto=(teclado=new Scanner(System.in)).next();
		
	switch(numeroMes){
	
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:dias=31;break;
		
		case 4:
		case 6:
		case 9:
		case 11:dias=30;break;
			
		case 2:if(bisiesto.equalsIgnoreCase("si")){
			dias=29;
		}else{
			dias=28;
		}
		default:System.out.println("Tiene que ser un mes entre 1 y 12");
	
	}System.out.println("El mes "+numeroMes+" tiene "+dias+" días");
	

	}

}
