package ControlDeFlujo;

import java.util.Scanner;

public class PedirUnNumeroDel1Al10 {

	public static void main(String[] args) {
		
		
		Scanner teclado=null;
		int numero = 0;
		boolean valido=false;
		
		do{
			try{
				System.out.println("Introduce un un numero entre 1 y 10");
				numero=(teclado=new Scanner(System.in)).nextInt();
					if(numero>0&&numero<=10){
						valido=true;
				
				}
			}catch(Exception e){
				valido=false;
			}
		}while(!valido);
		System.out.println("Su numero es "+numero);

	}

}
